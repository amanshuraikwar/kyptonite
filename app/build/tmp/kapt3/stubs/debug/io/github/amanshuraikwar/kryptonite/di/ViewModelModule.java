package io.github.amanshuraikwar.kryptonite.di;

import java.lang.System;

@kotlin.Suppress(names = {"UNUSED"})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H!\u00a2\u0006\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lio/github/amanshuraikwar/kryptonite/di/ViewModelModule;", "", "()V", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lio/github/amanshuraikwar/kryptonite/di/KryptoniteViewModelFactory;", "bindViewModelFactory$app_debug", "app_debug"})
@dagger.Module()
public abstract class ViewModelModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindViewModelFactory$app_debug(@org.jetbrains.annotations.NotNull()
    io.github.amanshuraikwar.kryptonite.di.KryptoniteViewModelFactory factory);
    
    public ViewModelModule() {
        super();
    }
}