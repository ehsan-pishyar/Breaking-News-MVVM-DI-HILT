package com.example.breakingnews.data.model

import java.io.Serializable
import java.net.URL

data class Sources(
    val id: String,
    val name: String,
    val description: String,
    val url: URL,
    val category: String,
    val language: String,
    val country: String
): Serializable