package com.theapache64.cleancorn.framework.di.modules

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import com.theapache64.cleancorn.data.ApiInterface
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

    // Retrofit
    single {
        Retrofit.Builder()
            .baseUrl(ApiInterface.TOP_250_BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create(get()))
            .build()
            .create(ApiInterface::class.java)
    }
}