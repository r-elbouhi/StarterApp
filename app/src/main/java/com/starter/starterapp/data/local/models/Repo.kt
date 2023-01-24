package com.starter.starterapp.data.local.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

/**
 * Created by Rami El-bouhi on 19,January,2023
 */
@Entity(tableName = "repos")
data class Repo(
    @PrimaryKey
    var id: Long? = 0,
    @SerializedName("name")
    var name: String? = "",
    @SerializedName("full_name")
    var fullName: String? = "",
    @SerializedName("private")
    var private: Boolean? = false
)