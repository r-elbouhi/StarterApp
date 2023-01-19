package com.starter.starterapp.ui.base

import com.starter.starterapp.data.repositories.DataSource
import javax.inject.Inject

/**
 * Created by Rami El-bouhi on 11,January,2023
 */
class BaseRepository @Inject constructor(private val dataSource: DataSource) {

}