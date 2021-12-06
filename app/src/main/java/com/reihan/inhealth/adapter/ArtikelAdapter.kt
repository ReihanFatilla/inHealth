package com.reihan.inhealth.adapter
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.reihan.inhealth.data.Artikel
import com.reihan.inhealth.data.News
import com.reihan.inhealth.databinding.ItemArtikelBinding
import com.reihan.inhealth.databinding.ItemNewsBinding
import com.reihan.inhealth.ui.DetailActivity

class ArtikelAdapter(private val listArtikel: ArrayList<Artikel>) :
    RecyclerView.Adapter<ArtikelAdapter.MyViewHolder>() {

    inner class MyViewHolder(private val itemArtikelBinding: ItemArtikelBinding) :
        RecyclerView.ViewHolder(itemArtikelBinding.root) {
        fun bindItem(artikel: Artikel) {
            itemArtikelBinding.tvTitlePopuler.text = artikel.title
            itemArtikelBinding.tvAuthor.text = artikel.author
            itemArtikelBinding.tvDate.text = artikel.date
            itemArtikelBinding.imgNews.setImageResource(artikel.photo)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
        ItemArtikelBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: ArtikelAdapter.MyViewHolder, position: Int) {
        holder.bindItem(listArtikel[position])
        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, DetailActivity::class.java)

            intent.putExtra(DetailActivity.ARTIKEL_TITLE, listArtikel[position].title)
            intent.putExtra(DetailActivity.ARTIKEL_AUTHOR, listArtikel[position].author)
            intent.putExtra(DetailActivity.ARTIKEL_DATE, listArtikel[position].date)
            intent.putExtra(DetailActivity.ARTIKEL_DESC, listArtikel[position].desc)
            intent.putExtra(DetailActivity.ARTIKEL_IMAGE, listArtikel[position].photo)
            holder.itemView.context.startActivity(intent)
        }


    }
    override fun getItemCount() = listArtikel.size
}