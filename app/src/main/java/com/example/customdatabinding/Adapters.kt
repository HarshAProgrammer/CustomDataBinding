package com.example.customdatabinding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import java.net.URL

@BindingAdapter("imageFromUrl")
fun ImageView.imageFromUrl(url:String){
    Glide.with(this.context).load(url).into(this)
}