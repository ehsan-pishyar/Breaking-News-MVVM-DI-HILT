package com.example.breakingnews.data.api.helper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\t\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/example/breakingnews/data/api/helper/NewsApiHelper;", "", "getEverything", "Lretrofit2/Response;", "Lcom/example/breakingnews/data/model/NewsResponse;", "q", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSourceContents", "sources", "getSources", "Lcom/example/breakingnews/data/model/SourcesResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopHeadlines", "app_debug"})
public abstract interface NewsApiHelper {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTopHeadlines(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.breakingnews.data.model.NewsResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getEverything(@org.jetbrains.annotations.NotNull()
    java.lang.String q, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.breakingnews.data.model.NewsResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSources(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.breakingnews.data.model.SourcesResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSourceContents(@org.jetbrains.annotations.NotNull()
    java.lang.String sources, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.breakingnews.data.model.NewsResponse>> continuation);
}