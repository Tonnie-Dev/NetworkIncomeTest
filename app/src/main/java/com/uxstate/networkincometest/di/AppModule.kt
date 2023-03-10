package com.uxstate.networkincometest.di

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import com.uxstate.networkincometest.data.remote.api.IncomeAPI
import com.uxstate.networkincometest.domain.repository.IncomeRepository
import com.uxstate.networkincometest.domain.use_cases.GetIncomeUseCase
import com.uxstate.networkincometest.domain.use_cases.UseCaseContainer
import com.uxstate.networkincometest.util.Constants.BASE_URL
import com.uxstate.networkincometest.util.Constants.CONNECT_TIMEOUT
import com.uxstate.networkincometest.util.Constants.READ_TIMEOUT
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideHttpLoggingInterceptor(): HttpLoggingInterceptor {

        return HttpLoggingInterceptor().apply {

            level = HttpLoggingInterceptor.Level.BODY
        }
    }

    /* connect timeout defines a time period in which our
       client should establish a connection with a target host.
  By default, for the OkHttpClient, this timeout is set to 10 seconds.   */

    /*maximum time of inactivity between two data packets when waiting for the
    server's response.The default timeout of 10 seconds */
    @Provides
    @Singleton

    fun provideOkHttpClient(interceptor: HttpLoggingInterceptor): OkHttpClient {

        return OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .connectTimeout(CONNECT_TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(READ_TIMEOUT, TimeUnit.SECONDS)
                .build()
    }

    @Provides
    @Singleton
    fun provideScoresAPI(okHttpClient: OkHttpClient): IncomeAPI {
        val moshi = Moshi.Builder()
                .addLast(KotlinJsonAdapterFactory())
                .build()
        return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(
                        MoshiConverterFactory.create(moshi)
                                .asLenient()
                )
                .client(okHttpClient)
                .build()
                .create()
    }

    @Provides
    @Singleton
    fun provideUseCaseContainer(repository: IncomeRepository): UseCaseContainer {
        return UseCaseContainer(

                getIncomeUseCase = GetIncomeUseCase(repository = repository)
        )
    }
}