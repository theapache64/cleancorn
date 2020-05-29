package com.theapache64.cleancorn.di.modules

import com.theapache64.cleancorn.data.repos.MoviesRepo
import org.koin.dsl.module

/**
 * Created by theapache64 : May 29 Fri,2020 @ 09:56
 * Copyright (c) 2020 ThinkPalm
 * All rights reserved
 */
val repoModule = module {
    single {
        MoviesRepo(get())
    }
}