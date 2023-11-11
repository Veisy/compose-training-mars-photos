package com.example.marsphotos.data

import com.squareup.moshi.Json

data class MarsPhotoDTO(
    @field:Json(name = "id")
    val id: String,
    @field:Json(name = "img_src")
    val imageSource: String
)
