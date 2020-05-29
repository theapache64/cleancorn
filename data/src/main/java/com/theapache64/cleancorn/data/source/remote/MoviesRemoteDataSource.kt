package com.theapache64.cleancorn.data.source.remote

import com.theapache64.cleancorn.data.MoviesApi
import com.theapache64.cleancorn.data.source.MoviesDataSource

class MoviesRemoteDataSource(
    private val movieApi: MoviesApi
) : MoviesDataSource.Remote {
    override suspend fun getTop250Movies() = movieApi.getTop250Movies()
}