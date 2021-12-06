package com.reihan.inhealth.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.reihan.inhealth.R

class DetailActivity : AppCompatActivity() {

    companion object {
        const val ARTIKEL_TITLE = "title"
        const val ARTIKEL_AUTHOR = "author"
        const val ARTIKEL_DATE = "date"
        const val ARTIKEL_DESC = "desc"
        const val ARTIKEL_IMAGE = "image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        setContentView(R.layout.activity_detail)

        val title = intent.getStringExtra(ARTIKEL_TITLE)
        val author = intent.getStringExtra(ARTIKEL_AUTHOR)
        val date = intent.getStringExtra(ARTIKEL_DATE)
        val desc = intent.getStringExtra(ARTIKEL_DESC)
        val image = intent.getIntExtra(ARTIKEL_IMAGE, 0)


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

        var btn_salin_text = findViewById(R.id.btn_salintext) as Button

        btn_salin_text.setOnClickListener {
            // make a toast on button click event
            Toast.makeText(this, "Teks Berhasil Di Salin Ke Papan Klip", Toast.LENGTH_LONG).show()


        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()

    }

}