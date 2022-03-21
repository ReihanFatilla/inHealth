package com.reihan.inhealth.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.reihan.inhealth.R
import com.reihan.inhealth.databinding.ActivityDetailBinding
import com.reihan.inhealth.databinding.ActivityDetailNewsBinding

class DetailNewsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailNewsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding = ActivityDetailNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()

    }

    private fun initView() {
        binding.tvTitle.text = intent.getStringExtra(NEWS_TITLE)
        binding.tvAuthor.text = intent.getStringExtra(NEWS_AUTHOR)
        binding.tvDate.text = intent.getStringExtra(NEWS_DATE)
        binding.tvDesc.text = intent.getStringExtra(NEWS_DESC)
        binding.imgArtikel.setImageResource(intent.getIntExtra(NEWS_IMAGE, 0))
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }

    companion object {
        const val NEWS_TITLE = "title"
        const val NEWS_AUTHOR = "author"
        const val NEWS_DATE = "date"
        const val NEWS_DESC = "desc"
        const val NEWS_IMAGE = "image"
    }
}

