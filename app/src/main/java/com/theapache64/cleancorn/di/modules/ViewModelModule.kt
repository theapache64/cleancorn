package com.theapache64.cleancorn.di.modules

import com.theapache64.cleancorn.data.source.remote.MoviesRemoteDataSource
import com.theapache64.cleancorn.domain.usecases.GetMoviesUseCase
import com.theapache64.cleancorn.ui.main.MainViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {


    single { GetMoviesUseCase(get()) }

    viewModel {
        MainViewModel(get())
    }
}