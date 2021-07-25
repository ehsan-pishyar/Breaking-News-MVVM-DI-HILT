package com.example.breakingnews.ui.fragments

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.core.widget.addTextChangedListener
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
import kotlinx.android.synthetic.main.fragment_search_news.*
import kotlinx.coroutines.Job
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

@AndroidEntryPoint
class SearchNewsFragment: Fragment(R.layout.fragment_search_news) {

    private val viewModel by viewModels<MainViewModel>()
    private lateinit var newsAdapter: NewsAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        newsAdapter = NewsAdapter()
        initSearchField()
        newsAdapter.setOnItemClickListener { article ->
            onItemClick(article)
        }
    }

    private fun initRecyclerView() {
        recycler_search.apply {
            layoutManager = LinearLayoutManager(activity)
            setHasFixedSize(true)
            addItemDecoration(DividerItemDecoration(requireContext(), RecyclerView.VERTICAL))
            adapter = newsAdapter
        }
    }

    private fun initUi() {
        viewModel.everything.observe(viewLifecycleOwner, { news ->
            news.data?.articles?.let { newsAdapter.differ.submitList(it) }
        })
    }

    private fun getEverything(q: String) {
        viewModel.getEverything(q)
    }

    private fun initSearchField() {
        var job: Job? = null
        etxt_search.addTextChangedListener { editable ->
            job?.cancel()
            job = MainScope().launch {
                editable?.let {
                    if (it.toString().isEmpty()){
                        recycler_search.visibility = View.INVISIBLE
                        not_found_search.visibility = View.VISIBLE
                    }else {
                        not_found_search.visibility = View.INVISIBLE
                        recycler_search.visibility = View.VISIBLE
                        textChanged(it.toString().trim())
                    }
                }
            }
        }
    }

    private fun textChanged(q: String) {
        if (q.isEmpty()){
            recycler_search.visibility = View.INVISIBLE
            not_found_search.visibility = View.VISIBLE
        }else{
            not_found_search.visibility = View.INVISIBLE
            recycler_search.visibility = View.VISIBLE

            getEverything(q)
            initRecyclerView()
            initUi()
        }
    }

    private fun onItemClick(article: Articles) {
        val bundle = Bundle().apply {
            putSerializable("article", article)
        }

        findNavController().navigate(
            R.id.action_searchNewsFragment_to_articleFragment,
            bundle
        )
    }
}