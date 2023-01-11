package com.starter.starterapp.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.viewbinding.ViewBinding

/**
 * Created by Rami El-bouhi on 11,January,2023
 */
abstract class BaseFragment<VB : ViewBinding, VM : BaseViewModel> : Fragment() {

    var binding: VB? = null
    protected abstract fun onBindView(): VB?

    //    private lateinit var loadingDialog: LoadingDialog
    protected abstract val viewModel: VM
    protected abstract fun setUpViews(): VB?
    abstract fun render(state: ViewState)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = onBindView()
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpViews()
        viewModel.state.observe(viewLifecycleOwner) { baseRender(it) }
    }

    private fun baseRender(state: ViewState) {
        when (state) {
            is ViewState.Loading -> showLoading()
            is ViewState.Error -> showError(state.error)
            else -> {
                hideLoading()
                render(state)
            }
        }
    }

    // not private for the sake of overriding in case of custom implementation for specific screens
    fun showLoading() {
//        loadingDialog.show()
    }

    // not private for the sake of overriding in case of custom implementation for specific screens
    fun hideLoading() {
//        loadingDialog.hide()
    }

    fun showError(errorModel: String?) {
        hideLoading()
        Toast.makeText(context, errorModel, Toast.LENGTH_SHORT).show()
    }
}