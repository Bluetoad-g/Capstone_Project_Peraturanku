package com.dicoding.peraturanku_fixed.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.peraturanku_fixed.R
import com.dicoding.peraturanku_fixed.getProgessDrawable
import com.dicoding.peraturanku_fixed.loadImage
import kotlinx.android.synthetic.main.activity_clicked.*

class ClickedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clicked)

        val peraturanIntent = intent
        val peraturanNama = peraturanIntent.getStringExtra("nama")
        val peraturanImg = peraturanIntent.getStringExtra("img")
        val peraturanDeskripsi = peraturanIntent.getStringExtra("deskripsi")
        val peraturanKategori = peraturanIntent.getStringExtra("kategori")
        val peraturanUrl = peraturanIntent.getStringExtra("url")

        nama.text = peraturanNama
        img.loadImage(peraturanImg, getProgessDrawable(this))
        deskripsi.text = peraturanDeskripsi
        kategori.text = peraturanKategori
        url.text = peraturanUrl
    }
}