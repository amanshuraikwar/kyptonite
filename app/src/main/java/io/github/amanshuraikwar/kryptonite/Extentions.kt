package io.github.amanshuraikwar.kryptonite

import android.text.Editable
import android.text.TextWatcher
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.*
import com.google.android.material.textfield.TextInputLayout
import com.google.gson.JsonObject
import io.github.amanshuraikwar.kryptonite.data.*
import io.github.amanshuraikwar.kryptonite.data.db.ExchangeRateEntity
import io.github.amanshuraikwar.kryptonite.data.domain.BaseApiResponse
import io.github.amanshuraikwar.kryptonite.data.domain.Currency
import io.github.amanshuraikwar.kryptonite.data.domain.CurrencyExchange
import io.github.amanshuraikwar.kryptonite.data.domain.Exchange
import io.github.amanshuraikwar.kryptonite.data.domain.result.Event
import io.github.amanshuraikwar.kryptonite.data.domain.result.Result
import retrofit2.Response
import java.lang.Exception

/**
 * For Actvities, allows declarations like
 * ```
 * val myViewModel = viewModelProvider(myViewModelFactory)
 * ```
 */
inline fun <reified VM : ViewModel> FragmentActivity.viewModelProvider(
    provider: ViewModelProvider.Factory
) =
    ViewModelProviders.of(this, provider).get(VM::class.java)

/**
 * For Fragments, allows declarations like
 * ```
 * val myViewModel = viewModelProvider(myViewModelFactory)
 * ```
 */
inline fun <reified VM : ViewModel> Fragment.viewModelProvider(
    provider: ViewModelProvider.Factory
) =
    ViewModelProviders.of(this, provider).get(VM::class.java)

fun <T> LiveData<Result<T>>.handleResult(
    error: MutableLiveData<Exception>,
    loading: MutableLiveData<Boolean>
) : LiveData<T> {
    val mediatorLiveData = MediatorLiveData<T>()
    mediatorLiveData.addSource(this) { result ->
        when (result) {
            is Result.Success -> {
                loading.value = false
                mediatorLiveData.value = result.data
            }
            is Result.Error -> {
                loading.value = false
                error.value = result.exception
            }
            is Result.Loading -> {
                loading.value = true
            }
        }
    }
    return mediatorLiveData
}

fun <T> LiveData<T>.asEvent() = this.map { Event(it) }

fun TextView.addErrorTextWatcher(til: TextInputLayout) {
    this.addTextChangedListener(ErrorTextWatcher(til))
}

class ErrorTextWatcher(private val til: TextInputLayout) : TextWatcher {
    override fun afterTextChanged(p0: Editable?) {
        til.error = null
    }

    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

    }

    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

    }

}

fun <X, Y, Z> combine(l1: LiveData<X>,
                      c1: (X) -> Z,
                      l2: LiveData<Y>,
                      c2: (Y) -> Z): LiveData<Z> {
    val m = MediatorLiveData<Z>()
    m.addSource(l1) {
        m.value = c1.invoke(it)
    }
    m.addSource(l2) {
        m.value = c2.invoke(it)
    }
    return m
}

inline fun <T : BaseApiResponse, reified D> Response<T>.data(map: (T) -> D): D {
    if (this.isSuccessful) {
        this.body()?.let {
            if (it.success) {
                return map.invoke(it)
            } else {
                throw ApiException(
                    it.error?.code ?: 333, it.error?.info ?: "Something went wrong!"
                )
            }
        } ?: throw ApiException()
    } else {
        throw ApiException()
    }
}

fun JsonObject.asCurrencyList(): List<Currency> {
    return this.entrySet().map {
        Currency(
            it.key,
            it.value.asString
        )
    }
}

fun JsonObject.asExchangeList(): List<Exchange> {
    return this.entrySet().map {
        Exchange(
            it.key.substring(0..2),
            it.key.substring(3..5),
            it.value.asFloat
        )
    }
}

fun CurrencyExchange.convert(newSource:String, mapper: (Float) -> Float): CurrencyExchange {
    return CurrencyExchange(
        this.code,
        this.name,
        newSource,
        mapper.invoke(this.exchangeRate),
        this.lastUpdated
    )
}

fun ExchangeRateEntity.asCurrencyExchange(
    currencyCodeNameMap: Map<String, String>
): CurrencyExchange {
    return CurrencyExchange(
        currencyCode,
        currencyCodeNameMap[currencyCode]
            ?: throw InvalidDbStateException(
                "Invalid currency $currencyCode not supported."
            ),
        sourceCurrencyCode,
        exchangeRate,
        lastUpdated
    )
}