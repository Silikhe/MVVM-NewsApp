package com.androiddevs.mvvmnewsapp.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.androiddevs.mvvmnewsapp.response.Article
import java.util.concurrent.locks.Lock

@Database(
    entities = [Article::class],
    version = 1
)
abstract  class ArticleDatabase : RoomDatabase(){
    abstract fun getArticleDao():ArticleDao

    companion object {
        @Volatile //other threads can immediately see when a thread changes instance
        private var instance : ArticleDatabase? = null
        private val Lock = Any()
    }
}