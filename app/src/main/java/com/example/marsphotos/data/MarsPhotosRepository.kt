package com.example.marsphotos.data

interface MarsPhotosRepository {
    suspend fun getMarsPhotos(): Resource<List<String>>
}