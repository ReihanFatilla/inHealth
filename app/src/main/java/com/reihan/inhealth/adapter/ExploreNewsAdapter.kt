package com.reihan.inhealth.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.reihan.inhealth.data.News
import com.reihan.inhealth.databinding.ItemBeritaExploreBinding
import com.reihan.inhealth.databinding.ItemNewsBinding
import com.reihan.inhealth.ui.DetailNewsActivity

class ExploreNewsAdapter (private val listNews: ArrayList<News>) :
    RecyclerView.Adapter<ExploreNewsAdapter.MyViewHolder>() {

    inner class MyViewHolder(private val itemBeritaExploreBinding: ItemBeritaExploreBinding) :
        RecyclerView.ViewHolder(itemBeritaExploreBinding.root) {
        fun bindItem(news: News) {
            itemBeritaExploreBinding.tvTitle.text = news.title
            itemBeritaExploreBinding.tvAuthor.text = news.author
            itemBeritaExploreBinding.tvDate.text = news.date
            itemBeritaExploreBinding.imgNews.setImageResource(news.photo)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder (
        ItemBeritaExploreBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: ExploreNewsAdapter.MyViewHolder, position: Int) {
        holder.bindItem(listNews[position])
        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, DetailNewsActivity::class.java)

            intent.putExtra(DetailNewsActivity.NEWS_TITLE, listNews[position].title)
            intent.putExtra(DetailNewsActivity.NEWS_AUTHOR, listNews[position].author)
            intent.putExtra(DetailNewsActivity.NEWS_DATE, listNews[position].date)
            intent.putExtra(DetailNewsActivity.NEWS_DESC, listNews[position].desc)
            intent.putExtra(DetailNewsActivity.NEWS_IMAGE, listNews[position].photo)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount() = listNews.size
}