package io.github.amanshuraikwar.kryptonite.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006H\'J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0003\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\n"}, d2 = {"Lio/github/amanshuraikwar/kryptonite/data/CurrencyLayerApi;", "", "getAvailableCurrencies", "Lretrofit2/Call;", "Lio/github/amanshuraikwar/kryptonite/data/ListResponse;", "accessKey", "", "getExchangeRates", "Lio/github/amanshuraikwar/kryptonite/data/LiveResponse;", "source", "app_debug"})
public abstract interface CurrencyLayerApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "list")
    public abstract retrofit2.Call<io.github.amanshuraikwar.kryptonite.data.ListResponse> getAvailableCurrencies(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "access_key")
    java.lang.String accessKey);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "live")
    public abstract retrofit2.Call<io.github.amanshuraikwar.kryptonite.data.LiveResponse> getExchangeRates(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "source")
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "access_key")
    java.lang.String accessKey);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}