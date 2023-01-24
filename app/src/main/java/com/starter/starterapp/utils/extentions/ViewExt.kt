package com.starter.starterapp.utils.extentions

import android.content.ContextWrapper
import android.view.View
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by Rami El-bouhi on 24,January,2023
 */
fun View.getParentActivity(): AppCompatActivity? {
    var context = this.context
    while (context is ContextWrapper) {
        if (context is AppCompatActivity) {
            return context
        }
        context = context.baseContext
    }
    return null
}

fun View.show(): View {
    if (this.visibility != View.VISIBLE)
        visibility = View.VISIBLE
    return this
}

fun View.hide(): View {
    if (this.visibility != View.GONE)
        visibility = View.GONE
    return this
}