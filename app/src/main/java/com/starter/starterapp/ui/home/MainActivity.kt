package com.starter.starterapp.ui.home

import android.content.Intent
import androidx.activity.viewModels
import com.starter.starterapp.databinding.ActivityMainBinding
import com.starter.starterapp.ui.base.BaseActivity
import com.starter.starterapp.ui.base.BaseViewModel
import com.starter.starterapp.ui.base.ViewState
import com.starter.starterapp.ui.repo.RepoActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun onBindView(): ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)

    override fun setUpViews() = binding.apply {
        btnSample.setOnClickListener {
            startActivity(Intent(this@MainActivity, RepoActivity::class.java))
        }
    }
}