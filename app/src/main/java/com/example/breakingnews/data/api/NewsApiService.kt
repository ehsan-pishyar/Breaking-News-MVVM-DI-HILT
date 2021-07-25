package com.example.breakingnews.data.api

import com.example.breakingnews.BuildConfig
import com.example.breakingnews.data.model.NewsResponse
import com.example.breakingnews.data.model.SourcesResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiService {

    @GET("/v2/top-headlines")
    suspend fun getTopHeadlines(
        @Query("country") country: String = "us",
        @Query("apiKey") apiKey: String = BuildConfig.API_KEY
    ): Response<NewsResponse>

    @GET("/v2/everything")
    suspend fun getEverything(
        @Query("q") q: String,
        @Query("apiKey") apiKey: String = BuildConfig.API_KEY
    ): Response<NewsResponse>

    @GET("/v2/sources")
    suspend fun getSources(
        @Query("apiKey") apiKey: String = BuildConfig.API_KEY
    ): Response<SourcesResponse>

    @GET("/v2/everything")
    suspend fun getSourceContents(
        @Query("sources") sources: String,
        @Query("apiKey") apiKey: String = BuildConfig.API_KEY
    ): Response<NewsResponse>
}