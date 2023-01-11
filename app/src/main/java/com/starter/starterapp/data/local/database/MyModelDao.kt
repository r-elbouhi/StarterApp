package com.starter.starterapp.data.local.database

import androidx.room.Dao
import androidx.room.Insert
import com.starter.starterapp.data.local.models.MyModel

/**
 * Created by Rami El-bouhi on 11,January,2023
 */
@Dao
interface MyModelDao {

    @Insert
    suspend fun insert(item: MyModel)
}