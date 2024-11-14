package com.wysa.moviesrating

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.wysa.moviesrating.model.Movie
import com.wysa.moviesrating.model.Screen
import com.wysa.moviesrating.screen.MovieDetailScreen
import com.wysa.moviesrating.screen.MovieListScreen

@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController,  startDestination = Screen.MainScreen.route ){
        composable(route = Screen.MainScreen.route){
            MovieListScreen( getHardcodedMovies() ,onLanguageChange ={} )
        }

        composable(route = Screen.DetailScreen.route){
            MovieDetailScreen()
        }
    }
}

fun getHardcodedMovies(): List<Movie> {
    return listOf(
        Movie(1, "Inception", "2010", "https://image.tmdb.org/t/p/w500/8aRrV5Fic5dks8lPNEkC0OBKpt9.jpg", false),
        Movie(2, "The Dark Knight", "2008", "https://image.tmdb.org/t/p/w500/qJr71P6T0MPXhIHffW4rYppqim5.jpg", false),
        Movie(3, "Interstellar", "2014", "https://image.tmdb.org/t/p/w500/rIl4wPTTz80V3NcJeouBGqGxtv4.jpg", false),
        Movie(4, "The Matrix", "1999", "https://image.tmdb.org/t/p/w500/vjj9uSvsw61g7OHObJ2jqTfoh51.jpg", false),
        Movie(5, "Avatar", "2009", "https://image.tmdb.org/t/p/w500/8xeNxT2oGH0e2gQ9MmC0d5IBIYZ.jpg", false)
    )
}