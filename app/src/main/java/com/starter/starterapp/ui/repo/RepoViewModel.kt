package com.starter.starterapp.ui.repo

import com.starter.starterapp.data.repositories.RepoRepository
import com.starter.starterapp.ui.base.BaseViewModel
import com.starter.starterapp.utils.ContextProviders
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

/**
 * Created by Rami El-bouhi on 24,January,2023
 */
@HiltViewModel
class RepoViewModel @Inject constructor(
    private val repository: RepoRepository,
    private val contextProviders: ContextProviders
) : BaseViewModel(contextProviders) {

    fun getUserRepos() {
        launchBlock {
            repository.getUserRepos().flowOn(contextProviders.IO)
                .collect {
                    internalState.value = RepoViewState.ReposResponse(it)
                }
        }
    }
}