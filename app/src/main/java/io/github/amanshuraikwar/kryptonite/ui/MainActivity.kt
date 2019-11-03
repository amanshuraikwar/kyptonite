package io.github.amanshuraikwar.kryptonite.ui

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import dagger.android.support.DaggerAppCompatActivity
import io.github.amanshuraikwar.kryptonite.R
import io.github.amanshuraikwar.kryptonite.addErrorTextWatcher
import io.github.amanshuraikwar.kryptonite.data.domain.result.EventObserver
import io.github.amanshuraikwar.kryptonite.ui.list.ExchangeRateListItem
import io.github.amanshuraikwar.kryptonite.ui.list.HeaderListItem
import io.github.amanshuraikwar.kryptonite.ui.list.RecyclerViewTypeFactoryGenerated
import io.github.amanshuraikwar.kryptonite.viewModelProvider
import io.github.amanshuraikwar.multiitemlistadapter.MultiItemAdapter
import io.github.amanshuraikwar.multiitemlistadapter.RecyclerViewListItem
import kotlinx.android.synthetic.main.activity_main.*
import org.threeten.bp.format.DateTimeFormatter
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory

    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = viewModelProvider(viewModelFactory)

        viewModel.displaySupportedCurrencies.observe(
            this,
            Observer {

                val adapter = ArrayAdapter<String>(
                    this, R.layout.item_drop_down, it.map { it.code }
                )

                currencySpinner.adapter = adapter
            }
        )

        viewModel.loading.observe(
            this,
            EventObserver {
                pb.visibility = if (it) View.VISIBLE else View.GONE
                amountEt.isEnabled = !it
                currencySpinner.isEnabled = !it
            }
        )

        viewModel.displayExchangeRates.observe(
            this,
            Observer {
                itemsRv.adapter = MultiItemAdapter(
                    this,
                    RecyclerViewTypeFactoryGenerated(),
                    mutableListOf<RecyclerViewListItem>().apply {
                        val amount = amountEt.text.toString().toFloat()
                        add(HeaderListItem("Exchange Rates"))
                        add(
                            HeaderListItem(
                                "Last Updated: ${it[0].lastUpdated.format(DateTimeFormatter.ofPattern("hh:mm a, dd-MMMM-yyyy"))}"
                            )
                        )
                        addAll(
                            it.map {
                                ExchangeRateListItem(it, amount) as RecyclerViewListItem
                            }
                        )
                        add(HeaderListItem("That's All Folks"))
                    }
                )
            }
        )

        viewModel.showSnackBar.observe(
            this,
            EventObserver {
                if (currencySpinner.adapter == null) {
                    showRetrySnackbar(it)
                } else {
                    showSnackbar(it)
                }
            }
        )

        itemsRv.layoutManager = LinearLayoutManager(this)

        searchEfab.setOnClickListener {

            if (amountEt.text.isNullOrEmpty()) {
                amountTil.error = "Enter amount."
                return@setOnClickListener
            }

            val selectedCurrency = (currencySpinner.selectedView as TextView).text.toString()

            viewModel.searchExchangeRates(
                amountEt.text.toString(),
                selectedCurrency
            )
        }

        amountEt.addErrorTextWatcher(amountTil)

        // if activity was recreated
        // and currencies were not loaded yet
        // load them again
        if (savedInstanceState != null) {
            if (currencySpinner.adapter == null) {
                viewModel.getSupportedCurrencies()
            }
        }
    }

    private fun showSnackbar(msg: String) {
        Snackbar.make(parentCl, msg, Snackbar.LENGTH_LONG).show()
    }

    private fun showRetrySnackbar(msg: String) {
        Snackbar
            .make(parentCl, msg, Snackbar.LENGTH_INDEFINITE)
            .apply {
                setAction("Retry") { viewModel.getSupportedCurrencies() }
            }
            .show()
    }
}
