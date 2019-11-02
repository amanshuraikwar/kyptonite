package io.github.amanshuraikwar.multiitemlistadapter

import android.view.View
import androidx.fragment.app.FragmentActivity

interface RecyclerViewListItem {
    fun bind(view: View, activity: FragmentActivity)
}