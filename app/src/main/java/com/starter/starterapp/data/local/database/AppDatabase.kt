package com.starter.starterapp.data.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.starter.starterapp.data.local.models.MyModel
import com.starter.starterapp.utils.DATABASE_NAME

/**
 * Created by Rami El-bouhi on 11,January,2023
 */
@Database(
    entities = [MyModel::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun myModelDao(): MyModelDao

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