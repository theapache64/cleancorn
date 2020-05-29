package com.theapache64.cleancorn.di.modules

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import com.theapache64.cleancorn.data.MovieApi
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
            .baseUrl(MovieApi.TOP_250_BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create(get()))
            .build()
            .create(MovieApi::class.java)
    }


}