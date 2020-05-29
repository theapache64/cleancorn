package com.theapache64.cleancorn.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.theapache64.cleancorn.R
import com.theapache64.cleancorn.databinding.ActivityMainBinding
import com.theapache64.cleancorn.ui.adapters.MoviesAdapter
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val mainViewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        mainViewModel.movies.observe(this, Observer { movies ->
            val adapter = MoviesAdapter(this, movies)
            binding.rvMovies.adapter = adapter
        })

        binding.viewModel = mainViewModel
    }
}