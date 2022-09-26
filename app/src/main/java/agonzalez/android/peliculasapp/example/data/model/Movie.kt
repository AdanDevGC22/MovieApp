package agonzalez.android.peliculasapp.example.data.model

import com.google.gson.annotations.SerializedName

data class Movie(
    // ctr + alt + l = identa el codigo

    val id: Int = -1,
    //@SerializedName("adult") = si quiero cambiarle el nombre
    //val adulto: Boolean = false,
    val adult: Boolean = false,
    val genre_ids: List<Int> = listOf(),
    val backdrop_path: String = "",
    val original_title: String ="",
    val original_language: String = "",
    val overview: String = "",
    val popularity: Double = -1.0,
    val poster_path: String = "",
    val release_date: String = "",
    val title: String = "",
    val video: Boolean = false,
    val vote_average: Double = -1.0,
    val vote_count: Int = -1
    )

data class MovieList(val results: List<Movie> = listOf())