package io.github.amanshuraikwar.kryptonite

import android.text.Editable
import android.text.TextWatcher
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.*
import com.google.android.material.textfield.TextInputLayout
import io.github.amanshuraikwar.kryptonite.data.domain.result.Event
import io.github.amanshuraikwar.kryptonite.data.domain.result.Result
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