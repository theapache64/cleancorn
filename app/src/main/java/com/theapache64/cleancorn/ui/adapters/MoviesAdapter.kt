package com.theapache64.cleancorn.ui.adapters

/**
 * Created by theapache64 : May 29 Fri,2020 @ 10:30
 * Copyright (c) 2020 ThinkPalm
 * All rights reserved
 */
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.theapache64.cleancorn.data.remote.top250.Movie
import com.theapache64.cleancorn.databinding.ItemMovieBinding

class MoviesAdapter(
    context: Context,
    private val movies: List<Movie>
) : RecyclerView.Adapter<MoviesAdapter.ViewHolder>() {

    private val inflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemMovieBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = movies.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movie = movies[position]
        holder.binding.movie = movie
    }

    inner class ViewHolder(val binding: ItemMovieBinding) : RecyclerView.ViewHolder(binding.root)
}