package com.theapache64.cleancorn.data.source

import com.theapache64.cleancorn.domain.entities.Movie

/**
 * Created by theapache64 : May 29 Fri,2020 @ 14:19
 * Copyright (c) 2020 ThinkPalm
 * All rights reserved
 */
interface MoviesDataSource {
    interface Remote {
        suspend fun getTop250Movies(): List<Movie>
    }
}