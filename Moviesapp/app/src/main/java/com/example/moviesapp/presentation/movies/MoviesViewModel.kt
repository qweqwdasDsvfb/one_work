package com.example.moviesapp.presentation.movies

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.moviesapp.data.model.Result
import com.example.moviesapp.data.repository.MovieRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MoviesViewModel : ViewModel() {

    private val _topRatedMovieLists = MutableLiveData<List<Result>?>()
    val topRatedMovieLists: LiveData<List<Result>?> get() = _topRatedMovieLists

    private val movieRepository = MovieRepository()

    init {

        loadMovies()
    }

    private fun loadMovies() {
        viewModelScope.launch {

            _topRatedMovieLists.postValue(movieRepository.getMovies()?.results)
        }
    }

}