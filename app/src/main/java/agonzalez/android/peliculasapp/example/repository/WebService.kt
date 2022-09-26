package agonzalez.android.peliculasapp.example.repository

import agonzalez.android.peliculasapp.example.application.AppConstants
import agonzalez.android.peliculasapp.example.data.model.MovieList
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface WebService {
    // WebService  es el encargado de usar Retrofit
    @GET("movie/upcoming")
    suspend fun getUpcomingMovies(@Query ("api_key") apiKey: String): MovieList

    @GET("movie/top_rated")
    suspend fun getTopRatedMovies(@Query ("api_key") apiKey: String): MovieList

    @GET("movie/popular")
    suspend fun getPopulardMovies(@Query ("api_key") apiKey: String): MovieList
}

object RetrofitClient{

    //se usa lazy para que solo se inicialice esta variable cuando se llame a RetrofitClient.webservice
    // solo se inicializa cuando llame a webservice, no lo hace antes
    val webservice by lazy {
        Retrofit.Builder()
            .baseUrl(AppConstants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build().create(WebService::class.java)
    }
}