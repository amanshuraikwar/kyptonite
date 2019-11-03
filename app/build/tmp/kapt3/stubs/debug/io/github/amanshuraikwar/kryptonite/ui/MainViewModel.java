package io.github.amanshuraikwar.kryptonite.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010 \u001a\u00020!J\u0016\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0011R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\f0\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\f0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R%\u0010\u001a\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u000f0\u000f0\u001b0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R%\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u00110\u00110\u001b0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017\u00a8\u0006%"}, d2 = {"Lio/github/amanshuraikwar/kryptonite/ui/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "getAvailableCurrenciesUseCase", "Lio/github/amanshuraikwar/kryptonite/data/domain/currency/GetAvailableCurrenciesUseCase;", "getExchangeRatesUseCase", "Lio/github/amanshuraikwar/kryptonite/data/domain/currency/GetExchangeRatesUseCase;", "(Lio/github/amanshuraikwar/kryptonite/data/domain/currency/GetAvailableCurrenciesUseCase;Lio/github/amanshuraikwar/kryptonite/data/domain/currency/GetExchangeRatesUseCase;)V", "_error", "Landroidx/lifecycle/MutableLiveData;", "Ljava/lang/Exception;", "_exchangeRateResult", "Lio/github/amanshuraikwar/kryptonite/data/domain/result/Result;", "", "Lio/github/amanshuraikwar/kryptonite/data/domain/CurrencyExchange;", "_loading", "", "_showSnackBar", "", "_supportedCurrenciesResult", "Lio/github/amanshuraikwar/kryptonite/data/domain/Currency;", "displayExchangeRates", "Landroidx/lifecycle/LiveData;", "getDisplayExchangeRates", "()Landroidx/lifecycle/LiveData;", "displaySupportedCurrencies", "getDisplaySupportedCurrencies", "loading", "Lio/github/amanshuraikwar/kryptonite/data/domain/result/Event;", "kotlin.jvm.PlatformType", "getLoading", "showSnackBar", "getShowSnackBar", "getSupportedCurrencies", "", "searchExchangeRates", "amount", "currencyCode", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _loading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<io.github.amanshuraikwar.kryptonite.data.domain.result.Event<java.lang.Boolean>> loading = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Exception> _error = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _showSnackBar = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<io.github.amanshuraikwar.kryptonite.data.domain.result.Event<java.lang.String>> showSnackBar = null;
    private final androidx.lifecycle.MutableLiveData<io.github.amanshuraikwar.kryptonite.data.domain.result.Result<java.util.List<io.github.amanshuraikwar.kryptonite.data.domain.Currency>>> _supportedCurrenciesResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<io.github.amanshuraikwar.kryptonite.data.domain.Currency>> displaySupportedCurrencies = null;
    private final androidx.lifecycle.MutableLiveData<io.github.amanshuraikwar.kryptonite.data.domain.result.Result<java.util.List<io.github.amanshuraikwar.kryptonite.data.domain.CurrencyExchange>>> _exchangeRateResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<io.github.amanshuraikwar.kryptonite.data.domain.CurrencyExchange>> displayExchangeRates = null;
    private final io.github.amanshuraikwar.kryptonite.data.domain.currency.GetAvailableCurrenciesUseCase getAvailableCurrenciesUseCase = null;
    private final io.github.amanshuraikwar.kryptonite.data.domain.currency.GetExchangeRatesUseCase getExchangeRatesUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<io.github.amanshuraikwar.kryptonite.data.domain.result.Event<java.lang.Boolean>> getLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<io.github.amanshuraikwar.kryptonite.data.domain.result.Event<java.lang.String>> getShowSnackBar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<io.github.amanshuraikwar.kryptonite.data.domain.Currency>> getDisplaySupportedCurrencies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<io.github.amanshuraikwar.kryptonite.data.domain.CurrencyExchange>> getDisplayExchangeRates() {
        return null;
    }
    
    public final void getSupportedCurrencies() {
    }
    
    public final void searchExchangeRates(@org.jetbrains.annotations.NotNull()
    java.lang.String amount, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode) {
    }
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    io.github.amanshuraikwar.kryptonite.data.domain.currency.GetAvailableCurrenciesUseCase getAvailableCurrenciesUseCase, @org.jetbrains.annotations.NotNull()
    io.github.amanshuraikwar.kryptonite.data.domain.currency.GetExchangeRatesUseCase getExchangeRatesUseCase) {
        super();
    }
}