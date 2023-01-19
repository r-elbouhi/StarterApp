package com.starter.starterapp.data.local.models

import com.google.gson.annotations.SerializedName

/**
 * Created by Rami El-bouhi on 19,January,2023
 */
data class Repo(
    @SerializedName("id") val id: Int? = 0,
    @SerializedName("name") val name: String? = "",
    @SerializedName("full_name") val fullName: String? = "",
    @SerializedName("private") val private: Boolean? = false
)