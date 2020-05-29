package com.theapache64.cleancorn.usecases

import com.theapache64.cleancorn.data.repo.MoviesRepo

/**
 * Created by theapache64 : May 29 Fri,2020 @ 11:14
 * All rights reserved
 */
class GetMoviesUseCase(private val moviesRepo: MoviesRepo) {
    suspend operator fun invoke() = moviesRepo.getMovies()
}