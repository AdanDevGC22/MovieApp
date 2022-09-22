package agonzalez.android.peliculasapp

import agonzalez.android.peliculasapp.databinding.FragmentMovieBinding
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View

class MovieFragment : Fragment(R.layout.fragment_movie) {
    private lateinit var binding:FragmentMovieBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMovieBinding.bind(view)
    }
}