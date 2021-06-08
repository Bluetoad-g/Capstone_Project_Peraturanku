package com.dicoding.peraturanku_fixed.data_class

class PeraturanData {
    var nama :String? = null
    var kategori :String? = null
    var deskripsi :String? =null
    var url :String? = null
    var img :String? = null
    constructor(){}

    constructor(nama: String?, kategori: String?, deskripsi: String?, url: String?, img: String?) {
        this.nama = nama
        this.kategori = kategori
        this.deskripsi = deskripsi
        this.url = url
        this.img = img
    }
}