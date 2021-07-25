package com.example.breakingnews.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\rJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0019\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0019\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/example/breakingnews/repository/MainRepository;", "", "newsApiHelper", "Lcom/example/breakingnews/data/api/helper/NewsApiHelper;", "db", "Lcom/example/breakingnews/databse/NewsDatabase;", "(Lcom/example/breakingnews/data/api/helper/NewsApiHelper;Lcom/example/breakingnews/databse/NewsDatabase;)V", "deleteNewsFromDB", "", "article", "Lcom/example/breakingnews/data/model/Articles;", "(Lcom/example/breakingnews/data/model/Articles;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getArticlesFromDB", "Landroidx/lifecycle/LiveData;", "", "getEverything", "Lretrofit2/Response;", "Lcom/example/breakingnews/data/model/NewsResponse;", "q", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSources", "Lcom/example/breakingnews/data/model/SourcesResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSourcesContents", "sources", "getTopHeadlineNews", "saveNewsToDB", "app_debug"})
public final class MainRepository {
    private final com.example.breakingnews.data.api.helper.NewsApiHelper newsApiHelper = null;
    private final com.example.breakingnews.databse.NewsDatabase db = null;
    
    @javax.inject.Inject()
    public MainRepository(@org.jetbrains.annotations.NotNull()
    com.example.breakingnews.data.api.helper.NewsApiHelper newsApiHelper, @org.jetbrains.annotations.NotNull()
    com.example.breakingnews.databse.NewsDatabase db) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTopHeadlineNews(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.breakingnews.data.model.NewsResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getEverything(@org.jetbrains.annotations.NotNull()
    java.lang.String q, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.breakingnews.data.model.NewsResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSources(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.breakingnews.data.model.SourcesResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSourcesContents(@org.jetbrains.annotations.NotNull()
    java.lang.String sources, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.breakingnews.data.model.NewsResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveNewsToDB(@org.jetbrains.annotations.NotNull()
    com.example.breakingnews.data.model.Articles article, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.breakingnews.data.model.Articles>> getArticlesFromDB() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteNewsFromDB(@org.jetbrains.annotations.NotNull()
    com.example.breakingnews.data.model.Articles article, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}