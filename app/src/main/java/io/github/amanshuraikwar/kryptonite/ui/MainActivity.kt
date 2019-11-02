package io.github.amanshuraikwar.kryptonite.ui

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
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
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel: MainViewModel = viewModelProvider(viewModelFactory)

        viewModel.displaySupportedCurrencies.observe(
            this,
            EventObserver {

                val adapter = ArrayAdapter<String>(
                    this, R.layout.item_drop_down, it.map { it.code }
                )

                currencyTv.setAdapter(adapter)

                showToast(it.toString())
            }
        )

        viewModel.loading.observe(
            this,
            EventObserver {
                pb.visibility = if (it) View.VISIBLE else View.GONE
                amountEt.isEnabled = !it
                currencyTv.isEnabled = !it
            }
        )

        viewModel.displayExchangeRates.observe(
            this,
            EventObserver {
                itemsRv.adapter = MultiItemAdapter(
                    this,
                    RecyclerViewTypeFactoryGenerated(),
                    mutableListOf<RecyclerViewListItem>().apply {
                        add(HeaderListItem("Exchange Rates"))
                        addAll(it.map { ExchangeRateListItem(it) as RecyclerViewListItem })
                        add(HeaderListItem("That's All Folks"))
                    }
                )
            }
        )

        itemsRv.layoutManager = LinearLayoutManager(this)

        searchEfab.setOnClickListener {

            if (amountEt.text.isNullOrEmpty()) {
                amountTil.error = "Enter amount."
                return@setOnClickListener
            }

            if (currencyTv.text.isNullOrEmpty()) {
                currencyTil.error = "Select a currency."
                return@setOnClickListener
            }

            viewModel.searchExchangeRates(
                amountEt.text.toString(),
                currencyTv.text.toString()
            )
        }

        amountEt.addErrorTextWatcher(amountTil)
        currencyTv.addErrorTextWatcher(currencyTil)
    }

    private fun showToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}
