package agonzalez.android.peliculasapp.example.repository

import agonzalez.android.peliculasapp.example.data.model.MovieList

interface MovieRepository {
    // para usar corrutinas usamos suspend
    suspend fun getUpcomingMovies(): MovieList
    suspend fun getTopRatedMovies(): MovieList
    suspend fun getPopularMovies(): MovieList
}