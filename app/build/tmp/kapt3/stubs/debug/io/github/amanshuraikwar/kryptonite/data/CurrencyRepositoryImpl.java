package io.github.amanshuraikwar.kryptonite.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lio/github/amanshuraikwar/kryptonite/data/CurrencyRepositoryImpl;", "Lio/github/amanshuraikwar/kryptonite/data/CurrencyRepository;", "api", "Lio/github/amanshuraikwar/kryptonite/data/CurrencyLayerApi;", "appDatabase", "Lio/github/amanshuraikwar/kryptonite/data/db/AppDatabase;", "availableCurrencyDao", "Lio/github/amanshuraikwar/kryptonite/data/db/AvailableCurrencyDao;", "exchangeRateDao", "Lio/github/amanshuraikwar/kryptonite/data/db/ExchangeRateDao;", "(Lio/github/amanshuraikwar/kryptonite/data/CurrencyLayerApi;Lio/github/amanshuraikwar/kryptonite/data/db/AppDatabase;Lio/github/amanshuraikwar/kryptonite/data/db/AvailableCurrencyDao;Lio/github/amanshuraikwar/kryptonite/data/db/ExchangeRateDao;)V", "fetchAndStoreExchangeRates", "", "Lio/github/amanshuraikwar/kryptonite/data/db/ExchangeRateEntity;", "source", "", "getExchangeRates", "Lio/github/amanshuraikwar/kryptonite/data/CurrencyExchange;", "getSupportedCurrencies", "Lio/github/amanshuraikwar/kryptonite/data/Currency;", "app_debug"})
public final class CurrencyRepositoryImpl implements io.github.amanshuraikwar.kryptonite.data.CurrencyRepository {
    private final io.github.amanshuraikwar.kryptonite.data.CurrencyLayerApi api = null;
    private final io.github.amanshuraikwar.kryptonite.data.db.AvailableCurrencyDao availableCurrencyDao = null;
    private final io.github.amanshuraikwar.kryptonite.data.db.ExchangeRateDao exchangeRateDao = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.github.amanshuraikwar.kryptonite.data.Currency> getSupportedCurrencies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.github.amanshuraikwar.kryptonite.data.CurrencyExchange> getExchangeRates(@org.jetbrains.annotations.NotNull()
    java.lang.String source) {
        return null;
    }
    
    private final java.util.List<io.github.amanshuraikwar.kryptonite.data.db.ExchangeRateEntity> fetchAndStoreExchangeRates(java.lang.String source) {
        return null;
    }
    
    @javax.inject.Inject()
    public CurrencyRepositoryImpl(@org.jetbrains.annotations.NotNull()
    io.github.amanshuraikwar.kryptonite.data.CurrencyLayerApi api, @org.jetbrains.annotations.NotNull()
    io.github.amanshuraikwar.kryptonite.data.db.AppDatabase appDatabase, @org.jetbrains.annotations.NotNull()
    io.github.amanshuraikwar.kryptonite.data.db.AvailableCurrencyDao availableCurrencyDao, @org.jetbrains.annotations.NotNull()
    io.github.amanshuraikwar.kryptonite.data.db.ExchangeRateDao exchangeRateDao) {
        super();
    }
}