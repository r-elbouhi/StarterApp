package com.starter.starterapp.data.repositories

import com.starter.starterapp.data.local.database.AppDatabase
import com.starter.starterapp.data.remote.ApiService
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Rami El-bouhi on 11,January,2023
 */
@Singleton
class DataSource @Inject constructor(
    val apiService: ApiService,
    val appDatabase: AppDatabase
) {
}