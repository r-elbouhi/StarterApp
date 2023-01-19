package com.starter.starterapp.data.remote

import com.starter.starterapp.data.local.models.Repo
import retrofit2.http.GET

/**
 * Created by Rami El-bouhi on 11,January,2023
 */
interface ApiService {
    @GET(ApiEndPoints.GET_USER_REPOS)
    suspend fun getUserRepos(): List<Repo>
}