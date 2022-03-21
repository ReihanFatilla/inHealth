package com.reihan.inhealth.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.reihan.inhealth.R
import com.reihan.inhealth.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
    }

    private fun initView() {
        binding.tvTitle.text = intent.getStringExtra(ARTIKEL_TITLE)
        binding.tvAuthor.text = intent.getStringExtra(ARTIKEL_AUTHOR)
        binding.tvDate.text = intent.getStringExtra(ARTIKEL_DATE)
        binding.tvDesc.text = intent.getStringExtra(ARTIKEL_DESC)
        binding.imgArtikel.setImageResource(intent.getIntExtra(ARTIKEL_IMAGE, 0))
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }

    companion object {
        const val ARTIKEL_TITLE = "title"
        const val ARTIKEL_AUTHOR = "author"
        const val ARTIKEL_DATE = "date"
        const val ARTIKEL_DESC = "desc"
        const val ARTIKEL_IMAGE = "image"
    }

}