package io.github.amanshuraikwar.kryptonite.data

import io.github.amanshuraikwar.kryptonite.FakeApi
import io.github.amanshuraikwar.kryptonite.EmptyDatabase
import io.github.amanshuraikwar.kryptonite.DbWithAvailableCurrencies
import io.github.amanshuraikwar.kryptonite.data.db.AvailableCurrencyEntity
import io.github.amanshuraikwar.kryptonite.data.domain.Currency
import io.github.amanshuraikwar.kryptonite.data.domain.currency.GetAvailableCurrenciesUseCase
import io.github.amanshuraikwar.kryptonite.data.domain.result.succeeded
import io.github.amanshuraikwar.kryptonite.data.domain.result.successOr
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class GetSupportedCurrenciesUseCaseTest {

    @Test
    fun emptyDb_fetchedFromApi_Test() {

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
                Currency("AFN", "Afghan Afghani"),
                Currency("USD", "United States Dollar")
            ),
            result.successOr(null)
        )
    }

    @Test
    fun nonEmptyDb_fetchedFromDb_Test() {

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
                Currency("SSP", "South Sudanese pound DB"),
                Currency("AED", "United Arab Emirates Dirham DB"),
                Currency("AFN", "Afghan Afghani DB"),
                Currency("USD", "United States Dollar DB")
            ),
            result.successOr(null)
        )
    }
}