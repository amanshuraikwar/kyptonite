package io.github.amanshuraikwar.kryptonite.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00140\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\u00140\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R%\u0010\u0019\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u000f0\u000f0\u00140\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016\u00a8\u0006\""}, d2 = {"Lio/github/amanshuraikwar/kryptonite/ui/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "getSupportedCurrenciesUseCase", "Lio/github/amanshuraikwar/kryptonite/data/domain/currency/GetSupportedCurrenciesUseCase;", "getExchangeRatesUseCase", "Lio/github/amanshuraikwar/kryptonite/data/domain/currency/GetExchangeRatesUseCase;", "(Lio/github/amanshuraikwar/kryptonite/data/domain/currency/GetSupportedCurrenciesUseCase;Lio/github/amanshuraikwar/kryptonite/data/domain/currency/GetExchangeRatesUseCase;)V", "_error", "Landroidx/lifecycle/MutableLiveData;", "Ljava/lang/Exception;", "_exchangeRateResult", "Lio/github/amanshuraikwar/kryptonite/data/domain/result/Result;", "", "Lio/github/amanshuraikwar/kryptonite/data/CurrencyExchange;", "_loading", "", "_supportedCurrenciesResult", "Lio/github/amanshuraikwar/kryptonite/data/Currency;", "displayExchangeRates", "Landroidx/lifecycle/LiveData;", "Lio/github/amanshuraikwar/kryptonite/data/domain/result/Event;", "getDisplayExchangeRates", "()Landroidx/lifecycle/LiveData;", "displaySupportedCurrencies", "getDisplaySupportedCurrencies", "loading", "kotlin.jvm.PlatformType", "getLoading", "getSupportedCurrencies", "", "searchExchangeRates", "amount", "", "currencyCode", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _loading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<io.github.amanshuraikwar.kryptonite.data.domain.result.Event<java.lang.Boolean>> loading = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Exception> _error = null;
    private final androidx.lifecycle.MutableLiveData<io.github.amanshuraikwar.kryptonite.data.domain.result.Result<java.util.List<io.github.amanshuraikwar.kryptonite.data.Currency>>> _supportedCurrenciesResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<io.github.amanshuraikwar.kryptonite.data.domain.result.Event<java.util.List<io.github.amanshuraikwar.kryptonite.data.Currency>>> displaySupportedCurrencies = null;
    private final androidx.lifecycle.MutableLiveData<io.github.amanshuraikwar.kryptonite.data.domain.result.Result<java.util.List<io.github.amanshuraikwar.kryptonite.data.CurrencyExchange>>> _exchangeRateResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<io.github.amanshuraikwar.kryptonite.data.domain.result.Event<java.util.List<io.github.amanshuraikwar.kryptonite.data.CurrencyExchange>>> displayExchangeRates = null;
    private final io.github.amanshuraikwar.kryptonite.data.domain.currency.GetSupportedCurrenciesUseCase getSupportedCurrenciesUseCase = null;
    private final io.github.amanshuraikwar.kryptonite.data.domain.currency.GetExchangeRatesUseCase getExchangeRatesUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<io.github.amanshuraikwar.kryptonite.data.domain.result.Event<java.lang.Boolean>> getLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<io.github.amanshuraikwar.kryptonite.data.domain.result.Event<java.util.List<io.github.amanshuraikwar.kryptonite.data.Currency>>> getDisplaySupportedCurrencies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<io.github.amanshuraikwar.kryptonite.data.domain.result.Event<java.util.List<io.github.amanshuraikwar.kryptonite.data.CurrencyExchange>>> getDisplayExchangeRates() {
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
    io.github.amanshuraikwar.kryptonite.data.domain.currency.GetSupportedCurrenciesUseCase getSupportedCurrenciesUseCase, @org.jetbrains.annotations.NotNull()
    io.github.amanshuraikwar.kryptonite.data.domain.currency.GetExchangeRatesUseCase getExchangeRatesUseCase) {
        super();
    }
}