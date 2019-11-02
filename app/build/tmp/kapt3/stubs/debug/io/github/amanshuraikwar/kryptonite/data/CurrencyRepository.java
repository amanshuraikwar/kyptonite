package io.github.amanshuraikwar.kryptonite.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H&\u00a8\u0006\t"}, d2 = {"Lio/github/amanshuraikwar/kryptonite/data/CurrencyRepository;", "", "getExchangeRates", "", "Lio/github/amanshuraikwar/kryptonite/data/CurrencyExchange;", "source", "", "getSupportedCurrencies", "Lio/github/amanshuraikwar/kryptonite/data/Currency;", "app_debug"})
public abstract interface CurrencyRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.github.amanshuraikwar.kryptonite.data.Currency> getSupportedCurrencies();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.github.amanshuraikwar.kryptonite.data.CurrencyExchange> getExchangeRates(@org.jetbrains.annotations.NotNull()
    java.lang.String source);
}