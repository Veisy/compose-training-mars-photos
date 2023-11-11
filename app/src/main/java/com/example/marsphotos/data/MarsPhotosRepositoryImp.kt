package com.example.marsphotos.data

import com.example.marsphotos.network.MarsApiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class MarsPhotosRepositoryImp @Inject constructor(
    private val marsPhotosApi: MarsApiService
) : MarsPhotosRepository {
    override suspend fun getMarsPhotos(): Resource<List<String>> = withContext(Dispatchers.IO) {
        try {
            Resource.Success(
                data = marsPhotosApi.getPhotos().map { it.imageSource }
            )
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Error while getting mars photos")
        }
    }
}