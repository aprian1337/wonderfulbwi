package com.aprian1337.wonderfulbwi

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListWisataAdapter(private val listWisata: ArrayList<Wisata>) : RecyclerView.Adapter<ListWisataAdapter.ListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_wisata, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val wisata = listWisata[position]
        Glide.with(holder.itemView.context)
            .load(wisata.photo)
            .into(holder.imgPhoto)
        holder.tvName.text = wisata.name
        holder.tvDetail.text = wisata.detail

        holder.itemView.setOnClickListener{
            Toast.makeText(holder.itemView.getContext(),
                listWisata[holder.getAdapterPosition()].name, Toast.LENGTH_SHORT).show();
            holder.imgPhoto.setTag(wisata.photo);
            val intentDetail = Intent(holder.itemView.context, DetailActivity::class.java)
            intentDetail.putExtra(DetailActivity.EXTRA_NAME, wisata.name)
            intentDetail.putExtra(DetailActivity.EXTRA_DESC, wisata.detail)
            intentDetail.putExtra(DetailActivity.EXTRA_IMG, wisata.photo)
            holder.itemView.context.startActivity(intentDetail)
        }
    }

    override fun getItemCount(): Int {
        return listWisata.size
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}