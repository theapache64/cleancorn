package com.theapache64.cleancorn.domain.repos

import com.theapache64.cleancorn.domain.entities.Movie

interface MoviesRepo {
    suspend fun getMovies(): List<Movie>
}