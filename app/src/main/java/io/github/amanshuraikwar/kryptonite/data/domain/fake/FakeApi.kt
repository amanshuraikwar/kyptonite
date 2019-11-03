package io.github.amanshuraikwar.kryptonite.data.domain.fake

import com.google.gson.JsonParser
import io.github.amanshuraikwar.kryptonite.data.CurrencyLayerApi
import io.github.amanshuraikwar.kryptonite.data.domain.ListResponse
import io.github.amanshuraikwar.kryptonite.data.domain.LiveResponse
import okhttp3.Request
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Fake api to simulate the CurrencyLayerApi
 * as we have limited number of hits per month on a free subscription.
 */
class FakeApi : CurrencyLayerApi {

    override fun getAvailableCurrencies(
        accessKey: String
    ): Call<ListResponse> {
        Thread.sleep(5000)
        return FakeCall(
            ListResponse(
                true,
                "",
                "",
                null,
                JsonParser().parse(
                    "{\n" +
                            "        \"AED\": \"United Arab Emirates Dirham\",\n" +
                            "        \"AFN\": \"Afghan Afghani\",\n" +
                            "        \"USD\": \"United States Dollar\"\n" +
                            "}"
                ).asJsonObject
            )
        )
    }

    override fun getExchangeRates(source: String, accessKey: String): Call<LiveResponse> {
        Thread.sleep(5000)
        return FakeCall(
            LiveResponse(
                true,
                "",
                "",
                null,
                1572690173305,
                source,
                JsonParser().parse(
                    "{\n" +
                            "        \"USDAED\": 3.672982,\n" +
                            "        \"USDAFN\": 57.8936\n" +
                            "    }"
                ).asJsonObject
            )
        )
    }

    class FakeCall<T>(private val body: T): Call<T> {

        override fun enqueue(callback: Callback<T>) {}

        override fun isExecuted() = true

        override fun clone() = this

        override fun isCanceled() = false

        override fun cancel() {}

        override fun execute(): Response<T> {
            return Response.success(body)
        }

        override fun request(): Request {
            return Request.Builder().build()
        }
    }
}