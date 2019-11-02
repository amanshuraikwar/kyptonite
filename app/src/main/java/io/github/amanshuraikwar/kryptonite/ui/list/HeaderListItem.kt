package io.github.amanshuraikwar.kryptonite.ui.list

import android.view.View
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import io.github.amanshuraikwar.kryptonite.R
import io.github.amanshuraikwar.kryptonite.data.CurrencyExchange
import io.github.amanshuraikwar.multiitemlistadapter.RecyclerViewListItem
import io.github.amanshuraikwar.multiitemlistadapter.annotations.ListItem

@ListItem(layoutResId = R.layout.item_header)
class HeaderListItem(private val heading: String) : RecyclerViewListItem {
    override fun bind(view: View, activity: FragmentActivity) {
        view.findViewById<TextView>(R.id.tv).text = heading
    }
}