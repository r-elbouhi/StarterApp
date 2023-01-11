package com.starter.starterapp.data.repositories

import com.starter.starterapp.data.local.database.AppDatabase
import com.starter.starterapp.data.remote.ApiService
import javax.inject.Inject

/**
 * Created by Rami El-bouhi on 11,January,2023
 */
class DataSource @Inject constructor(
    private val apiService: ApiService,
    private val appDatabase: AppDatabase
) {
}