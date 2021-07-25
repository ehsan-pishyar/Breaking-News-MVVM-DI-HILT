package com.example.breakingnews.data.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0012\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0007J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0016H\u0007\u00a8\u0006\u001a"}, d2 = {"Lcom/example/breakingnews/data/di/AppModule;", "", "()V", "provideBaseUrl", "", "provideNewsApiService", "Lcom/example/breakingnews/data/api/helper/NewsApiHelper;", "newsImpl", "Lcom/example/breakingnews/data/api/helper/NewsApiHelperImpl;", "provideNewsDao", "Lcom/example/breakingnews/databse/dao/NewsDao;", "db", "Lcom/example/breakingnews/databse/NewsDatabase;", "provideNewsDatabase", "context", "Landroid/content/Context;", "provideNewsService", "Lcom/example/breakingnews/data/api/NewsApiService;", "kotlin.jvm.PlatformType", "retrofit", "Lretrofit2/Retrofit;", "provideOkHttp", "Lokhttp3/OkHttpClient;", "provideRetrofit", "baseUrl", "okHttpClient", "app_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.breakingnews.data.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final java.lang.String provideBaseUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.breakingnews.data.api.NewsApiService provideNewsService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.breakingnews.data.api.helper.NewsApiHelper provideNewsApiService(@org.jetbrains.annotations.NotNull()
    com.example.breakingnews.data.api.helper.NewsApiHelperImpl newsImpl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.breakingnews.databse.NewsDatabase provideNewsDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.breakingnews.databse.dao.NewsDao provideNewsDao(@org.jetbrains.annotations.NotNull()
    com.example.breakingnews.databse.NewsDatabase db) {
        return null;
    }
}