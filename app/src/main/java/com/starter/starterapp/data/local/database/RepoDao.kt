package com.starter.starterapp.data.local.database

import androidx.room.Dao
import androidx.room.Insert
import com.starter.starterapp.data.local.models.Repo

/**
 * Created by Rami El-bouhi on 24,January,2023
 */
@Dao
interface RepoDao {

    @Insert
    suspend fun insert(item: Repo)
}