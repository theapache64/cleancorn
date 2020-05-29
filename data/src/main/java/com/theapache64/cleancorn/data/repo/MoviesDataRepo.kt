package com.theapache64.cleancorn.data.repo

import com.theapache64.cleancorn.data.source.remote.MoviesRemoteDataSource
import com.theapache64.cleancorn.domain.repos.MoviesRepo

class MoviesDataRepo(
    private val moviesRemoteDataSource: MoviesRemoteDataSource
) : MoviesRepo {
    override suspend fun getMovies() = moviesRemoteDataSource.getTop250Movies()
}