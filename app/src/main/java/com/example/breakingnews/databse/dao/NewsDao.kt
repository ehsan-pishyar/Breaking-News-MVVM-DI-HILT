package com.example.breakingnews.databse.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.breakingnews.data.model.Articles

@Dao
interface NewsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsertNewsToDB(articles: Articles)

    @Query("SELECT * FROM articles")
    fun getNewsFromDB(): LiveData<List<Articles>>

    @Delete
    suspend fun deleteNewsFromDB(articles: Articles)
}