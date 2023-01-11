package com.starter.starterapp.ui.base

/**
 * Created by Rami El-bouhi on 11,January,2023
 */
abstract class ViewState {
    object Loading : ViewState()
    data class Error(val error: String?) : ViewState()
    abstract class Loaded<out T>(val result: T) : ViewState()
    object Empty : ViewState()
}