package com.example.android.dagger.di

import com.example.android.dagger.storage.SharedPreferencesStorage
import com.example.android.dagger.storage.Storage
import dagger.Binds
import dagger.Module

/**
 * Module tells dagger this a Dagger Module
 */
@Module
abstract class StorageModule {

    // Makes Dagger provide SharedPreferencesStorage when a storage type is requested.
    @Binds
    abstract fun provideStorage(storage: SharedPreferencesStorage): Storage
}