package com.starter.starterapp.utils

import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.coroutines.CoroutineContext

/**
 * Created by Rami El-bouhi on 11,January,2023
 */
@Singleton
open class ContextProviders @Inject constructor(){
    open val Main: CoroutineContext = Dispatchers.Main
    open val IO: CoroutineContext = Dispatchers.IO
}