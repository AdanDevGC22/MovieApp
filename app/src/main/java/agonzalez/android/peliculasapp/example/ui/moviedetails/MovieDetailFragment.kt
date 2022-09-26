package agonzalez.android.peliculasapp.example.ui.moviedetails

import agonzalez.android.peliculasapp.R
import agonzalez.android.peliculasapp.databinding.FragmentMovieDetailBinding
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment



class MovieDetailFragment : Fragment(R.layout.fragment_movie_detail) {
    private lateinit var binding: FragmentMovieDetailBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMovieDetailBinding.bind(view)
    }

}