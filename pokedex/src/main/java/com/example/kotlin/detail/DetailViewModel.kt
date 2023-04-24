package com.example.kotlin.detail

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DetailViewModel : ViewModel() {
    val fragmentName = MutableLiveData("DetailFragment")
}