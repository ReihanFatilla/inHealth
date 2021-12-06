package com.reihan.inhealth.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.reihan.inhealth.data.News
import com.reihan.inhealth.databinding.ItemNewsBinding
import com.reihan.inhealth.ui.DetailActivity
import com.reihan.inhealth.ui.DetailNewsActivity

class NewsAdapter(private val listNews: ArrayList<News>) :
    RecyclerView.Adapter<NewsAdapter.MyViewHolder>() {

    inner class MyViewHolder(private val itemNewsBinding: ItemNewsBinding) :
        RecyclerView.ViewHolder(itemNewsBinding.root) {
        fun bindItem(news: News) {
            itemNewsBinding.tvTitle.text = news.title
            itemNewsBinding.tvContent.text = news.content
            itemNewsBinding.tvAuthor.text = news.author
            itemNewsBinding.tvDate.text = news.date
            itemNewsBinding.imgNews.setImageResource(news.photo)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
        ItemNewsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: NewsAdapter.MyViewHolder, position: Int) {
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