package com.wysa.moviesrating.screen

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.rememberImagePainter
import com.wysa.moviesrating.R
import com.wysa.moviesrating.model.Movie
import com.wysa.moviesrating.model.MovieData
import com.wysa.moviesrating.ui.theme.MoviesRatingTheme
import com.wysa.moviesrating.viewmodel.MovieListViewModel

@Composable
fun MovieDetailScreen(
    movieId: Int,
) {
//    val movie = movieViewModel.movies.find { it.id == movieId }
    val movie = MovieData.getHardcodedMovies().find { it.id == movieId }

    if (movie != null) {
        Column(modifier = Modifier.fillMaxSize()
            ) {
            Spacer(modifier = Modifier.height(40.dp))
            Image(
                painter = rememberImagePainter(R.drawable.movie),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Movie title
            Text(text = movie.title, style = MaterialTheme.typography.headlineLarge, modifier = Modifier.padding(16.dp))

            // Movie details
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = "Release Date: ${movie.releaseYear}")
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "Language: Hindi")
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "Rating: 8.5/10") // Static rating for now, can be updated with real data
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "Description: Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.")
            }
        }
    } else {
        Text(text = "Movie not found")
    }
}

@Preview(showBackground = true)
@Composable
fun MoviePreview() {
    MoviesRatingTheme {
        MovieDetailScreen(0)
    }
}