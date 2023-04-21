package com.example.architecturecomponent.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("imageFromUrl")
fun ImageView.imageFromUrl(imgUrl: String){
    Glide.with(this.context).load(imgUrl).into(this)
}