package com.theapache64.cleancorn.di.modules

import com.theapache64.cleancorn.ui.main.MainViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by theapache64 : May 29 Fri,2020 @ 09:26
 * Copyright (c) 2020 ThinkPalm
 * All rights reserved
 */
val viewModelModule = module {
    viewModel { MainViewModel(get()) }
}