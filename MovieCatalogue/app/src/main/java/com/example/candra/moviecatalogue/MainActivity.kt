package com.example.candra.moviecatalogue

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.candra.moviecatalogue.adapter.MovieAdapter
import com.example.candra.moviecatalogue.model.DataStore
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val movies = DataStore.getData()
    private lateinit var adapter: MovieAdapter
    private lateinit var intentd: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = MovieAdapter(Glide.with(this), movies)

        movieList.adapter = adapter
        movieList.setOnItemClickListener { _, _, position, _ ->
            intentd = Intent(this, DetailActivity::class.java)
            intentd.putExtra("movie", movies[position])
            startActivity(intentd)
        }

    }
}
