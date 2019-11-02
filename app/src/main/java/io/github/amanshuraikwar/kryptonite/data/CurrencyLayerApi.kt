package io.github.amanshuraikwar.kryptonite.data

import com.google.gson.Gson
import com.google.gson.JsonObject
import okhttp3.Request
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyLayerApi {

    @GET("list")
    fun getAvailableCurrencies(): Call<ListResponse>

    @GET("live")
    fun getExchangeRates(
        @Query("source") source: String
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