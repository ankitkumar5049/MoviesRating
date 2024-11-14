package com.wysa.moviesrating.domain

import com.wysa.moviesrating.model.Movie

class MainRepository {

    suspend fun getMovies(
       apiKey: String,
       language: String,
       page: Int
    ) = RetrofitInstance.api.getMovies(apiKey, language, page)


}