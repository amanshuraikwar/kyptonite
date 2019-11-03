package io.github.amanshuraikwar.kryptonite.ui

import androidx.lifecycle.*
import io.github.amanshuraikwar.kryptonite.asEvent
import io.github.amanshuraikwar.kryptonite.combine
import io.github.amanshuraikwar.kryptonite.data.ApiException
import io.github.amanshuraikwar.kryptonite.data.Currency
import io.github.amanshuraikwar.kryptonite.data.CurrencyExchange
import io.github.amanshuraikwar.kryptonite.data.domain.currency.GetExchangeRatesUseCase
import io.github.amanshuraikwar.kryptonite.data.domain.currency.GetSupportedCurrenciesUseCase
import java.lang.Exception
import javax.inject.Inject
import io.github.amanshuraikwar.kryptonite.data.domain.result.Result
import io.github.amanshuraikwar.kryptonite.handleResult


class MainViewModel @Inject constructor(
    private val getSupportedCurrenciesUseCase: GetSupportedCurrenciesUseCase,
    private val getExchangeRatesUseCase: GetExchangeRatesUseCase
) : ViewModel() {

    private val _loading = MutableLiveData<Boolean>()
    val loading = _loading.map { it }.asEvent()

    private val _error = MutableLiveData<Exception>()
    private val _showSnackBar = MutableLiveData<String>()
    val showSnackBar =
        combine(
            _error,
            {
                if (it is ApiException) "${it.code} : ${it.message}"
                else "${it.message}"
            },
            _showSnackBar,
            { x -> x }
        ).asEvent()

    private val _supportedCurrenciesResult = MutableLiveData<Result<List<Currency>>>()
    val displaySupportedCurrencies =
        _supportedCurrenciesResult.handleResult(_error, _loading)

    private val _exchangeRateResult = MutableLiveData<Result<List<CurrencyExchange>>>()
    val displayExchangeRates = _exchangeRateResult.handleResult(_error, _loading)

    init {
        getSupportedCurrencies()
    }

    fun getSupportedCurrencies() {
        getSupportedCurrenciesUseCase(Unit, _supportedCurrenciesResult)
    }

    fun searchExchangeRates(amount: String, currencyCode: String) {
        getExchangeRatesUseCase(currencyCode, _exchangeRateResult)
    }
}