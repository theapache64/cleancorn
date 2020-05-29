package com.theapache64.cleancorn.di.modules

import com.theapache64.cleancorn.ui.main.MainViewModel
import com.theapache64.cleancorn.usecases.GetMoviesUseCase
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    single { GetMoviesUseCase(get()) }

    viewModel {
        MainViewModel(get())
    }
}