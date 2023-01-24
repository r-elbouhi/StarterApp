package com.starter.starterapp.ui.repo

import androidx.fragment.app.viewModels
import com.starter.starterapp.data.local.models.Repo
import com.starter.starterapp.databinding.FragmentRepoBinding
import com.starter.starterapp.ui.base.BaseFragment
import com.starter.starterapp.ui.base.ViewState
import com.starter.starterapp.ui.repo.adapter.RepoAdapter
import com.starter.starterapp.utils.extentions.hide
import com.starter.starterapp.utils.extentions.show
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RepoFragment : BaseFragment<FragmentRepoBinding, RepoViewModel>() {

    override val viewModel: RepoViewModel by viewModels()
    override fun onBindView(): FragmentRepoBinding = FragmentRepoBinding.inflate(layoutInflater)
    private val repoAdapter: RepoAdapter = RepoAdapter { repo -> onRepoClick(repo) }

    override fun setUpViews() = binding?.apply {
        rvRepos.apply {
            adapter = repoAdapter
        }
        viewModel.getUserRepos()
    }

    override fun showLoading() {
        binding?.apply {
            pbLoading.show()
        }
    }

    override fun hideLoading() {
        binding?.apply {
            pbLoading.hide()
        }
    }

    override fun render(state: ViewState) {
        when (state) {
            is RepoViewState.ReposResponse -> {
                repoAdapter.submitList(state.repos)
            }
        }
    }

    private fun onRepoClick(repo: Repo) {
        // click repo
    }
}