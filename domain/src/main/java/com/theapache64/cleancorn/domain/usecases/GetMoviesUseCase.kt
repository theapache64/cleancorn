package com.theapache64.cleancorn.domain.usecases

import com.theapache64.cleancorn.domain.repos.MoviesRepo

class GetMoviesUseCase(private val moviesRepo: MoviesRepo) {
    suspend operator fun invoke() = moviesRepo.getMovies()
}