// Generated by Dagger (https://dagger.dev).
package io.github.amanshuraikwar.kryptonite.data;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DataModule_ProvidesCurrencyLayerApiFactory implements Factory<CurrencyLayerApi> {
  private final DataModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public DataModule_ProvidesCurrencyLayerApiFactory(DataModule module,
      Provider<OkHttpClient> okHttpClientProvider) {
    this.module = module;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public CurrencyLayerApi get() {
    return providesCurrencyLayerApi(module, okHttpClientProvider.get());
  }

  public static DataModule_ProvidesCurrencyLayerApiFactory create(DataModule module,
      Provider<OkHttpClient> okHttpClientProvider) {
    return new DataModule_ProvidesCurrencyLayerApiFactory(module, okHttpClientProvider);
  }

  public static CurrencyLayerApi providesCurrencyLayerApi(DataModule instance,
      OkHttpClient okHttpClient) {
    return Preconditions.checkNotNull(instance.providesCurrencyLayerApi(okHttpClient), "Cannot return null from a non-@Nullable @Provides method");
  }
}
