package com.bignerdranch.android.kinopoisk.ui.films

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bignerdranch.android.kinopoisk.Film
import com.bignerdranch.android.kinopoisk.FilmAdapter
import com.bignerdranch.android.kinopoisk.R

class FilmActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var filmList: ArrayList<Film>
    private lateinit var filmAdapter: FilmAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_films)

        init()
    }
    private fun init(){
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        filmList = ArrayList()
        addDateToList()

        filmAdapter = FilmAdapter(filmList)
        recyclerView.adapter = filmAdapter
    }
    private fun addDateToList(){
        filmList.add(Film(R.drawable.doctor, "Доктор Стрердж"))
        filmList.add(Film(R.drawable.klinok, "Клинок рассекающий демонов"))
        filmList.add(Film(R.drawable.magbitva, "Магическая битва"))
        filmList.add(Film(R.drawable.pauk, "Человек-паук"))
        filmList.add(Film(R.drawable.pila, "Пила 8"))
        filmList.add(Film(R.drawable.vdova, "Чёрная вдова"))

    }
}