package io.github.amanshuraikwar.kryptonite.di

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import io.github.amanshuraikwar.kryptonite.MainApplication
import io.github.amanshuraikwar.kryptonite.data.DataModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AppModule::class,
        ActivityBindingModule::class,
        DataModule::class,
        ViewModelModule::class
    ]
)
interface AppComponent : AndroidInjector<MainApplication> {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: MainApplication): AppComponent
    }
}