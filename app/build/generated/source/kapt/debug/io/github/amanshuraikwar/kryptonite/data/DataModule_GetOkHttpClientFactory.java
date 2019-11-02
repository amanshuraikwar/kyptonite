// Generated by Dagger (https://dagger.dev).
package io.github.amanshuraikwar.kryptonite.data;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import okhttp3.OkHttpClient;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DataModule_GetOkHttpClientFactory implements Factory<OkHttpClient> {
  private final DataModule module;

  public DataModule_GetOkHttpClientFactory(DataModule module) {
    this.module = module;
  }

  @Override
  public OkHttpClient get() {
    return getOkHttpClient(module);
  }

  public static DataModule_GetOkHttpClientFactory create(DataModule module) {
    return new DataModule_GetOkHttpClientFactory(module);
  }

  public static OkHttpClient getOkHttpClient(DataModule instance) {
    return Preconditions.checkNotNull(instance.getOkHttpClient(), "Cannot return null from a non-@Nullable @Provides method");
  }
}