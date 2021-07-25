package com.example.breakingnews.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.breakingnews.R
import com.example.breakingnews.data.model.Articles
import com.example.breakingnews.ui.viewmodel.MainViewModel
import com.example.breakingnews.utils.NewsUtils
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_article.*

@AndroidEntryPoint
class ArticleFragment: Fragment(R.layout.fragment_article) {

    private val viewModel by viewModels<MainViewModel>()
    private val articleArgs: ArticleFragmentArgs by navArgs()
    private var savedArticle = false

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val article = articleArgs.article

        initArticle(article)

        fab_save_news.setOnClickListener {
            saveArticle(article)
        }

        fab_share_news.setOnClickListener {
            shareArticle(article)
        }
    }

    private fun initArticle(article: Articles) {

        Glide.with(this).load(article.urlToImage).placeholder(R.mipmap.w).into(img_article_image)
        text_article_source.text = article.source?.name
        text_article_title.text = article.title
        text_article_description.text = article.description
        text_article_author.text = article.author
        text_article_content.text = article.content
    }

    private fun saveArticle(article: Articles) {
        savedArticle = if (!savedArticle) {
            viewModel.saveNewsToDB(article)
            fab_save_news.setImageResource(R.drawable.ic_bookmark_black)
            true
        }else {
            viewModel.deleteNewsFromDB(article)
            fab_save_news.setImageResource(R.drawable.ic_bookmark)
            false
        }

    }


    private fun shareArticle(article: Articles) {
        val intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.ACTION_SEND, article.url)
            type = "text/plain"
        }
        val shareIntent = Intent.createChooser(intent, null)
        startActivity(shareIntent)
    }
}