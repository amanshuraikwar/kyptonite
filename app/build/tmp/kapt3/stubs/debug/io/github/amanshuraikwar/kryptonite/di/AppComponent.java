package io.github.amanshuraikwar.kryptonite.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lio/github/amanshuraikwar/kryptonite/di/AppComponent;", "Ldagger/android/AndroidInjector;", "Lio/github/amanshuraikwar/kryptonite/MainApplication;", "Factory", "app_debug"})
@dagger.Component(modules = {dagger.android.support.AndroidSupportInjectionModule.class, io.github.amanshuraikwar.kryptonite.di.AppModule.class, io.github.amanshuraikwar.kryptonite.di.ActivityBindingModule.class, io.github.amanshuraikwar.kryptonite.data.DataModule.class, io.github.amanshuraikwar.kryptonite.di.ViewModelModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent extends dagger.android.AndroidInjector<io.github.amanshuraikwar.kryptonite.MainApplication> {
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lio/github/amanshuraikwar/kryptonite/di/AppComponent$Factory;", "", "create", "Lio/github/amanshuraikwar/kryptonite/di/AppComponent;", "application", "Lio/github/amanshuraikwar/kryptonite/MainApplication;", "app_debug"})
    @dagger.Component.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.github.amanshuraikwar.kryptonite.di.AppComponent create(@org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        io.github.amanshuraikwar.kryptonite.MainApplication application);
    }
}