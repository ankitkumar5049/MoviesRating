package com.wysa.moviesrating.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.wysa.moviesrating.domain.MainRepository
import com.wysa.moviesrating.model.Movie
import com.wysa.moviesrating.model.MovieResponse
import kotlinx.coroutines.launch

class MovieListViewModel: ViewModel() {
    private var api_key = ""
    private val movieRepository = MainRepository()

    var movies: List<Movie> = emptyList()
        private set

    var loading: Boolean = false
        private set

}