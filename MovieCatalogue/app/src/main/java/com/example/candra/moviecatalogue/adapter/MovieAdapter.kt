package com.example.candra.moviecatalogue.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.RequestManager
import com.example.candra.moviecatalogue.R
import com.example.candra.moviecatalogue.model.Movie

class MovieAdapter(private val glide: RequestManager, private val movies: List<Movie>) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        var view: View? = convertView
        val holder: MovieViewHolder

        if (view == null) {
            //The view is not a recycled one: we have to inflate
            view = LayoutInflater.from(parent?.context).inflate(R.layout.movie_item_layout, parent, false)

            holder = MovieViewHolder(view)

            view.tag = holder

        } else {
            holder = view.tag as MovieViewHolder
        }

        holder.bindItem(glide, movies[position])

        return view

    }

    override fun getItem(position: Int): Any {
        return movies[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return movies.size
    }

}

class MovieViewHolder(view: View) {
    private val movieTitleField: TextView = view.findViewById(R.id.movieTitleField)
    private val movieDescriptionField: TextView = view.findViewById(R.id.movieDescriptionField)
    private val moviePosterField: ImageView = view.findViewById(R.id.moviePosterFIeld)

    fun bindItem(glide: RequestManager, movie: Movie) {
        movieTitleField.text = movie.movieTitle
        movieDescriptionField.text = movie.overview
        glide.load(movie.moviePoster).into(moviePosterField)
    }
}