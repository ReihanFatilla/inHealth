package com.reihan.inhealth.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.reihan.inhealth.R
import com.reihan.inhealth.adapter.ArtikelAdapter
import com.reihan.inhealth.adapter.NewsAdapter
import com.reihan.inhealth.data.DataArtikel
import com.reihan.inhealth.data.DataNews
import com.reihan.inhealth.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {

    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        binding.rvRecentNews.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = NewsAdapter(DataNews.dataTrending)
        }
        return binding.root
    }

}