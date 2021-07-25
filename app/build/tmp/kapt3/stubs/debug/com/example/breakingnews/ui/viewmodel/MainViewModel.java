package com.example.breakingnews.ui.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u000f\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cJ\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u001e0\u000eJ\u000e\u0010\u0012\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u001cJ\b\u0010\u0014\u001a\u00020\u0018H\u0002J\b\u0010\u0016\u001a\u00020\u0018H\u0002J\u000e\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010\u00a8\u0006 "}, d2 = {"Lcom/example/breakingnews/ui/viewmodel/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "mainRepository", "Lcom/example/breakingnews/repository/MainRepository;", "(Lcom/example/breakingnews/repository/MainRepository;)V", "_everything", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/breakingnews/utils/Resource;", "Lcom/example/breakingnews/data/model/NewsResponse;", "_sourceContents", "_sources", "Lcom/example/breakingnews/data/model/SourcesResponse;", "_topHeadLineNews", "everything", "Landroidx/lifecycle/LiveData;", "getEverything", "()Landroidx/lifecycle/LiveData;", "sourceContents", "getSourceContents", "sources", "getSources", "topHeadlineNews", "getTopHeadlineNews", "deleteNewsFromDB", "Lkotlinx/coroutines/Job;", "article", "Lcom/example/breakingnews/data/model/Articles;", "q", "", "getNewsFromDB", "", "saveNewsToDB", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.breakingnews.repository.MainRepository mainRepository = null;
    private final androidx.lifecycle.MutableLiveData<com.example.breakingnews.utils.Resource<com.example.breakingnews.data.model.NewsResponse>> _topHeadLineNews = null;
    private final androidx.lifecycle.MutableLiveData<com.example.breakingnews.utils.Resource<com.example.breakingnews.data.model.NewsResponse>> _everything = null;
    private final androidx.lifecycle.MutableLiveData<com.example.breakingnews.utils.Resource<com.example.breakingnews.data.model.SourcesResponse>> _sources = null;
    private final androidx.lifecycle.MutableLiveData<com.example.breakingnews.utils.Resource<com.example.breakingnews.data.model.NewsResponse>> _sourceContents = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.breakingnews.repository.MainRepository mainRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.breakingnews.utils.Resource<com.example.breakingnews.data.model.NewsResponse>> getTopHeadlineNews() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.breakingnews.utils.Resource<com.example.breakingnews.data.model.NewsResponse>> getEverything() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.breakingnews.utils.Resource<com.example.breakingnews.data.model.SourcesResponse>> getSources() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.breakingnews.utils.Resource<com.example.breakingnews.data.model.NewsResponse>> getSourceContents() {
        return null;
    }
    
    private final kotlinx.coroutines.Job getTopHeadlineNews() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getEverything(@org.jetbrains.annotations.NotNull()
    java.lang.String q) {
        return null;
    }
    
    private final kotlinx.coroutines.Job getSources() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getSourceContents(@org.jetbrains.annotations.NotNull()
    java.lang.String sources) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job saveNewsToDB(@org.jetbrains.annotations.NotNull()
    com.example.breakingnews.data.model.Articles article) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.breakingnews.data.model.Articles>> getNewsFromDB() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteNewsFromDB(@org.jetbrains.annotations.NotNull()
    com.example.breakingnews.data.model.Articles article) {
        return null;
    }
}