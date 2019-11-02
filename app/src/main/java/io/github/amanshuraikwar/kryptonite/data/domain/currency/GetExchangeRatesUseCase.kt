package io.github.amanshuraikwar.kryptonite.data.domain.currency

import io.github.amanshuraikwar.kryptonite.data.CurrencyExchange
import io.github.amanshuraikwar.kryptonite.data.CurrencyRepository
import io.github.amanshuraikwar.kryptonite.data.domain.UseCase
import javax.inject.Inject

class GetExchangeRatesUseCase @Inject constructor(
    private val currencyRepository: CurrencyRepository
) : UseCase<String, List<CurrencyExchange>>() {

    override fun execute(parameters: String): List<CurrencyExchange> {
        return currencyRepository.getExchangeRates(parameters)
    }
}