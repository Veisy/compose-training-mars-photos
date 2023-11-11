package com.example.marsphotos.network

import com.example.marsphotos.data.MarsPhotoDTO
import retrofit2.http.GET


const val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com"

interface MarsApiService {
    @GET("photos")
    suspend fun getPhotos(): List<MarsPhotoDTO>
}