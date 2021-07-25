package com.example.breakingnews.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.breakingnews.R
import com.example.breakingnews.adapters.SourcesListAdapter
import com.example.breakingnews.data.model.Source
import com.example.breakingnews.data.model.Sources
import com.example.breakingnews.ui.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_sources.*

@AndroidEntryPoint
class SourcePageFragment: Fragment(R.layout.fragment_sources) {

    private val viewModel by viewModels<MainViewModel>()
    private lateinit var sourcesAdapter: SourcesListAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerView()
        initUi()
        sourcesAdapter.setOnItemClickListener { sources ->
            onItemClick(sources)
        }
    }

    private fun initRecyclerView() {
        sourcesAdapter = SourcesListAdapter()
        recycler_sources.apply {
            layoutManager = LinearLayoutManager(activity)
            setHasFixedSize(true)
            addItemDecoration(DividerItemDecoration(requireContext(), RecyclerView.VERTICAL))
            adapter = sourcesAdapter
        }
    }

    private fun initUi() {
        viewModel.sources.observe(viewLifecycleOwner, { sources ->
            sources.data?.sources?.let { sourcesAdapter.differ.submitList(it) }
        })
    }

    private fun onItemClick(source: Sources) {
        val bundle = Bundle().apply {
            putSerializable("source", source)
        }

        findNavController().navigate(
            R.id.action_sourcePageFragment_to_sourceNewsContentsFragment,
            bundle
        )
    }
}