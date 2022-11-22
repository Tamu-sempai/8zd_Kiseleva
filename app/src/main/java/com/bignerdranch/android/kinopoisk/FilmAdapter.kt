package com.bignerdranch.android.kinopoisk

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FilmAdapter(private val filmList: ArrayList<Film>) :
    RecyclerView.Adapter<FilmAdapter.FilmViewHolder>(){
    class FilmViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id.imageView)
        val textView : TextView = itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_film, parent, false)
        return  FilmViewHolder(view)
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        val film = filmList[position]
        holder.imageView.setImageResource(film.image)
        holder.textView.text = film.name
    }

    override fun getItemCount(): Int {
        return filmList.size
    }
}

