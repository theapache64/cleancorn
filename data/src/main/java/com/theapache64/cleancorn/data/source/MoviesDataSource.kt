package com.theapache64.cleancorn.data.source

import com.theapache64.cleancorn.domain.entities.Movie

interface MoviesDataSource {
    interface Remote {
        suspend fun getTop250Movies(): List<Movie>
    }
}