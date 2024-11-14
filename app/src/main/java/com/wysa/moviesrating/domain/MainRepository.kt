package com.wysa.moviesrating.domain

import com.wysa.moviesrating.model.Movie

class MainRepository {

    suspend fun getMovies(
       apiKey: String,
       language: String,
       page: Int
    ) = RetrofitInstance.api.getMovies(apiKey, language, page)

    fun getMovies(): List<Movie> {
        return listOf(
            Movie(
                id = 1,
                title = "Inception",
                releaseYear = "2010",
                backdropUrl = "https://image.tmdb.org/t/p/w500/8aRrV5Fic5dks8lPNEkC0OBKpt9.jpg",
                isFavorite = false
            ),
            Movie(
                id = 2,
                title = "The Dark Knight",
                releaseYear = "2008",
                backdropUrl = "https://image.tmdb.org/t/p/w500/qJr71P6T0MPXhIHffW4rYppqim5.jpg",
                isFavorite = true
            ),
            Movie(
                id = 3,
                title = "Interstellar",
                releaseYear = "2014",
                backdropUrl = "https://image.tmdb.org/t/p/w500/rIl4wPTTz80V3NcJeouBGqGxtv4.jpg",
                isFavorite = false
            ),
            Movie(
                id = 4,
                title = "The Matrix",
                releaseYear = "1999",
                backdropUrl = "https://image.tmdb.org/t/p/w500/vjj9uSvsw61g7OHObJ2jqTfoh51.jpg",
                isFavorite = true
            ),
            Movie(
                id = 5,
                title = "Avatar",
                releaseYear = "2009",
                backdropUrl = "https://image.tmdb.org/t/p/w500/8xeNxT2oGH0e2gQ9MmC0d5IBIYZ.jpg",
                isFavorite = false
            )
        )
    }
}