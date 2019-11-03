package io.github.amanshuraikwar.kryptonite.data

import com.google.gson.JsonObject
import io.github.amanshuraikwar.kryptonite.data.db.*
import org.threeten.bp.Instant
import org.threeten.bp.OffsetDateTime
import org.threeten.bp.ZoneId
import org.threeten.bp.temporal.ChronoUnit
import retrofit2.Response
import java.lang.Exception
import javax.inject.Inject

interface CurrencyRepository {
    fun getSupportedCurrencies(): List<Currency>
    fun getExchangeRates(source: String): List<CurrencyExchange>
}

class CurrencyRepositoryImpl @Inject constructor(
    private val api: CurrencyLayerApi,
    appDatabase: AppDatabase,
    private val availableCurrencyDao: AvailableCurrencyDao = appDatabase.availableCurrencyDao(),
    private val exchangeRateDao: ExchangeRateDao = appDatabase.exchangeRateDao()
) : CurrencyRepository {

    override fun getSupportedCurrencies(): List<Currency> {

        val localAvailableCurrencies = availableCurrencyDao.getAll()

        if (localAvailableCurrencies.isEmpty()) {

            val currencies: List<Currency> =
                api
                    .getAvailableCurrencies()
                    .execute()
                    .data { it.currencies.asCurrencyList() }

            availableCurrencyDao.insertAll(
                currencies.map { AvailableCurrencyEntity(it.code, it.name) }
            )

            return currencies

        } else {
            return localAvailableCurrencies.map { Currency(it.code, it.name) }
        }
    }

    override fun getExchangeRates(source: String): List<CurrencyExchange> {

        val localAvailableCurrencies = availableCurrencyDao.getAll()

        if (localAvailableCurrencies.isEmpty()) {
            throw Exception("Local available currency is empty!")
        }

        val currencyCodeNameMap =
            localAvailableCurrencies.groupBy { it.code }.mapValues { it.value[0].name }

        val localExchangeRates = exchangeRateDao.getFor(source)
        val curDateTime = OffsetDateTime.now()

        if (localExchangeRates.isEmpty()) {

            return fetchAndStoreExchangeRates(source, curDateTime)
                .map {
                    CurrencyExchange(
                        it.currencyCode,
                        currencyCodeNameMap[it.currencyCode]
                            ?: throw Exception("Invalid Currency ${it.currencyCode} not available."),
                        it.sourceCurrencyCode,
                        it.exchangeRate,
                        it.lastUpdated
                    )
                }

        } else {

            val minutesDiff =
                localExchangeRates[0]
                    .lastUpdated
                    .until(curDateTime, ChronoUnit.MINUTES)

            if (minutesDiff > 30) {

                exchangeRateDao.deleteAll(localExchangeRates)

                return fetchAndStoreExchangeRates(source, curDateTime)
                    .map {
                        CurrencyExchange(
                            it.currencyCode,
                            currencyCodeNameMap[it.currencyCode]
                                ?: throw Exception("Invalid Currency."),
                            it.sourceCurrencyCode,
                            it.exchangeRate,
                            it.lastUpdated
                        )
                    }

            } else {
                return localExchangeRates.map {
                    CurrencyExchange(
                        it.currencyCode,
                        currencyCodeNameMap[it.currencyCode]
                            ?: throw Exception("Invalid Currency."),
                        it.sourceCurrencyCode,
                        it.exchangeRate,
                        it.lastUpdated
                    )
                }
            }
        }
    }

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

fun JsonObject.asCurrencyList(): List<Currency> {
    return this.entrySet().map {
        Currency(
            it.key,
            it.value.asString
        )
    }
}

fun JsonObject.asExchangeList(): List<Exchange> {
    return this.entrySet().map {
        Exchange(
            it.key.substring(0..2),
            it.key.substring(3..5),
            it.value.asFloat
        )
    }
}

inline fun <T : BaseApiResponse, reified D> Response<T>.data(map: (T) -> D): D {
    if (this.isSuccessful) {
        this.body()?.let {
            if (it.success) {
                return map.invoke(it)
            } else {
                throw ApiException(
                    it.error?.code ?: 333, it.error?.info ?: "Something went wrong!"
                )
            }
        } ?: throw ApiException()
    } else {
        throw ApiException()
    }
}

class ApiException(
    val code: Int = 333,
    msg: String = "Something went wrong!"
) : Exception(msg)

open class Currency(
    val code: String,
    val name: String
) {
    override fun toString(): String {
        return "Currency(code='$code', name='$name')"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Currency) return false

        if (code != other.code) return false
        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        var result = code.hashCode()
        result = 31 * result + name.hashCode()
        return result
    }


}

class Exchange(
    val sourceCode: String,
    val code: String,
    val rate: Float
)

class CurrencyExchange(
    code: String,
    name: String,
    val source: String,
    val exchangeRate: Float,
    val lastUpdated: OffsetDateTime
) : Currency(
    code,
    name
) {
    override fun toString(): String {
        return "CurrencyExchange(source='$source', exchangeRate=$exchangeRate, lastUpdated=$lastUpdated) ${super.toString()}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CurrencyExchange) return false
        if (!super.equals(other)) return false

        if (source != other.source) return false
        if (exchangeRate != other.exchangeRate) return false
        //if (lastUpdated != other.lastUpdated) return false

        return true
    }

    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + source.hashCode()
        result = 31 * result + exchangeRate.hashCode()
        //result = 31 * result + lastUpdated.hashCode()
        return result
    }


}