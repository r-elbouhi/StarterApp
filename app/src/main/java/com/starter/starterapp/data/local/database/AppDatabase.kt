package com.starter.starterapp.data.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.starter.starterapp.data.local.models.Repo
import com.starter.starterapp.utils.DATABASE_NAME

/**
 * Created by Rami El-bouhi on 11,January,2023
 */
@Database(
    entities = [Repo::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun repoDao(): RepoDao

    companion object {
        fun create(context: Context): AppDatabase {
            return Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                DATABASE_NAME
            ).build()
        }
    }
}