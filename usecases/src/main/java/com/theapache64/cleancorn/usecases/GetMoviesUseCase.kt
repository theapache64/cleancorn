package com.theapache64.cleancorn.usecases

import com.theapache64.cleancorn.data.repo.MoviesRepo


class GetMoviesUseCase(private val moviesRepo: MoviesRepo) {
    suspend operator fun invoke() = moviesRepo.getMovies()
}