package com.example.marsphotos.ui.screens


sealed interface MarsUiState {
    data class Success(val photos: List<String>) : MarsUiState
    data class Error(val message: String?) : MarsUiState
    object Loading : MarsUiState
}

