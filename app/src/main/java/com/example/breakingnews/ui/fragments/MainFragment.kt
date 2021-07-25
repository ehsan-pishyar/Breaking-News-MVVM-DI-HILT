package com.example.breakingnews.ui.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.breakingnews.R
import com.example.breakingnews.adapters.NewsAdapter
import com.example.breakingnews.data.model.Articles
import com.example.breakingnews.ui.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_main.*

@AndroidEntryPoint
class MainFragment: Fragment(R.layout.fragment_main) {

    private val viewModel by viewModels<MainViewModel>()
    private lateinit var newsAdapter: NewsAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerView()
        initUI()

        newsAdapter.setOnItemClickListener { articles ->
            onItemClick(articles)
        }

    }

    private fun initRecyclerView(){
        newsAdapter = NewsAdapter()
        main_recycler.apply {
            layoutManager = LinearLayoutManager(activity)
            setHasFixedSize(true)
            addItemDecoration(DividerItemDecoration(requireContext(), RecyclerView.VERTICAL))
            adapter = newsAdapter
        }
    }

    private fun initUI(){
        viewModel.topHeadlineNews.observe(viewLifecycleOwner, { news ->
            news.data?.articles?.let { newsAdapter.differ.submitList(it) }
        })
    }

    private fun onItemClick(article: Articles){
        val bundle = Bundle().apply {
            putSerializable("article", article)
        }
        findNavController().navigate(
            R.id.action_mainFragment_to_articleFragment,
            bundle
        )
    }
}