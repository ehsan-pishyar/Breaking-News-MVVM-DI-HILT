package com.example.breakingnews.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\fH\u0002J\b\u0010\u0011\u001a\u00020\fH\u0002J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001a\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u001b"}, d2 = {"Lcom/example/breakingnews/ui/fragments/SearchNewsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "newsAdapter", "Lcom/example/breakingnews/adapters/NewsAdapter;", "viewModel", "Lcom/example/breakingnews/ui/viewmodel/MainViewModel;", "getViewModel", "()Lcom/example/breakingnews/ui/viewmodel/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getEverything", "", "q", "", "initRecyclerView", "initSearchField", "initUi", "onItemClick", "article", "Lcom/example/breakingnews/data/model/Articles;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "textChanged", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SearchNewsFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private com.example.breakingnews.adapters.NewsAdapter newsAdapter;
    private java.util.HashMap _$_findViewCache;
    
    public SearchNewsFragment() {
        super();
    }
    
    private final com.example.breakingnews.ui.viewmodel.MainViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initRecyclerView() {
    }
    
    private final void initUi() {
    }
    
    private final void getEverything(java.lang.String q) {
    }
    
    private final void initSearchField() {
    }
    
    private final void textChanged(java.lang.String q) {
    }
    
    private final void onItemClick(com.example.breakingnews.data.model.Articles article) {
    }
}