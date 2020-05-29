package com.theapache64.cleancorn.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.theapache64.cleancorn.usecases.GetMoviesUseCase

/**
 * Created by theapache64 : May 29 Fri,2020 @ 09:20
 * All rights reserved
 */
class MainViewModel(private val getMovies: GetMoviesUseCase) : ViewModel() {
    val movies = liveData {
        emit(getMovies())
    }
}