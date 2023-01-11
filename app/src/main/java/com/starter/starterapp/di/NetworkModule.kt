package com.starter.starterapp.di

import com.starter.starterapp.data.remote.ApiService
import com.starter.starterapp.data.remote.RetroClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Created by Rami El-bouhi on 11,January,2023
 */
@InstallIn(SingletonComponent::class)
@Module
object NetworkModule {

    @Singleton
    @Provides
    fun provideApiService(): ApiService {
        return RetroClient.create()
    }
}