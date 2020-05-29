package com.theapache64.cleancorn.framework.di.modules

import com.theapache64.cleancorn.data.repo.MoviesRepo
import org.koin.dsl.module

/**
 * Created by theapache64 : May 29 Fri,2020 @ 09:56
 * All rights reserved
 */
val repoModule = module {
    single {
        MoviesRepo(get())
    }
}