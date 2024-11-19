package com.wysa.moviesrating.navigation

sealed class Screen(val route: String) {
     object MainScreen : Screen("screen1")
     object DetailScreen : Screen("screen2/{movieId}") {
          fun createRoute(movieId: Int): String = "screen2/$movieId"
     }
}
