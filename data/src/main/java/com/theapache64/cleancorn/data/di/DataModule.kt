package com.theapache64.cleancorn.data.di

import com.theapache64.cleancorn.data.repo.MoviesDataRepo
import com.theapache64.cleancorn.data.source.remote.MoviesRemoteDataSource
import com.theapache64.cleancorn.domain.repos.MoviesRepo
import org.koin.dsl.module


val repoModule = module {

    single {
        MoviesRemoteDataSource(get())
    }

    single<MoviesRepo> {
        MoviesDataRepo(get())
    }

}