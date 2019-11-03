package io.github.amanshuraikwar.kryptonite.data

import io.github.amanshuraikwar.kryptonite.BuildConfig
import io.github.amanshuraikwar.kryptonite.data.domain.ListResponse
import io.github.amanshuraikwar.kryptonite.data.domain.LiveResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyLayerApi {

    @GET("list")
    fun getAvailableCurrencies(
        @Query("access_key") accessKey: String = BuildConfig.CURRENCY_LAYER_ACCESS_KEY
    ): Call<ListResponse>

    @GET("live")
    fun getExchangeRates(
        @Query("source") source: String,
        @Query("access_key") accessKey: String = BuildConfig.CURRENCY_LAYER_ACCESS_KEY
    ): Call<LiveResponse>
}