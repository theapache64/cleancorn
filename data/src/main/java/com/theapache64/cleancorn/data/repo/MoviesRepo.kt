package com.theapache64.cleancorn.data.repo

import com.theapache64.cleancorn.data.ApiInterface


/**
 * Created by theapache64 : May 29 Fri,2020 @ 09:22
* All rights reserved
 */
class MoviesRepo(private val apiInterface: ApiInterface) {
    suspend fun getMovies() = apiInterface.getTop250Movies()
}