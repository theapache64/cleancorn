package com.theapache64.cleancorn.domain

import com.squareup.moshi.Json


/**
 * Created by theapache64 : May 29 Fri,2020 @ 10:10
* All rights reserved
 */
data class Movie(
    @Json(name = "name")
    val name: String // Yôjinbô
)