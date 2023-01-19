package com.starter.starterapp.ui.home

import android.widget.Toast
import com.starter.starterapp.databinding.ActivityMainBinding
import com.starter.starterapp.ui.base.BaseActivity
import com.starter.starterapp.ui.base.BaseViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, BaseViewModel>() {

    override fun onBindView(): ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)

    override fun setUpViews() = binding.apply {
        btnSample.setOnClickListener {
            Toast.makeText(this@MainActivity, "Sample", Toast.LENGTH_SHORT).show()
        }
    }
}