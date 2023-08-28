package com.example.moviesapp.data.repository

import com.example.moviesapp.data.model.MovieModel
import com.example.moviesapp.data.network.ApiProvider

class MovieRepository {


    suspend fun getMovies(): MovieModel? {
        return try {
            ApiProvider.api.getTopRatedMovieList()
        } catch (e: Exception) {
            null
        }
    }

}