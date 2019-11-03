package io.github.amanshuraikwar.kryptonite.data

import io.github.amanshuraikwar.kryptonite.FakeApi
import io.github.amanshuraikwar.kryptonite.EmptyDatabase
import io.github.amanshuraikwar.kryptonite.DbWithAvailableCurrencies
import io.github.amanshuraikwar.kryptonite.data.domain.Currency
import io.github.amanshuraikwar.kryptonite.data.domain.currency.GetAvailableCurrenciesUseCase
import io.github.amanshuraikwar.kryptonite.data.domain.result.succeeded
import io.github.amanshuraikwar.kryptonite.data.domain.result.successOr
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class GetSupportedCurrenciesUseCaseTest {

    @Test
    fun emptyDbTest() {

        val userCase = GetAvailableCurrenciesUseCase(
            CurrencyRepositoryImpl(
                FakeApi(),
                EmptyDatabase()
            )
        )

        val result = userCase.executeNow(Unit)

        println(result)

        assertTrue(result.succeeded)

        assertEquals(
            listOf(
                Currency("SSP", "South Sudanese pound"),
                Currency("AED", "United Arab Emirates Dirham"),
                Currency("AFN", "Afghan Afghani")
            ),
            result.successOr(null)
        )
    }

    @Test
    fun nonEmptyDbTest() {

        val userCase = GetAvailableCurrenciesUseCase(
            CurrencyRepositoryImpl(
                FakeApi(),
                DbWithAvailableCurrencies()
            )
        )

        val result = userCase.executeNow(Unit)

        println(result)

        assertTrue(result.succeeded)

        assertEquals(
            listOf(
                Currency("ALL", "Albanian Lek"),
                Currency("AMD", "Armenian Dram")
            ),
            result.successOr(null)
        )
    }
}