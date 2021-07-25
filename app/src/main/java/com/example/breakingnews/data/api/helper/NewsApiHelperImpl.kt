package com.example.breakingnews.data.api.helper

import com.example.breakingnews.data.api.NewsApiService
import com.example.breakingnews.data.model.NewsResponse
import com.example.breakingnews.data.model.SourcesResponse
import retrofit2.Response
import javax.inject.Inject

class NewsApiHelperImpl @Inject constructor(private val newsApiService: NewsApiService): NewsApiHelper {

    override suspend fun getTopHeadlines(): Response<NewsResponse> {
        return newsApiService.getTopHeadlines()
    }

    override suspend fun getEverything(q: String): Response<NewsResponse> {
        return newsApiService.getEverything(q)
    }

    override suspend fun getSources(): Response<SourcesResponse> {
        return newsApiService.getSources()
    }

    override suspend fun getSourceContents(sources: String): Response<NewsResponse> {
        return newsApiService.getSourceContents(sources)
    }
}