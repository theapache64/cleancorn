package com.theapache64.cleancorn.features.movies

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.theapache64.cleancorn.domain.usecases.GetMoviesUseCase


class MoviesViewModel(private val getMovies: GetMoviesUseCase) : ViewModel() {
    val movies = liveData {
        emit(getMovies())
    }
}