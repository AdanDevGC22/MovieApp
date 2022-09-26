package agonzalez.android.peliculasapp.example.ui.movie

import agonzalez.android.peliculasapp.R
import agonzalez.android.peliculasapp.databinding.FragmentMovieBinding
import agonzalez.android.peliculasapp.example.core.Resource
import agonzalez.android.peliculasapp.example.data.remote.MovieDataSource
import agonzalez.android.peliculasapp.example.presentation.MovieViewModel
import agonzalez.android.peliculasapp.example.presentation.MovieViewModelFactory
import agonzalez.android.peliculasapp.example.repository.MovieRepositoryImpl
import agonzalez.android.peliculasapp.example.repository.RetrofitClient
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer

class MovieFragment : Fragment(R.layout.fragment_movie) {
    private lateinit var binding: FragmentMovieBinding
    private val viewModel by viewModels<MovieViewModel> {
        MovieViewModelFactory(
            MovieRepositoryImpl(
                MovieDataSource(RetrofitClient.webservice)
            )
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMovieBinding.bind(view)

        viewModel.fetchMainScreenMovies().observe(viewLifecycleOwner, Observer { result ->
            when(result){
                is Resource.Loading ->{
                    Log.d("LiveData", "Loading... ")
                }
                is Resource.Success ->{
                    Log.d("LiveData:", "Upcoming: ${result.data.first} \n\n TopRated: ${result.data.second} \n\n ${result.data.third}")
                }
                is Resource.Failure ->{
                    Log.d("Error", "${result.exception}")
                }
            }
        })
    }
}