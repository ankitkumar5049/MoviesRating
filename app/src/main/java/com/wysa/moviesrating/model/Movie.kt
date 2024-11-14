package com.wysa.moviesrating.model

data class Movie(
    val id: Int,
    val title: String,
    val releaseYear: String,
    val backdropUrl: String,
    var isFavorite: Boolean,
    var language: String
)
