package io.github.amanshuraikwar.kryptonite.data

import io.github.amanshuraikwar.kryptonite.*
import io.github.amanshuraikwar.kryptonite.data.db.*
import io.github.amanshuraikwar.kryptonite.data.domain.Currency
import io.github.amanshuraikwar.kryptonite.data.domain.CurrencyExchange
import org.threeten.bp.OffsetDateTime
import org.threeten.bp.temporal.ChronoUnit
import java.lang.Exception
import javax.inject.Inject

interface CurrencyRepository {

    /**
     * Get all the supported currencies, remote + local.
     */
    fun getAvailableCurrencies(): List<Currency>

    /**
     * Get exchange rates for the source currency.
     */
    fun getExchangeRates(source: String): List<CurrencyExchange>
}

//region Local only supported currencies

// todo: can be moved to local DB

private val LOCAL_ONLY_SUPPORTED_CURRENCY_CODES = setOf("SSP")

private val LOCAL_ONLY_SUPPORTED_CURRENCIES = listOf(
    Currency("SSP", "South Sudanese pound")
)

// 1 * Key = Value USD
// For eg: 1 SSP = 0.0076769538 USD
private val LOCAL_ONLY_EXCHANGE_RATES = mapOf(Pair("SSP", 0.0076769538f))

//endregion

private const val EXCHANGE_RATE_EXPIRY_TIME = 30 // Minutes

private const val MEDIATOR_CURRENCY = "USD"

class CurrencyRepositoryImpl @Inject constructor(
    private val api: CurrencyLayerApi,
    appDatabase: AppDatabase,
    private val availableCurrencyDao: AvailableCurrencyDao = appDatabase.availableCurrencyDao(),
    private val exchangeRateDao: ExchangeRateDao = appDatabase.exchangeRateDao()
) : CurrencyRepository {

    override fun getAvailableCurrencies(): List<Currency> {

        val localAvailableCurrencies = availableCurrencyDao.getAll()

        // fetch from remote only if not available locally
        // todo: what if the supported currencies change?

        if (localAvailableCurrencies.isEmpty()) {

            val currencies = LOCAL_ONLY_SUPPORTED_CURRENCIES.toMutableList()

            currencies.addAll(
                api
                    .getAvailableCurrencies()
                    .execute()
                    .data {
                        it.currencies.asCurrencyList()
                    }
            )

            availableCurrencyDao.insertAll(
                mutableListOf<AvailableCurrencyEntity>().apply {
                    addAll(
                        currencies.map {
                            AvailableCurrencyEntity(it.code, it.name)
                        }
                    )
                }
            )

            return currencies

        } else {
            return localAvailableCurrencies.map { Currency(it.code, it.name) }
        }
    }

    override fun getExchangeRates(source: String): List<CurrencyExchange> {

        // fetch available currencies
        // throw exception if none available

        val localAvailableCurrencies = availableCurrencyDao.getAll()

        if (localAvailableCurrencies.isEmpty()) {
            throw InvalidDbStateException("Local available currencies is empty.")
        }

        val currencyCodeNameMap =
            localAvailableCurrencies.groupBy { it.code }.mapValues { it.value[0].name }

        // check if currency is available

        if (!currencyCodeNameMap.containsKey(source)) {
            throw InvalidDbStateException("Invalid currency $source not supported.")
        }

        // check if the source currency is supported local only

        if (LOCAL_ONLY_SUPPORTED_CURRENCY_CODES.contains(source)) {

            val sourceToUsdExchangeRate =
                LOCAL_ONLY_EXCHANGE_RATES[source]
                    ?: throw InvalidDbStateException(
                        "Exchange rate for $source not available locally!"
                    )

            // get exchange rate for MEDIATOR_CURRENCY instead (recursively)
            // and multiply rates accordingly

            // todo: what if MEDIATOR_CURRENCY is only available locally
            //  or not available at all?

            return getExchangeRates(MEDIATOR_CURRENCY).map {
                it.convert(source) { rate -> rate * sourceToUsdExchangeRate }
            }

        } else {

            val localExchangeRates = exchangeRateDao.getFor(source)
            val curDateTime = OffsetDateTime.now()

            // check if exchange rates are available locally

            if (localExchangeRates.isEmpty()) {

                return fetchAndStoreExchangeRates(source, curDateTime)
                    .map {
                        it.asCurrencyExchange(currencyCodeNameMap)
                    }

            } else {

                // check if the local exchange rates are within the expiry time

                val minutesDiff =
                    localExchangeRates[0]
                        .lastUpdated
                        .until(curDateTime, ChronoUnit.MINUTES)

                return if (minutesDiff > EXCHANGE_RATE_EXPIRY_TIME) {

                    // delete older exchange rates
                    exchangeRateDao.deleteAll(localExchangeRates)

                    fetchAndStoreExchangeRates(source, curDateTime)
                        .map {
                            it.asCurrencyExchange(currencyCodeNameMap)
                        }

                } else {
                    localExchangeRates.map {
                        it.asCurrencyExchange(currencyCodeNameMap)
                    }
                }
            }
        }
    }

    /**
     * Fetches exchange rated from remote and stores them locally while returning the same.
     */
    private fun fetchAndStoreExchangeRates(
        source: String,
        curDateTime: OffsetDateTime
    ): List<ExchangeRateEntity> {

        val fetchedExchangeRates: List<ExchangeRateEntity> =
            api
                .getExchangeRates(source)
                .execute()
                .data { response ->
                    val exchangeList = response.quotes.asExchangeList()
                    exchangeList.map {
                        ExchangeRateEntity(
                            sourceCurrencyCode = it.sourceCode,
                            currencyCode = it.code,
                            exchangeRate = it.rate,
                            lastUpdated = curDateTime
                        )
                    }
                }

        exchangeRateDao.insertAll(fetchedExchangeRates)

        return fetchedExchangeRates
    }
}

class InvalidDbStateException(
    msg: String = "Invalid local db!"
) : Exception(msg)

class ApiException(
    val code: Int = 333,
    msg: String = "Something went wrong!"
) : Exception(msg)