package com.example.breakingnews.data.api.helper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\f\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/example/breakingnews/data/api/helper/NewsApiHelperImpl;", "Lcom/example/breakingnews/data/api/helper/NewsApiHelper;", "newsApiService", "Lcom/example/breakingnews/data/api/NewsApiService;", "(Lcom/example/breakingnews/data/api/NewsApiService;)V", "getEverything", "Lretrofit2/Response;", "Lcom/example/breakingnews/data/model/NewsResponse;", "q", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSourceContents", "sources", "getSources", "Lcom/example/breakingnews/data/model/SourcesResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopHeadlines", "app_debug"})
public final class NewsApiHelperImpl implements com.example.breakingnews.data.api.helper.NewsApiHelper {
    private final com.example.breakingnews.data.api.NewsApiService newsApiService = null;
    
    @javax.inject.Inject()
    public NewsApiHelperImpl(@org.jetbrains.annotations.NotNull()
    com.example.breakingnews.data.api.NewsApiService newsApiService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getTopHeadlines(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.breakingnews.data.model.NewsResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getEverything(@org.jetbrains.annotations.NotNull()
    java.lang.String q, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.breakingnews.data.model.NewsResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getSources(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.breakingnews.data.model.SourcesResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getSourceContents(@org.jetbrains.annotations.NotNull()
    java.lang.String sources, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.breakingnews.data.model.NewsResponse>> continuation) {
        return null;
    }
}