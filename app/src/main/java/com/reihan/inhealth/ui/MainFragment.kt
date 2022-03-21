package com.reihan.inhealth.ui

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.HorizontalScrollView
import android.widget.LinearLayout.HORIZONTAL
import androidx.recyclerview.widget.LinearLayoutManager
import com.reihan.inhealth.R
import com.reihan.inhealth.adapter.ArtikelAdapter
import com.reihan.inhealth.adapter.NewsAdapter
import com.reihan.inhealth.data.DataArtikel
import com.reihan.inhealth.data.DataNews
import com.reihan.inhealth.databinding.FragmentHomeBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    @SuppressLint("WrongConstant")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.rvTrendingNews.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = NewsAdapter(DataNews.dataTrending)
        }
        binding.rvArtikelPopuler.apply {
            layoutManager = LinearLayoutManager(activity, HORIZONTAL, false)
            adapter = ArtikelAdapter(DataArtikel.dataPopuler)
        }
        return binding.root
    }

}