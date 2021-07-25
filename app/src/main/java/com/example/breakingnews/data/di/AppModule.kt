package com.example.breakingnews.data.di

import android.content.Context
import androidx.room.Room
import com.example.breakingnews.data.api.NewsApiService
import com.example.breakingnews.data.api.helper.NewsApiHelper
import com.example.breakingnews.data.api.helper.NewsApiHelperImpl
import com.example.breakingnews.databse.NewsDatabase
import com.example.breakingnews.databse.dao.NewsDao
import com.example.breakingnews.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideBaseUrl(): String = "https://newsapi.org"

    @Provides
    @Singleton
    fun provideOkHttp(): OkHttpClient {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY
        return OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(baseUrl: String, okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
    }

    @Provides
    @Singleton
    fun provideNewsService(retrofit: Retrofit) = retrofit.create(NewsApiService::class.java)

    @Provides
    @Singleton
    fun provideNewsApiService(newsImpl: NewsApiHelperImpl): NewsApiHelper = newsImpl

    @Provides
    @Singleton
    fun provideNewsDatabase(@ApplicationContext context: Context): NewsDatabase {
        return Room.databaseBuilder(context, NewsDatabase::class.java, Constants.DATABASE_NAME)
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun provideNewsDao(db: NewsDatabase): NewsDao {
        return db.newsDao()
    }
}