package com.starter.starterapp.data.repositories

import javax.inject.Inject

/**
 * Created by Rami El-bouhi on 11,January,2023
 */
open class Repository @Inject constructor(private val dataSource: DataSource) {
}