package com.dicoding.peraturanku.ui.surf

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SurfViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is surf Fragment"
    }
    val text: LiveData<String> = _text
}