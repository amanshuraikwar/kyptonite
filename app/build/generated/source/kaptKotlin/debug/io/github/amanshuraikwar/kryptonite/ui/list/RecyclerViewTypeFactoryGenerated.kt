package io.github.amanshuraikwar.kryptonite.ui.list

import android.view.View
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import io.github.amanshuraikwar.multiitemlistadapter.RecyclerViewListItem
import io.github.amanshuraikwar.multiitemlistadapter.RecyclerViewTypeFactory
import kotlin.Int
import kotlin.jvm.JvmStatic

class HeaderListItemViewHolder(
  view: View
) : RecyclerView.ViewHolder(view) {
  companion object {
    @LayoutRes
    @JvmStatic
    val LAYOUT: Int = 2131427375
  }
}

class ExchangeRateListItemViewHolder(
  view: View
) : RecyclerView.ViewHolder(view) {
  companion object {
    @LayoutRes
    @JvmStatic
    val LAYOUT: Int = 2131427374
  }
}

class RecyclerViewTypeFactoryGenerated : RecyclerViewTypeFactory {
  override fun getLayout(viewType: Int): Int {
    if (viewType == 0) return HeaderListItemViewHolder.LAYOUT
    else if (viewType == 1) return ExchangeRateListItemViewHolder.LAYOUT
    else return 0
  }

  override fun createViewHolder(parent: View, viewType: Int): RecyclerView.ViewHolder? {
    val viewHolder: RecyclerView.ViewHolder? = null
    if (viewType == 0) return HeaderListItemViewHolder(parent)
    else if (viewType == 1) return ExchangeRateListItemViewHolder(parent)
    return viewHolder
  }

  override fun type(listItem: RecyclerViewListItem): Int {
    if (listItem is HeaderListItem) return 0
    else if (listItem is ExchangeRateListItem) return 1
    else return -1
  }
}
