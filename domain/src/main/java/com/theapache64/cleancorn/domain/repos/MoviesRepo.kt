package com.theapache64.cleancorn.domain.repos

import com.theapache64.cleancorn.domain.entities.Movie

/**
 * Created by theapache64 : May 29 Fri,2020 @ 14:16
 * Copyright (c) 2020 ThinkPalm
 * All rights reserved
 */
interface MoviesRepo {
    suspend fun getMovies(): List<Movie>
}