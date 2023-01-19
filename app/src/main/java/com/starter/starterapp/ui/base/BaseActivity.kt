package com.starter.starterapp.ui.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

/**
 * Created by Rami El-bouhi on 11,January,2023
 */
abstract class BaseActivity<VB : ViewBinding, VM : BaseViewModel>
    : AppCompatActivity() {

    lateinit var binding: VB
    protected abstract fun onBindView(): VB
    protected abstract fun setUpViews(): VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = onBindView()
        setContentView(binding.root)
        setUpViews()
    }
}