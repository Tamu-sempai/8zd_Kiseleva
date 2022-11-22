package com.bignerdranch.android.kinopoisk

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class navigation_profil : Fragment() {

    companion object {
        fun newInstance() = navigation_profil()
    }

    private lateinit var viewModel: NavigationProfilViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profil, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(NavigationProfilViewModel::class.java)
        // TODO: Use the ViewModel
    }

}