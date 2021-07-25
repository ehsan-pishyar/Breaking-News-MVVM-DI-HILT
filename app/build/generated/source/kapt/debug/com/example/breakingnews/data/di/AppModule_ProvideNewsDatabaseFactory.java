// Generated by Dagger (https://dagger.dev).
package com.example.breakingnews.data.di;

import android.content.Context;
import com.example.breakingnews.databse.NewsDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideNewsDatabaseFactory implements Factory<NewsDatabase> {
  private final Provider<Context> contextProvider;

  public AppModule_ProvideNewsDatabaseFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public NewsDatabase get() {
    return provideNewsDatabase(contextProvider.get());
  }

  public static AppModule_ProvideNewsDatabaseFactory create(Provider<Context> contextProvider) {
    return new AppModule_ProvideNewsDatabaseFactory(contextProvider);
  }

  public static NewsDatabase provideNewsDatabase(Context context) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideNewsDatabase(context));
  }
}
