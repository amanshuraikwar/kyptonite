package io.github.amanshuraikwar.kryptonite.data

import android.content.Context
import dagger.Module
import dagger.Provides
import io.github.amanshuraikwar.kryptonite.data.db.AppDatabase
import io.github.amanshuraikwar.kryptonite.data.domain.fake.FakeApi
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL = "http://apilayer.net/api/"

@Module
class DataModule {

    @Provides
    fun providesCurrencyRepository(api: CurrencyLayerApi,
                                   appDatabase: AppDatabase): CurrencyRepository {
        return CurrencyRepositoryImpl(api, appDatabase)
    }

    @Provides
    fun providesCurrencyLayerApi(okHttpClient: OkHttpClient): CurrencyLayerApi {

        val retrofit =
            Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build()

        return retrofit.create(CurrencyLayerApi::class.java)
//        return FakeApi()
    }

    @Provides
    fun getOkHttpClient(): OkHttpClient {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.HEADERS
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        val builder =
            OkHttpClient
                .Builder()
                .addInterceptor(interceptor)
                .addInterceptor(AuthHeaderInterceptor)
        return builder.build()
    }

    @Provides
    fun providesAppDatabase(context: Context): AppDatabase = AppDatabase.buildDatabase(context)

    object AuthHeaderInterceptor: Interceptor {

        override fun intercept(chain: Interceptor.Chain): Response {
            var request = chain.request()
            request =
                request
                    .newBuilder()
                    .addHeader("Content-Type", "application/json")
                    .build()
            return chain.proceed(request)
        }
    }
}

