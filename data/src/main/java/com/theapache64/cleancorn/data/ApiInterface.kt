package com.theapache64.cleancorn.data

import com.theapache64.cleancorn.domain.Movie
import retrofit2.http.GET

/**
 * Created by theapache64 : May 29 Fri,2020 @ 09:20
* All rights reserved
 */
interface ApiInterface {

    companion object {
        const val TOP_250_BASE_URL = "https://raw.githubusercontent.com/theapache64/top250/master/"
    }

    @GET("top250_min.json")
    suspend fun getTop250Movies(): List<Movie>
}