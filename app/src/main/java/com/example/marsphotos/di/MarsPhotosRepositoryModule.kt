package com.example.marsphotos.di

import com.example.marsphotos.data.MarsPhotosRepository
import com.example.marsphotos.data.MarsPhotosRepositoryImp
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class MarsPhotosRepositoryModule {

    @Binds
    @Singleton
    abstract fun bindMarsPhotosRepository(marsPhotosRepositoryImp: MarsPhotosRepositoryImp): MarsPhotosRepository
}