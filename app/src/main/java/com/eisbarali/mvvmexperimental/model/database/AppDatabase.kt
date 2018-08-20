package com.eisbarali.mvvmexperimental.model.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.eisbarali.mvvmexperimental.model.Post
import com.eisbarali.mvvmexperimental.model.PostDao

@Database(entities = arrayOf(Post::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun postDao(): PostDao
}