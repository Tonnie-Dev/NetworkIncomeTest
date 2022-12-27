package com.uxstate.networkincometest.di

import com.uxstate.networkincometest.data.remote.repository.IncomeRepositoryImpl
import com.uxstate.networkincometest.domain.repository.IncomeRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindScoresRepository(repositoryImpl: IncomeRepositoryImpl): IncomeRepository
}