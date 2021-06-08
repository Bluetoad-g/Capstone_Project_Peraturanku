package com.dicoding.peraturanku_fixed.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.peraturanku_fixed.R
import com.dicoding.peraturanku_fixed.data_class.PeraturanData
import com.dicoding.peraturanku_fixed.databinding.ItemRowBinding
import com.dicoding.peraturanku_fixed.detail.ClickedActivity
import kotlinx.android.synthetic.main.activity_clicked.view.*
import kotlinx.android.synthetic.main.item_row.view.*
import java.util.logging.Filter

class PeraturanAdapter(var c: Context, var peraturanList:ArrayList<PeraturanData>): RecyclerView.Adapter<PeraturanAdapter.PeraturanViewHolder>() {


    inner class PeraturanViewHolder(var v:ItemRowBinding): RecyclerView.ViewHolder(v.root){}



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeraturanViewHolder {
        val inflter = LayoutInflater.from(parent.context)
        val v = DataBindingUtil.inflate<ItemRowBinding>(
            inflter, R.layout.item_row,parent,false
        )
        return PeraturanViewHolder(v)
    }

    override fun onBindViewHolder(holder: PeraturanViewHolder, position: Int) {
        val newList = peraturanList[position]
        holder.v.isPeraturan = peraturanList[position]
        holder.v.root.setOnClickListener{
            val img = newList.img
            val nama = newList.nama
            val deskripsi = newList.deskripsi
            val kategori = newList.kategori
            val url = newList.url

            val mIntent = Intent(c, ClickedActivity::class.java)
            mIntent.putExtra("img",img)
            mIntent.putExtra("nama",nama)
            mIntent.putExtra("deskripsi",deskripsi)
            mIntent.putExtra("kategori",kategori)
            mIntent.putExtra("url",url)

            c.startActivity(mIntent)
        }


    }

    override fun getItemCount(): Int {
        return peraturanList.size
    }
}