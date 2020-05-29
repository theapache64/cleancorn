package com.theapache64.cleancorn.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.theapache64.cleancorn.domain.usecases.GetMoviesUseCase


class MainViewModel(private val getMovies: GetMoviesUseCase) : ViewModel() {
    val movies = liveData {
        emit(getMovies())
    }
}