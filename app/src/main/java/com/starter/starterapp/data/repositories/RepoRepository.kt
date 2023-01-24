package com.starter.starterapp.data.repositories

import com.starter.starterapp.ui.base.BaseRepository
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Rami El-bouhi on 24,January,2023
 */
@Singleton
class RepoRepository @Inject constructor(private val dataSource: DataSource) :
    BaseRepository(dataSource) {

    suspend fun getUserRepos() = flow {
        emit(dataSource.apiService.getUserRepos())
    }
}