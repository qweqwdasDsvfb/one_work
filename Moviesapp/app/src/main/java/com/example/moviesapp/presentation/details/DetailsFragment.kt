package com.example.moviesapp.presentation.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.moviesapp.databinding.FragmentDetailsBinding
import com.example.moviesapp.presentation.movies.MoviesAdapter.ViewHolder.Companion.MOVIE_IMAGE_PATH_TEMPLATE

class DetailsFragment : Fragment() {
    private var _binding: FragmentDetailsBinding? = null
    private val binding get() = _binding!!
    private val args: DetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val movie = args.movie

        binding.title.text = movie.title
        binding.releaseDate.text = movie.releaseDate
        binding.overview.text = movie.overview
        Glide.with(requireContext()).load(MOVIE_IMAGE_PATH_TEMPLATE + movie.posterPath)
            .into(binding.image)
    }
}