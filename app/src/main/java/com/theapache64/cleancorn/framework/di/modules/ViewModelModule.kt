package com.theapache64.cleancorn.framework.di.modules

import com.theapache64.cleancorn.ui.main.MainViewModel
import com.theapache64.cleancorn.usecases.GetMoviesUseCase
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by theapache64 : May 29 Fri,2020 @ 09:26
 * All rights reserved
 */
val viewModelModule = module {

    single { GetMoviesUseCase(get()) }

    viewModel {
        MainViewModel(get())
    }
}