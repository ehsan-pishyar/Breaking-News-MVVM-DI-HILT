package com.example.breakingnews.repository

import androidx.lifecycle.LiveData
import com.example.breakingnews.data.api.helper.NewsApiHelper
import com.example.breakingnews.data.model.Articles
import com.example.breakingnews.data.model.NewsResponse
import com.example.breakingnews.data.model.SourcesResponse
import com.example.breakingnews.databse.NewsDatabase
import retrofit2.Response
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val newsApiHelper: NewsApiHelper,
    private val db: NewsDatabase
    ) {

    suspend fun getTopHeadlineNews(): Response<NewsResponse> {
        return newsApiHelper.getTopHeadlines()
    }

    suspend fun getEverything(q: String): Response<NewsResponse> {
        return newsApiHelper.getEverything(q)
    }

    suspend fun getSources(): Response<SourcesResponse> {
        return newsApiHelper.getSources()
    }

    suspend fun getSourcesContents(sources: String): Response<NewsResponse> {
        return newsApiHelper.getSourceContents(sources)
    }

    suspend fun saveNewsToDB(article: Articles) =
        db.newsDao().upsertNewsToDB(article)

    fun getArticlesFromDB(): LiveData<List<Articles>> {
        return db.newsDao().getNewsFromDB()
    }

    suspend fun deleteNewsFromDB(article: Articles) =
        db.newsDao().deleteNewsFromDB(article)
}