package com.example.candra.moviecatalogue

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import com.bumptech.glide.Glide
import com.example.candra.moviecatalogue.adapter.CastAdapter
import com.example.candra.moviecatalogue.model.Cast
import com.example.candra.moviecatalogue.model.Movie
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    private lateinit var adapter: CastAdapter
    private lateinit var movie: Movie

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        movie = intent.getParcelableExtra("movie")

        adapter = CastAdapter(Glide.with(this), movie.casts as List<Cast>) { cast: Cast -> onRVItemClicked(cast) }

        bindItem(movie)

        castHolder.layoutManager = LinearLayoutManager(this, LinearLayout.HORIZONTAL, false)
        castHolder.adapter = adapter
    }

    private fun bindItem(movie: Movie) {
        movieTitle.text = movie.movieTitle
        releasedDateField.text = movie.releasedDate
        runtimeField.text = movie.runtime
        budgetField.text = movie.budget
        revenueField.text = movie.revelue
        genreHolder.addChips(movie.genres)
        overviewField.text = movie.overview
        keywordsHolder.addChips(movie.keywords)
        Glide.with(this).load(movie.moviePoster).into(moviePosterField)
    }

    private fun onRVItemClicked(cast: Cast) {

    }
}
