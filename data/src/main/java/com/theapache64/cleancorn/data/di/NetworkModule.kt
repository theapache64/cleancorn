package com.theapache64.cleancorn.data.di

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import com.theapache64.cleancorn.data.MoviesApi
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

val networkModule = module {

    // Moshi
    single {
        Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
    }

    // Movie Api
    single {
        Retrofit.Builder()
            .baseUrl(MoviesApi.TOP_250_BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create(get()))
            .build()
            .create(MoviesApi::class.java)
    }


}