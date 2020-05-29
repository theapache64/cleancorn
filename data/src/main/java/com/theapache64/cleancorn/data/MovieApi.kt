package com.theapache64.cleancorn.data

import com.theapache64.cleancorn.domain.entities.Movie
import retrofit2.http.GET


interface MovieApi {

    companion object {
        const val TOP_250_BASE_URL = "https://raw.githubusercontent.com/theapache64/top250/master/"
    }

    @GET("top250_min.json")
    suspend fun getTop250Movies(): List<Movie>
}