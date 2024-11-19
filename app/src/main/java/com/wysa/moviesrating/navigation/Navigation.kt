package com.wysa.moviesrating.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.wysa.moviesrating.model.Movie
import com.wysa.moviesrating.screen.MovieDetailScreen
import com.wysa.moviesrating.screen.MovieListScreen

@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.MainScreen.route) {
        composable(route = Screen.MainScreen.route) {
            MovieListScreen(navController, getHardcodedMovies(), onLanguageChange = {})
        }
        composable(
            route = Screen.DetailScreen.route,
            arguments = listOf(navArgument("movieId") { type = NavType.IntType })
        ) { backStackEntry ->
            val movieId = backStackEntry.arguments?.getInt("movieId") ?: -1
            MovieDetailScreen(movieId)
        }
    }
}

fun getHardcodedMovies(): List<Movie> {
    return listOf(
        Movie(1, "Inception", "2010", "https://image.tmdb.org/t/p/w500/8aRrV5Fic5dks8lPNEkC0OBKpt9.jpg", false, "English"),
        Movie(2, "The Dark Knight", "2008", "https://image.tmdb.org/t/p/w500/qJr71P6T0MPXhIHffW4rYppqim5.jpg", false,"English"),
        Movie(3, "Interstellar", "2014", "https://image.tmdb.org/t/p/w500/rIl4wPTTz80V3NcJeouBGqGxtv4.jpg", false,"English"),
        Movie(4, "The Matrix", "1999", "https://image.tmdb.org/t/p/w500/vjj9uSvsw61g7OHObJ2jqTfoh51.jpg", false,"English"),
        Movie(5, "Avatar", "2009", "https://image.tmdb.org/t/p/w500/8xeNxT2oGH0e2gQ9MmC0d5IBIYZ.jpg", false,"Hindi"),
        Movie(6, "Inception", "2010", "https://image.tmdb.org/t/p/w500/8aRrV5Fic5dks8lPNEkC0OBKpt9.jpg", false,"English"),
        Movie(7, "The Dark Knight", "2008", "https://image.tmdb.org/t/p/w500/qJr71P6T0MPXhIHffW4rYppqim5.jpg", false,"English"),
        Movie(8, "Inception", "2010", "https://image.tmdb.org/t/p/w500/8aRrV5Fic5dks8lPNEkC0OBKpt9.jpg", false, "English"),
        Movie(9, "The Dark Knight", "2008", "https://image.tmdb.org/t/p/w500/qJr71P6T0MPXhIHffW4rYppqim5.jpg", false,"English"),
        Movie(10, "Interstellar", "2014", "https://image.tmdb.org/t/p/w500/rIl4wPTTz80V3NcJeouBGqGxtv4.jpg", false,"Hindi"),
        Movie(11, "The Matrix", "1999", "https://image.tmdb.org/t/p/w500/vjj9uSvsw61g7OHObJ2jqTfoh51.jpg", false,"English"),
        Movie(12, "Avatar", "2009", "https://image.tmdb.org/t/p/w500/8xeNxT2oGH0e2gQ9MmC0d5IBIYZ.jpg", false,"English"),
        Movie(13, "Inception", "2010", "https://image.tmdb.org/t/p/w500/8aRrV5Fic5dks8lPNEkC0OBKpt9.jpg", false,"English"),
        Movie(14, "The Dark Knight", "2008", "https://image.tmdb.org/t/p/w500/qJr71P6T0MPXhIHffW4rYppqim5.jpg", false,"English"),
        Movie(15, "Inception", "2010", "https://image.tmdb.org/t/p/w500/8aRrV5Fic5dks8lPNEkC0OBKpt9.jpg", false, "Hindi"),
        Movie(16, "The Dark Knight", "2008", "https://image.tmdb.org/t/p/w500/qJr71P6T0MPXhIHffW4rYppqim5.jpg", false,"English"),
        Movie(17, "Interstellar", "2014", "https://image.tmdb.org/t/p/w500/rIl4wPTTz80V3NcJeouBGqGxtv4.jpg", false,"English"),
        Movie(18, "The Matrix", "1999", "https://image.tmdb.org/t/p/w500/vjj9uSvsw61g7OHObJ2jqTfoh51.jpg", false,"English"),
        Movie(18, "Avatar", "2009", "https://image.tmdb.org/t/p/w500/8xeNxT2oGH0e2gQ9MmC0d5IBIYZ.jpg", false,"English"),
        Movie(19, "Inception", "2010", "https://image.tmdb.org/t/p/w500/8aRrV5Fic5dks8lPNEkC0OBKpt9.jpg", false,"English"),
        Movie(20, "The Dark Knight", "2008", "https://image.tmdb.org/t/p/w500/qJr71P6T0MPXhIHffW4rYppqim5.jpg", false,"English"),

    )
}