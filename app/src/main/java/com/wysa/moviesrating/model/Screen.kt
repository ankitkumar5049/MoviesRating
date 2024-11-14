package com.wysa.moviesrating.model

sealed class Screen(val route: String) {
     object MainScreen : Screen("screen1")
     object DetailScreen : Screen("screen2")
}