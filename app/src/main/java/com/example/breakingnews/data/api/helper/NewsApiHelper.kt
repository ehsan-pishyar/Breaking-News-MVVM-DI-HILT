package com.example.breakingnews.data.api.helper

import com.example.breakingnews.data.model.NewsResponse
import com.example.breakingnews.data.model.SourcesResponse
import retrofit2.Response

interface NewsApiHelper {

    suspend fun getTopHeadlines(): Response<NewsResponse>

    suspend fun getEverything(q: String): Response<NewsResponse>

    suspend fun getSources(): Response<SourcesResponse>

    suspend fun getSourceContents(sources: String): Response<NewsResponse>
}