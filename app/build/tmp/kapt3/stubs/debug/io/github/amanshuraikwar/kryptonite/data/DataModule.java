package io.github.amanshuraikwar.kryptonite.data;

import java.lang.System;

/**
 * Provides data related dependencies.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0006H\u0007\u00a8\u0006\u0011"}, d2 = {"Lio/github/amanshuraikwar/kryptonite/data/DataModule;", "", "()V", "getOkHttpClient", "Lokhttp3/OkHttpClient;", "providesAppDatabase", "Lio/github/amanshuraikwar/kryptonite/data/db/AppDatabase;", "context", "Landroid/content/Context;", "providesCurrencyLayerApi", "Lio/github/amanshuraikwar/kryptonite/data/CurrencyLayerApi;", "okHttpClient", "providesCurrencyRepository", "Lio/github/amanshuraikwar/kryptonite/data/CurrencyRepository;", "api", "appDatabase", "AuthHeaderInterceptor", "app_debug"})
@dagger.Module()
public final class DataModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final io.github.amanshuraikwar.kryptonite.data.CurrencyRepository providesCurrencyRepository(@org.jetbrains.annotations.NotNull()
    io.github.amanshuraikwar.kryptonite.data.CurrencyLayerApi api, @org.jetbrains.annotations.NotNull()
    io.github.amanshuraikwar.kryptonite.data.db.AppDatabase appDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final io.github.amanshuraikwar.kryptonite.data.CurrencyLayerApi providesCurrencyLayerApi(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final okhttp3.OkHttpClient getOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final io.github.amanshuraikwar.kryptonite.data.db.AppDatabase providesAppDatabase(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public DataModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lio/github/amanshuraikwar/kryptonite/data/DataModule$AuthHeaderInterceptor;", "Lokhttp3/Interceptor;", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "app_debug"})
    public static final class AuthHeaderInterceptor implements okhttp3.Interceptor {
        public static final io.github.amanshuraikwar.kryptonite.data.DataModule.AuthHeaderInterceptor INSTANCE = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
        okhttp3.Interceptor.Chain chain) {
            return null;
        }
        
        private AuthHeaderInterceptor() {
            super();
        }
    }
}