package com.binar.designimplementationnimblapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.supportActionBar?.hide()
//        Glide.with(this)
//            .load(R.drawable.oppa)
//            .circleCrop()
//            .into(ivStory1)
    }
}