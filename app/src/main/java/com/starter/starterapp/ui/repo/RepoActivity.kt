package com.starter.starterapp.ui.repo

import com.starter.starterapp.databinding.ActivityRepoBinding
import com.starter.starterapp.ui.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RepoActivity : BaseActivity<ActivityRepoBinding>() {

    override fun onBindView(): ActivityRepoBinding = ActivityRepoBinding.inflate(layoutInflater)

    override fun setUpViews() = binding.apply {}
}