package io.github.amanshuraikwar.kryptonite.ui

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.android.support.DaggerAppCompatActivity
import io.github.amanshuraikwar.kryptonite.R
import io.github.amanshuraikwar.kryptonite.addErrorTextWatcher
import io.github.amanshuraikwar.kryptonite.data.Currency
import io.github.amanshuraikwar.kryptonite.data.domain.result.EventObserver
import io.github.amanshuraikwar.kryptonite.ui.list.ExchangeRateListItem
import io.github.amanshuraikwar.kryptonite.ui.list.HeaderListItem
import io.github.amanshuraikwar.kryptonite.ui.list.RecyclerViewTypeFactoryGenerated
import io.github.amanshuraikwar.kryptonite.viewModelProvider
import io.github.amanshuraikwar.multiitemlistadapter.MultiItemAdapter
import io.github.amanshuraikwar.multiitemlistadapter.RecyclerViewListItem
import io.github.amanshuraikwar.multiitemlistadapter.annotations.ListItem
import kotlinx.android.synthetic.main.activity_main.*
import org.threeten.bp.format.DateTimeFormatter
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel: MainViewModel = viewModelProvider(viewModelFactory)

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
                showToast(it)
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
    }

    private fun showToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}
