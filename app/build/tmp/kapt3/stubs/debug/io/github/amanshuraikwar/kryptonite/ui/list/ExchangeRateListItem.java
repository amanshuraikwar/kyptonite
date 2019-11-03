package io.github.amanshuraikwar.kryptonite.ui.list;

import java.lang.System;

/**
 * Dispays exchange rate in a recycler view.
 */
@io.github.amanshuraikwar.multiitemlistadapter.annotations.ListItem(layoutResId = io.github.amanshuraikwar.kryptonite.R.layout.item_exchange_rate)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lio/github/amanshuraikwar/kryptonite/ui/list/ExchangeRateListItem;", "Lio/github/amanshuraikwar/multiitemlistadapter/RecyclerViewListItem;", "currencyExchange", "Lio/github/amanshuraikwar/kryptonite/data/domain/CurrencyExchange;", "amount", "", "(Lio/github/amanshuraikwar/kryptonite/data/domain/CurrencyExchange;F)V", "bind", "", "view", "Landroid/view/View;", "activity", "Landroidx/fragment/app/FragmentActivity;", "app_debug"})
public final class ExchangeRateListItem implements io.github.amanshuraikwar.multiitemlistadapter.RecyclerViewListItem {
    private final io.github.amanshuraikwar.kryptonite.data.domain.CurrencyExchange currencyExchange = null;
    private final float amount = 0.0F;
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity) {
    }
    
    public ExchangeRateListItem(@org.jetbrains.annotations.NotNull()
    io.github.amanshuraikwar.kryptonite.data.domain.CurrencyExchange currencyExchange, float amount) {
        super();
    }
}