package com.reihan.inhealth.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.reihan.inhealth.R

class DetailNewsActivity : AppCompatActivity() {

    companion object {
        const val NEWS_TITLE = "title"
        const val NEWS_AUTHOR = "author"
        const val NEWS_DATE = "date"
        const val NEWS_DESC = "desc"
        const val NEWS_IMAGE = "image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        setContentView(R.layout.activity_detail_news)

        val title = intent.getStringExtra(NEWS_TITLE)
        val author = intent.getStringExtra(NEWS_AUTHOR)
        val date = intent.getStringExtra(NEWS_DATE)
        val desc = intent.getStringExtra(NEWS_DESC)
        val image = intent.getIntExtra(NEWS_IMAGE, 0)


        val tvTitle: TextView = findViewById(R.id.tv_title)
        tvTitle.text = title
        val tvAuthor: TextView = findViewById(R.id.tv_author)
        tvAuthor.text = author
        val tvDate: TextView = findViewById(R.id.tv_date)
        tvDate.text = date
        val tvDesc: TextView = findViewById(R.id.tv_desc)
        tvDesc.text = desc
        val imgArtikel: ImageView = findViewById(R.id.img_artikel)
        imgArtikel.setImageResource(image)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }


}

