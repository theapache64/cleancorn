package com.theapache64.cleancorn.features.movies

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.theapache64.cleancorn.R
import com.theapache64.cleancorn.adapters.MoviesAdapter
import com.theapache64.cleancorn.databinding.ActivityMoviesBinding
import org.koin.android.viewmodel.ext.android.viewModel

class MoviesActivity : AppCompatActivity() {

    private val mainViewModel: MoviesViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =
            DataBindingUtil.setContentView<ActivityMoviesBinding>(this, R.layout.activity_movies)

        mainViewModel.movies.observe(this, Observer { movies ->
            val adapter = MoviesAdapter(this, movies)
            binding.rvMovies.adapter = adapter
        })

        binding.viewModel = mainViewModel
    }
}