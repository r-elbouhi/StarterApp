package com.starter.starterapp.ui.repo.adapter

import androidx.lifecycle.MutableLiveData
import com.starter.starterapp.data.local.models.Repo

/**
 * Created by Rami El-bouhi on 24,January,2023
 */
class RepoRowViewModel {
    val id = MutableLiveData<String>()
    val name = MutableLiveData<String>()

    fun bind(repo: Repo) {
        id.value = repo.id.toString()
        name.value = repo.name ?: ""
    }
}