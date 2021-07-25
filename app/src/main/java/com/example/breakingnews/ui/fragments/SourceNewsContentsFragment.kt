package com.example.breakingnews.ui.fragments

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.breakingnews.R
import com.example.breakingnews.adapters.NewsAdapter
import com.example.breakingnews.adapters.SourcesListAdapter
import com.example.breakingnews.data.model.Articles
import com.example.breakingnews.data.model.Sources
import com.example.breakingnews.ui.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_source_news_contents.*

@AndroidEntryPoint
class SourceNewsContentsFragment: Fragment(R.layout.fragment_source_news_contents) {

    private val viewModel by viewModels<MainViewModel>()
    private val sourceArgs: SourceNewsContentsFragmentArgs by navArgs()
    private lateinit var newsAdapter: NewsAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        getSourceContents(sourceArgs.source.id)
        initRecyclerView()
        initUi()
        newsAdapter.setOnItemClickListener { articles ->
            onArticleClick(articles)
        }

    }

    private fun initRecyclerView(){
        newsAdapter = NewsAdapter()

        recycler_source_content.apply {
            layoutManager = LinearLayoutManager(activity)
            setHasFixedSize(true)
            addItemDecoration(DividerItemDecoration(requireContext(), RecyclerView.VERTICAL))
            adapter = newsAdapter
        }
    }

    private fun initUi() {
        viewModel.sourceContents.observe(viewLifecycleOwner, { news ->
            news.data?.articles?.let { newsAdapter.differ.submitList(it) }
        })
    }

    private fun getSourceContents(sourceName: String) {
        viewModel.getSourceContents(sourceName)
    }

    private fun onArticleClick(article: Articles) {
        val bundle = Bundle().apply {
            putSerializable("article", article)
        }

        findNavController().navigate(
            R.id.action_sourceNewsContentsFragment_to_articleFragment,
            bundle
        )
    }
}