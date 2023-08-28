package com.example.moviesapp.presentation.movies

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.NavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.moviesapp.R
import com.example.moviesapp.data.model.Result


class MoviesAdapter(
    private val movieList: List<Result>?,
    private val navController: NavController
) :
    RecyclerView.Adapter<MoviesAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        companion object {
            // початок URL зображення
            const val MOVIE_IMAGE_PATH_TEMPLATE = "https://image.tmdb.org/t/p/w500"
        }

        fun applyUi(movie: Result, navController: NavController) {
            val imageView: ImageView = itemView.findViewById(R.id.image)
            val titleTextView: TextView = itemView.findViewById(R.id.title)
            val ratingTextView: TextView = itemView.findViewById(R.id.rating)
            val releaseDateTextView: TextView = itemView.findViewById(R.id.release_date)
            val root: View = itemView.findViewById(R.id.root)

            // елемент у списку RecyclerView
            titleTextView.text = movie.title
            ratingTextView.text = movie.voteAverage.toString()
            releaseDateTextView.text = movie.releaseDate

            Glide.with(imageView.context).load(MOVIE_IMAGE_PATH_TEMPLATE + movie.posterPath)
                .into(imageView)


            root.setOnClickListener {
                navController.navigate(

                    MoviesFragmentDirections.actionMoviesFragmentToDetailsFragment(movie)
                )
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val movie = movieList?.get(position)
        if (movie != null) {
            holder.applyUi(movie = movie, navController = navController)
        }
    }

    override fun getItemCount(): Int {
        return movieList?.size ?: 0
    }
}