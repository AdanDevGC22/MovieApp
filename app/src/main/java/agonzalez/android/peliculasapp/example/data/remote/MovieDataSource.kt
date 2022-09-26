package agonzalez.android.peliculasapp.example.data.remote

import agonzalez.android.peliculasapp.example.application.AppConstants
import agonzalez.android.peliculasapp.example.data.model.MovieList
import agonzalez.android.peliculasapp.example.repository.WebService

class MovieDataSource(private val webService: WebService) {

    suspend fun getUpcomingMovies(): MovieList {
        return webService.getUpcomingMovies(AppConstants.API_KEY)
    }

    suspend fun getTopRatedMovies(): MovieList {
        return webService.getTopRatedMovies(AppConstants.API_KEY)
    }

    suspend fun getPopularMovies(): MovieList {
        return webService.getPopulardMovies(AppConstants.API_KEY)
    }
}