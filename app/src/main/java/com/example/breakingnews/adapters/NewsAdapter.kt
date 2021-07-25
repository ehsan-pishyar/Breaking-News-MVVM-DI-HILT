package com.example.breakingnews.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.breakingnews.R
import com.example.breakingnews.data.model.Articles
import com.example.breakingnews.utils.NewsUtils
import kotlinx.android.synthetic.main.list_main_row_card.view.*

class NewsAdapter: RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    inner class NewsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    private val differItemCallback = object : DiffUtil.ItemCallback<Articles>() {

        override fun areItemsTheSame(oldList: Articles, newList: Articles): Boolean {
            return oldList.url == newList.url
        }

        override fun areContentsTheSame(oldList: Articles, newList: Articles): Boolean {
            return oldList == newList
        }
    }

     val differ = AsyncListDiffer(this, differItemCallback)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        return NewsViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list_main_row_card, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val article = differ.currentList[position]
        val newsDateTime = NewsUtils()
        holder.itemView.apply{
            Glide.with(this).load(article.urlToImage).placeholder(R.mipmap.w).into(img_icon_row)
            text_source_row.text = article.source?.name
            text_published_row.text = "${article.publishedAt?.let { newsDateTime.setDate(it) }}:${article.publishedAt?.let { newsDateTime.setTime(it) }})}"
            text_title_row.text = article.title
            setOnClickListener {
                onItemClickListener?.let { it(article) }
            }
        }
    }

    private var onItemClickListener: ((Articles) -> Unit)? = null

    fun setOnItemClickListener(listener: (Articles) -> Unit){
        onItemClickListener = listener
    }
}