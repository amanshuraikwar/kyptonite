package io.github.amanshuraikwar.kryptonite.data

import io.github.amanshuraikwar.kryptonite.FakeApi
import io.github.amanshuraikwar.kryptonite.DbWithAvailableCurrencies
import io.github.amanshuraikwar.kryptonite.DbWithAvailableCurrenciesAndExchangeRates
import io.github.amanshuraikwar.kryptonite.EmptyDatabase
import io.github.amanshuraikwar.kryptonite.data.domain.CurrencyExchange
import io.github.amanshuraikwar.kryptonite.data.domain.currency.GetExchangeRatesUseCase
import io.github.amanshuraikwar.kryptonite.data.domain.result.successOr
import org.junit.Assert.assertEquals
import org.junit.Test
import org.threeten.bp.OffsetDateTime

class GetExchangeRateUseCaseTest {

    @Test
    fun emptyDb_fetchAllFromApi_Test() {

        val useCase =
            GetExchangeRatesUseCase(
                CurrencyRepositoryImpl(
                    FakeApi(),
                    EmptyDatabase()
                )
            )

        val result = useCase.executeNow("AED")

        println(result)

        assertEquals(
            listOf(
                CurrencyExchange(
                    "AED",
                    "United Arab Emirates Dirham",
                    "AED",
                    1.0f,
                    OffsetDateTime.now()
                ),
                CurrencyExchange(
                    "AFN",
                    "Afghan Afghani",
                    "AED",
                    1.4999999f,
                    OffsetDateTime.now()
                )
            ),
            result.successOr(null)
        )
    }

    @Test
    fun dbWithAvailableCurrencies_fetchExchangeRatesFromApi_Test() {

        val useCase =
            GetExchangeRatesUseCase(
                CurrencyRepositoryImpl(
                    FakeApi(),
                    DbWithAvailableCurrencies()
                )
            )

        val result = useCase.executeNow("AED")

        println(result)

        assertEquals(
            listOf(
                CurrencyExchange(
                    "AED",
                    "United Arab Emirates Dirham DB",
                    "AED",
                    1.0f,
                    OffsetDateTime.now()
                ),
                CurrencyExchange(
                    "AFN",
                    "Afghan Afghani DB",
                    "AED",
                    1.4999999f,
                    OffsetDateTime.now()
                )
            ),
            result.successOr(null)
        )
    }

    @Test
    fun dbWithRecentExchangeRatesAndAvailableCurencies_Test() {

        val now = OffsetDateTime.now()

        val useCase =
            GetExchangeRatesUseCase(
                CurrencyRepositoryImpl(
                    FakeApi(),
                    DbWithAvailableCurrenciesAndExchangeRates(now)
                )
            )

        val result = useCase.executeNow("AED")

        println(result)

        assertEquals(
            listOf(
                CurrencyExchange(
                    "AED",
                    "United Arab Emirates Dirham DB",
                    "AED",
                    1.0f,
                    now
                ),
                CurrencyExchange(
                    "AFN",
                    "Afghan Afghani DB",
                    "AED",
                    1.2387234f,
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

        val result = useCase.executeNow("AED")

        println(result)

        // checking if they are from the api call
        assertEquals(
            listOf(
                CurrencyExchange(
                    "AED",
                    "United Arab Emirates Dirham DB",
                    "AED",
                    1.0f,
                    OffsetDateTime.now()
                ),
                CurrencyExchange(
                    "AFN",
                    "Afghan Afghani DB",
                    "AED",
                    1.4999999f,
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

        val result = useCase.executeNow("AED")

        println(result)

        // checking if they are from the db
        assertEquals(
            listOf(
                CurrencyExchange(
                    "AED",
                    "United Arab Emirates Dirham DB",
                    "AED",
                    1.0f,
                    now
                ),
                CurrencyExchange(
                    "AFN",
                    "Afghan Afghani DB",
                    "AED",
                    1.2387234f,
                    now
                )
            ),
            result.successOr(null)
        )
    }
}