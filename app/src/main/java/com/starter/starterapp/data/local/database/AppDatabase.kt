package com.starter.starterapp.data.local.database

import androidx.room.Database
import com.starter.starterapp.data.local.models.MyModel

/**
 * Created by Rami El-bouhi on 11,January,2023
 */
@Database(
    entities = [MyModel::class],
    version = 1,
)
abstract class AppDatabase {
    abstract fun entityDao(): MyModelDao
}