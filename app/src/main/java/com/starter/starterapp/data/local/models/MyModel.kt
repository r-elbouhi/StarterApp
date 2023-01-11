package com.starter.starterapp.data.local.models

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Rami El-bouhi on 11,January,2023
 */
@Entity(tableName = "myModels")
data class MyModel(
    @PrimaryKey
    val id: Long? = 0,
    val name: String? = null
)