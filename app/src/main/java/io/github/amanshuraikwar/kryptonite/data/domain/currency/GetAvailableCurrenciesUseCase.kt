package io.github.amanshuraikwar.kryptonite.data.domain.currency

import io.github.amanshuraikwar.kryptonite.data.CurrencyRepository
import io.github.amanshuraikwar.kryptonite.data.domain.Currency
import io.github.amanshuraikwar.kryptonite.data.domain.UseCase
import javax.inject.Inject

/**
 * Use case to get available currencies.
 */
class GetAvailableCurrenciesUseCase @Inject constructor(
    private val currencyRepository: CurrencyRepository
) : UseCase<Unit, List<Currency>>() {

    override fun execute(parameters: Unit): List<Currency> {
        return currencyRepository.getAvailableCurrencies()
    }
}