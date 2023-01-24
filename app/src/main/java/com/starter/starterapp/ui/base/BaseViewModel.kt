package com.starter.starterapp.ui.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.starter.starterapp.utils.ContextProviders
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Created by Rami El-bouhi on 11,January,2023
 */
open class BaseViewModel(private val contextProvider: ContextProviders) :
    ViewModel() {

    internal val internalState = MutableLiveData<ViewState>()

    val state: LiveData<ViewState> = internalState

    private val coroutineExceptionHandler = CoroutineExceptionHandler { _, throwable ->
        internalState.value = ViewState.Error(throwable.message)
    }

    fun launchBlock(block: suspend CoroutineScope.() -> Unit) {
        internalState.value = ViewState.Loading
        viewModelScope.launch(contextProvider.Main + coroutineExceptionHandler) {
            block.invoke(this)
        }
    }
}