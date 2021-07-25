package com.example.breakingnews.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.breakingnews.R
import com.example.breakingnews.data.model.Sources
import kotlinx.android.synthetic.main.list_sources_row_card.view.*

class SourcesListAdapter: RecyclerView.Adapter<SourcesListAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    private val differItemCallback = object : DiffUtil.ItemCallback<Sources>() {
        override fun areItemsTheSame(oldItem: Sources, newItem: Sources): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: Sources, newItem: Sources): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, differItemCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SourcesListAdapter.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list_sources_row_card, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    override fun onBindViewHolder(holder: SourcesListAdapter.ViewHolder, position: Int) {
        val source = differ.currentList[position]

        holder.itemView.apply {
            text_title_sources.text = source.name
            setOnClickListener {
                onItemClickListener?.let { it(source) }
            }
        }
    }

    private var onItemClickListener: ((Sources) -> Unit)? = null

    fun setOnItemClickListener(listener: (Sources) -> Unit){
        onItemClickListener = listener
    }
}