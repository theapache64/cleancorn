package com.theapache64.cleancorn.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.theapache64.cleancorn.data.repos.MoviesRepo

/**
 * Created by theapache64 : May 29 Fri,2020 @ 09:20
 * Copyright (c) 2020 ThinkPalm
 * All rights reserved
 */
class MainViewModel(private val moviesRepo: MoviesRepo) : ViewModel() {

    val movies = liveData {
        val movies = moviesRepo.getMovies()
        emit(movies)
    }
}