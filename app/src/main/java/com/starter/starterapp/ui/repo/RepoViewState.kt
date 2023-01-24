package com.starter.starterapp.ui.repo

import com.starter.starterapp.data.local.models.Repo
import com.starter.starterapp.ui.base.ViewState

/**
 * Created by Rami El-bouhi on 24,January,2023
 */
class RepoViewState : ViewState() {
    data class ReposResponse(val repos: List<Repo>?) : Loaded<List<Repo>?>(repos)
}