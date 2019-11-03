package io.github.amanshuraikwar.kryptonite.data.domain.fake;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\f"}, d2 = {"Lio/github/amanshuraikwar/kryptonite/data/domain/fake/FakeApi;", "Lio/github/amanshuraikwar/kryptonite/data/CurrencyLayerApi;", "()V", "getAvailableCurrencies", "Lretrofit2/Call;", "Lio/github/amanshuraikwar/kryptonite/data/ListResponse;", "accessKey", "", "getExchangeRates", "Lio/github/amanshuraikwar/kryptonite/data/LiveResponse;", "source", "FakeCall", "app_debug"})
public final class FakeApi implements io.github.amanshuraikwar.kryptonite.data.CurrencyLayerApi {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public retrofit2.Call<io.github.amanshuraikwar.kryptonite.data.ListResponse> getAvailableCurrencies(@org.jetbrains.annotations.NotNull()
    java.lang.String accessKey) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public retrofit2.Call<io.github.amanshuraikwar.kryptonite.data.LiveResponse> getExchangeRates(@org.jetbrains.annotations.NotNull()
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    java.lang.String accessKey) {
        return null;
    }
    
    public FakeApi() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u0016\u0010\t\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0010\u0010\u0003\u001a\u00028\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0005\u00a8\u0006\u0013"}, d2 = {"Lio/github/amanshuraikwar/kryptonite/data/domain/fake/FakeApi$FakeCall;", "T", "Lretrofit2/Call;", "body", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "cancel", "", "clone", "enqueue", "callback", "Lretrofit2/Callback;", "execute", "Lretrofit2/Response;", "isCanceled", "", "isExecuted", "request", "Lokhttp3/Request;", "app_debug"})
    public static final class FakeCall<T extends java.lang.Object> implements retrofit2.Call<T> {
        private final T body = null;
        
        @java.lang.Override()
        public void enqueue(@org.jetbrains.annotations.NotNull()
        retrofit2.Callback<T> callback) {
        }
        
        @java.lang.Override()
        public boolean isExecuted() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public io.github.amanshuraikwar.kryptonite.data.domain.fake.FakeApi.FakeCall<T> clone() {
            return null;
        }
        
        @java.lang.Override()
        public boolean isCanceled() {
            return false;
        }
        
        @java.lang.Override()
        public void cancel() {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public retrofit2.Response<T> execute() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public okhttp3.Request request() {
            return null;
        }
        
        public FakeCall(T body) {
            super();
        }
    }
}