package com.theapache64.cleancorn.data.source.remote

import com.theapache64.cleancorn.data.MovieApi
import com.theapache64.cleancorn.data.source.MoviesDataSource

/**
 * Created by theapache64 : May 29 Fri,2020 @ 14:20
 * Copyright (c) 2020 ThinkPalm
 * All rights reserved
 */
class MoviesRemoteDataSource(
    private val movieApi: MovieApi
) : MoviesDataSource.Remote {
    override suspend fun getTop250Movies() = movieApi.getTop250Movies()
}