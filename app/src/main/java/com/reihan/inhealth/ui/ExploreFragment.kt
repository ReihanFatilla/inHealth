package com.reihan.inhealth.ui

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout.HORIZONTAL
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.reihan.inhealth.R
import com.reihan.inhealth.adapter.ArtikelAdapter
import com.reihan.inhealth.adapter.ExploreNewsAdapter
import com.reihan.inhealth.adapter.NewsAdapter
import com.reihan.inhealth.data.DataArtikel
import com.reihan.inhealth.data.DataNews
import com.reihan.inhealth.databinding.FragmentExploreBinding


class ExploreFragment : Fragment() {

    private var _binding: FragmentExploreBinding? = null
    private val binding get() = _binding!!

    @SuppressLint("WrongConstant")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentExploreBinding.inflate(inflater, container, false)

        binding.rvArtikelExplore.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(activity, HORIZONTAL, false)
            adapter = ArtikelAdapter(DataArtikel.dataExplore)
        }
        binding.rvBeritaExplore.apply {
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(context, 2)
            adapter = ExploreNewsAdapter(DataNews.dataExplore)
        }
        return binding.root
    }


}