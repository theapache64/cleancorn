package com.theapache64.cleancorn.data.repos

import com.theapache64.cleancorn.data.remote.ApiInterface

/**
 * Created by theapache64 : May 29 Fri,2020 @ 09:22
 * Copyright (c) 2020 ThinkPalm
 * All rights reserved
 */
class MoviesRepo(private val apiInterface: ApiInterface) {
    suspend fun getMovies() = apiInterface.getTop250Movies()
}