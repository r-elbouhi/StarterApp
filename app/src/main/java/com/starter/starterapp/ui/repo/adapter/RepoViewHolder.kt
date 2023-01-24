package com.starter.starterapp.ui.repo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.starter.starterapp.R
import com.starter.starterapp.data.local.models.Repo
import com.starter.starterapp.databinding.CustomRepoRowLayoutBinding

/**
 * Created by Rami El-bouhi on 24,January,2023
 */
class RepoViewHolder (private val binding: CustomRepoRowLayoutBinding, onClick: (Repo) -> Unit) :
    RecyclerView.ViewHolder(binding.root) {
    private var currentRepo: Repo? = null

    init {
        binding.itemView.setOnClickListener {
            currentRepo?.let {
                onClick(it)
            }
        }
    }

    companion object {
        fun create(parent: ViewGroup, onClick: (Repo) -> Unit): RepoViewHolder {
            val binding: CustomRepoRowLayoutBinding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.custom_repo_row_layout,
                parent,
                false
            )
            return RepoViewHolder(binding, onClick)
        }
    }

    private val viewModel = RepoRowViewModel()

    fun bind(repo: Repo) {
        currentRepo = repo
        viewModel.bind(repo)
        binding.viewModel = viewModel
    }
}