package com.theapache64.cleancorn.domain.entities

import com.squareup.moshi.Json

data class Movie(
    @Json(name = "name")
    val name: String // Yôjinbô
)