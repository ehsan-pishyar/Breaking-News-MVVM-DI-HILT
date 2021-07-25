// Generated by Dagger (https://dagger.dev).
package com.example.breakingnews.data.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideBaseUrlFactory implements Factory<String> {
  @Override
  public String get() {
    return provideBaseUrl();
  }

  public static AppModule_ProvideBaseUrlFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provideBaseUrl() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideBaseUrl());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideBaseUrlFactory INSTANCE = new AppModule_ProvideBaseUrlFactory();
  }
}
