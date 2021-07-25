package com.example.breakingnews.databse

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.breakingnews.data.model.Articles
import com.example.breakingnews.databse.dao.NewsDao
import com.example.breakingnews.utils.Converters

@Database(
    entities = [Articles::class],
    version = 1
)
@TypeConverters(Converters::class)
abstract class NewsDatabase: RoomDatabase() {

    abstract fun newsDao(): NewsDao
}