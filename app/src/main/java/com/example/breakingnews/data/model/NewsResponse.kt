package com.example.breakingnews.data.model

data class NewsResponse(
    val status: String,
    val totalResult: Int,
    val articles: List<Articles>
)