package io.github.amanshuraikwar.kryptonite.data

import com.google.gson.JsonObject
import io.github.amanshuraikwar.kryptonite.BuildConfig
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

open class BaseApiResponse(
    val success: Boolean,
    val terms: String,
    val privacy: String,
    val error: Error? = null
)

class ListResponse(
    success: Boolean,
    terms: String,
    privacy: String,
    error: Error? = null,
    val currencies: JsonObject
) : BaseApiResponse(
    success,
    terms,
    privacy,
    error
)

class LiveResponse(
    success: Boolean,
    terms: String,
    privacy: String,
    error: Error? = null,
    val timestamp: Long,
    val source: String,
    val quotes: JsonObject
) : BaseApiResponse(
    success,
    terms,
    privacy,
    error
)

data class Error(
    val code: Int,
    val info: String
)