package io.github.amanshuraikwar.kryptonite;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ab\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u0007\u001a\u0012\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e\u001a\"\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\u00100\u0001\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u0002H\u00110\u0001\u001a>\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0001\"\u0004\b\u0000\u0010\u0011*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\u00130\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015\u001a&\u0010\u0019\u001a\u0002H\u001a\"\n\b\u0000\u0010\u001a\u0018\u0001*\u00020\u001b*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0086\b\u00a2\u0006\u0002\u0010\u001f\u001a&\u0010\u0019\u001a\u0002H\u001a\"\n\b\u0000\u0010\u001a\u0018\u0001*\u00020\u001b*\u00020 2\u0006\u0010\u001d\u001a\u00020\u001eH\u0086\b\u00a2\u0006\u0002\u0010!\u00a8\u0006\""}, d2 = {"combine", "Landroidx/lifecycle/LiveData;", "Z", "X", "Y", "l1", "c1", "Lkotlin/Function1;", "l2", "c2", "addErrorTextWatcher", "", "Landroid/widget/TextView;", "til", "Lcom/google/android/material/textfield/TextInputLayout;", "asEvent", "Lio/github/amanshuraikwar/kryptonite/data/domain/result/Event;", "T", "handleResult", "Lio/github/amanshuraikwar/kryptonite/data/domain/result/Result;", "error", "Landroidx/lifecycle/MutableLiveData;", "Ljava/lang/Exception;", "loading", "", "viewModelProvider", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/fragment/app/Fragment;", "provider", "Landroidx/lifecycle/ViewModelProvider$Factory;", "(Landroidx/fragment/app/Fragment;Landroidx/lifecycle/ViewModelProvider$Factory;)Landroidx/lifecycle/ViewModel;", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;Landroidx/lifecycle/ViewModelProvider$Factory;)Landroidx/lifecycle/ViewModel;", "app_debug"})
public final class ExtentionsKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>androidx.lifecycle.LiveData<T> handleResult(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<io.github.amanshuraikwar.kryptonite.data.domain.result.Result<T>> $this$handleResult, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Exception> error, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> loading) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>androidx.lifecycle.LiveData<io.github.amanshuraikwar.kryptonite.data.domain.result.Event<T>> asEvent(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> $this$asEvent) {
        return null;
    }
    
    public static final void addErrorTextWatcher(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$addErrorTextWatcher, @org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout til) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <X extends java.lang.Object, Y extends java.lang.Object, Z extends java.lang.Object>androidx.lifecycle.LiveData<Z> combine(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<X> l1, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super X, ? extends Z> c1, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<Y> l2, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super Y, ? extends Z> c2) {
        return null;
    }
}