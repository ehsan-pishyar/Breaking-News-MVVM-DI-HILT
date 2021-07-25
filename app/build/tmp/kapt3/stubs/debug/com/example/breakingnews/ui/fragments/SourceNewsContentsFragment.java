package com.example.breakingnews.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0002J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u001a\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001f"}, d2 = {"Lcom/example/breakingnews/ui/fragments/SourceNewsContentsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "newsAdapter", "Lcom/example/breakingnews/adapters/NewsAdapter;", "sourceArgs", "Lcom/example/breakingnews/ui/fragments/SourceNewsContentsFragmentArgs;", "getSourceArgs", "()Lcom/example/breakingnews/ui/fragments/SourceNewsContentsFragmentArgs;", "sourceArgs$delegate", "Landroidx/navigation/NavArgsLazy;", "viewModel", "Lcom/example/breakingnews/ui/viewmodel/MainViewModel;", "getViewModel", "()Lcom/example/breakingnews/ui/viewmodel/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getSourceContents", "", "sourceName", "", "initRecyclerView", "initUi", "onArticleClick", "article", "Lcom/example/breakingnews/data/model/Articles;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SourceNewsContentsFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private final androidx.navigation.NavArgsLazy sourceArgs$delegate = null;
    private com.example.breakingnews.adapters.NewsAdapter newsAdapter;
    private java.util.HashMap _$_findViewCache;
    
    public SourceNewsContentsFragment() {
        super();
    }
    
    private final com.example.breakingnews.ui.viewmodel.MainViewModel getViewModel() {
        return null;
    }
    
    private final com.example.breakingnews.ui.fragments.SourceNewsContentsFragmentArgs getSourceArgs() {
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
    
    private final void getSourceContents(java.lang.String sourceName) {
    }
    
    private final void onArticleClick(com.example.breakingnews.data.model.Articles article) {
    }
}