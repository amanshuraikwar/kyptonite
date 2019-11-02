// Generated by Dagger (https://dagger.dev).
package io.github.amanshuraikwar.kryptonite.di;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication_MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import io.github.amanshuraikwar.kryptonite.MainApplication;
import io.github.amanshuraikwar.kryptonite.data.CurrencyLayerApi;
import io.github.amanshuraikwar.kryptonite.data.CurrencyRepository;
import io.github.amanshuraikwar.kryptonite.data.DataModule;
import io.github.amanshuraikwar.kryptonite.data.DataModule_GetOkHttpClientFactory;
import io.github.amanshuraikwar.kryptonite.data.DataModule_ProvidesAppDatabaseFactory;
import io.github.amanshuraikwar.kryptonite.data.DataModule_ProvidesCurrencyLayerApiFactory;
import io.github.amanshuraikwar.kryptonite.data.DataModule_ProvidesCurrencyRepositoryFactory;
import io.github.amanshuraikwar.kryptonite.data.db.AppDatabase;
import io.github.amanshuraikwar.kryptonite.data.domain.currency.GetExchangeRatesUseCase;
import io.github.amanshuraikwar.kryptonite.data.domain.currency.GetExchangeRatesUseCase_Factory;
import io.github.amanshuraikwar.kryptonite.data.domain.currency.GetSupportedCurrenciesUseCase;
import io.github.amanshuraikwar.kryptonite.data.domain.currency.GetSupportedCurrenciesUseCase_Factory;
import io.github.amanshuraikwar.kryptonite.ui.MainActivity;
import io.github.amanshuraikwar.kryptonite.ui.MainActivity_MembersInjector;
import io.github.amanshuraikwar.kryptonite.ui.MainViewModel;
import io.github.amanshuraikwar.kryptonite.ui.MainViewModel_Factory;
import java.util.Collections;
import java.util.Map;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppComponent implements AppComponent {
  private Provider<ActivityBindingModule_A$app_debug.MainActivitySubcomponent.Factory> mainActivitySubcomponentFactoryProvider;

  private Provider<OkHttpClient> getOkHttpClientProvider;

  private Provider<CurrencyLayerApi> providesCurrencyLayerApiProvider;

  private Provider<MainApplication> applicationProvider;

  private Provider<Context> provideContextProvider;

  private Provider<AppDatabase> providesAppDatabaseProvider;

  private Provider<CurrencyRepository> providesCurrencyRepositoryProvider;

  private DaggerAppComponent(AppModule appModuleParam, DataModule dataModuleParam,
      MainApplication applicationParam) {

    initialize(appModuleParam, dataModuleParam, applicationParam);
  }

  public static AppComponent.Factory factory() {
    return new Factory();
  }

  private Map<Class<?>, Provider<AndroidInjector.Factory<?>>> getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(
      ) {
    return Collections.<Class<?>, Provider<AndroidInjector.Factory<?>>>singletonMap(MainActivity.class, (Provider) mainActivitySubcomponentFactoryProvider);}

  private DispatchingAndroidInjector<Object> getDispatchingAndroidInjectorOfObject() {
    return DispatchingAndroidInjector_Factory.newInstance(getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(), Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());}

  @SuppressWarnings("unchecked")
  private void initialize(final AppModule appModuleParam, final DataModule dataModuleParam,
      final MainApplication applicationParam) {
    this.mainActivitySubcomponentFactoryProvider = new Provider<ActivityBindingModule_A$app_debug.MainActivitySubcomponent.Factory>() {
      @Override
      public ActivityBindingModule_A$app_debug.MainActivitySubcomponent.Factory get() {
        return new MainActivitySubcomponentFactory();}
    };
    this.getOkHttpClientProvider = DataModule_GetOkHttpClientFactory.create(dataModuleParam);
    this.providesCurrencyLayerApiProvider = DataModule_ProvidesCurrencyLayerApiFactory.create(dataModuleParam, getOkHttpClientProvider);
    this.applicationProvider = InstanceFactory.create(applicationParam);
    this.provideContextProvider = AppModule_ProvideContextFactory.create(appModuleParam, applicationProvider);
    this.providesAppDatabaseProvider = DataModule_ProvidesAppDatabaseFactory.create(dataModuleParam, provideContextProvider);
    this.providesCurrencyRepositoryProvider = DataModule_ProvidesCurrencyRepositoryFactory.create(dataModuleParam, providesCurrencyLayerApiProvider, providesAppDatabaseProvider);
  }

  @Override
  public void inject(MainApplication arg0) {
    injectMainApplication(arg0);}

  private MainApplication injectMainApplication(MainApplication instance) {
    DaggerApplication_MembersInjector.injectAndroidInjector(instance, getDispatchingAndroidInjectorOfObject());
    return instance;
  }

  private static final class Factory implements AppComponent.Factory {
    @Override
    public AppComponent create(MainApplication application) {
      Preconditions.checkNotNull(application);
      return new DaggerAppComponent(new AppModule(), new DataModule(), application);
    }
  }

  private final class MainActivitySubcomponentFactory implements ActivityBindingModule_A$app_debug.MainActivitySubcomponent.Factory {
    @Override
    public ActivityBindingModule_A$app_debug.MainActivitySubcomponent create(MainActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new MainActivitySubcomponentImpl(arg0);
    }
  }

  private final class MainActivitySubcomponentImpl implements ActivityBindingModule_A$app_debug.MainActivitySubcomponent {
    private Provider<GetSupportedCurrenciesUseCase> getSupportedCurrenciesUseCaseProvider;

    private Provider<GetExchangeRatesUseCase> getExchangeRatesUseCaseProvider;

    private Provider<MainViewModel> mainViewModelProvider;

    private MainActivitySubcomponentImpl(MainActivity arg0) {

      initialize(arg0);
    }

    private Map<Class<? extends ViewModel>, Provider<ViewModel>> getMapOfClassOfAndProviderOfViewModel(
        ) {
      return Collections.<Class<? extends ViewModel>, Provider<ViewModel>>singletonMap(MainViewModel.class, (Provider) mainViewModelProvider);}

    private KryptoniteViewModelFactory getKryptoniteViewModelFactory() {
      return new KryptoniteViewModelFactory(getMapOfClassOfAndProviderOfViewModel());}

    @SuppressWarnings("unchecked")
    private void initialize(final MainActivity arg0) {
      this.getSupportedCurrenciesUseCaseProvider = GetSupportedCurrenciesUseCase_Factory.create(DaggerAppComponent.this.providesCurrencyRepositoryProvider);
      this.getExchangeRatesUseCaseProvider = GetExchangeRatesUseCase_Factory.create(DaggerAppComponent.this.providesCurrencyRepositoryProvider);
      this.mainViewModelProvider = MainViewModel_Factory.create(getSupportedCurrenciesUseCaseProvider, getExchangeRatesUseCaseProvider);
    }

    @Override
    public void inject(MainActivity arg0) {
      injectMainActivity(arg0);}

    private MainActivity injectMainActivity(MainActivity instance) {
      DaggerAppCompatActivity_MembersInjector.injectAndroidInjector(instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfObject());
      MainActivity_MembersInjector.injectViewModelFactory(instance, getKryptoniteViewModelFactory());
      return instance;
    }
  }
}
