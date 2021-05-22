package com.dicoding.peraturanku.ui.mycollection

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyCollectionsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is mycollection Fragment"
    }
    val text: LiveData<String> = _text
}