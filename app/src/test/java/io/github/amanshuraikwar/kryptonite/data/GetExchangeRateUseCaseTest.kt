package io.github.amanshuraikwar.kryptonite.data

import io.github.amanshuraikwar.kryptonite.FakeApi
import io.github.amanshuraikwar.kryptonite.DbWithAvailableCurrencies
import io.github.amanshuraikwar.kryptonite.DbWithAvailableCurrenciesAndExchangeRates
import io.github.amanshuraikwar.kryptonite.data.domain.CurrencyExchange
import io.github.amanshuraikwar.kryptonite.data.domain.currency.GetExchangeRatesUseCase
import io.github.amanshuraikwar.kryptonite.data.domain.result.successOr
import org.junit.Assert.assertEquals
import org.junit.Test
import org.threeten.bp.OffsetDateTime

class GetExchangeRateUseCaseTest {

    @Test
    fun emptyDbTest() {

        val useCase =
            GetExchangeRatesUseCase(
                CurrencyRepositoryImpl(
                    FakeApi(),
                    DbWithAvailableCurrencies()
                )
            )

        val result = useCase.executeNow("USD")

        println(result)

        assertEquals(
            listOf(
                CurrencyExchange(
                    "ALL",
                    "Albanian Lek",
                    "USD",
                    3.672982f,
                    OffsetDateTime.now()
                ),
                CurrencyExchange(
                    "AMD",
                    "Armenian Dram",
                    "USD",
                    57.8936f,
                    OffsetDateTime.now()
                )
            ),
            result.successOr(null)
        )
    }

    @Test
    fun nonEmptyDbWithRecentExchangeRatesTest() {

        val now = OffsetDateTime.now()

        val useCase =
            GetExchangeRatesUseCase(
                CurrencyRepositoryImpl(
                    FakeApi(),
                    DbWithAvailableCurrenciesAndExchangeRates(now)
                )
            )

        val result = useCase.executeNow("USD")

        println(result)

        assertEquals(
            listOf(
                CurrencyExchange(
                    "ALL",
                    "Albanian Lek",
                    "USD",
                    4.23f,
                    now
                ),
                CurrencyExchange(
                    "AMD",
                    "Armenian Dram",
                    "USD",
                    5.2398f,
                    now
                )
            ),
            result.successOr(null)
        )
    }

    @Test
    fun nonEmptyDbWith31MinsOldExchangeRatesTest() {

        val now = OffsetDateTime.now().minusMinutes(31)

        val useCase =
            GetExchangeRatesUseCase(
                CurrencyRepositoryImpl(
                    FakeApi(),
                    DbWithAvailableCurrenciesAndExchangeRates(now)
                )
            )

        val result = useCase.executeNow("USD")

        println(result)

        // checking if they are from the api call
        assertEquals(
            listOf(
                CurrencyExchange(
                    "ALL",
                    "Albanian Lek",
                    "USD",
                    3.672982f,
                    OffsetDateTime.now()
                ),
                CurrencyExchange(
                    "AMD",
                    "Armenian Dram",
                    "USD",
                    57.8936f,
                    OffsetDateTime.now()
                )
            ),
            result.successOr(null)
        )
    }

    @Test
    fun nonEmptyDbWith25MinsOldExchangeRatesTest() {

        val now = OffsetDateTime.now().minusMinutes(25)

        val useCase =
            GetExchangeRatesUseCase(
                CurrencyRepositoryImpl(
                    FakeApi(),
                    DbWithAvailableCurrenciesAndExchangeRates(now)
                )
            )

        val result = useCase.executeNow("USD")

        println(result)

        // checking if they are from the db
        assertEquals(
            listOf(
                CurrencyExchange(
                    "ALL",
                    "Albanian Lek",
                    "USD",
                    4.23f,
                    OffsetDateTime.now()
                ),
                CurrencyExchange(
                    "AMD",
                    "Armenian Dram",
                    "USD",
                    5.2398f,
                    OffsetDateTime.now()
                )
            ),
            result.successOr(null)
        )
    }
}