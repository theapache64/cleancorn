package com.theapache64.cleancorn.di.modules

import com.theapache64.cleancorn.data.repo.MoviesRepo
import org.koin.dsl.module


val repoModule = module {
    single {
        MoviesRepo(get())
    }
}