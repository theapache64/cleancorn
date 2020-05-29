package com.theapache64.cleancorn.data.repo

import com.theapache64.cleancorn.data.ApiInterface

class MoviesRepo(private val apiInterface: ApiInterface) {
    suspend fun getMovies() = apiInterface.getTop250Movies()
}