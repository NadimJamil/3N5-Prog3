package com.example.albums

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.albums.databinding.ActivityMainBinding
import com.example.albums.databinding.ActivityPageDetailBinding

class PageDetail : AppCompatActivity() {

    private lateinit var binding : ActivityPageDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPageDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (intent.hasExtra("name")){
            binding.albumNameId.text = intent.getStringExtra("name")
        }

        if (intent.hasExtra("artistName")){
            binding.albumSingerId.text = intent.getStringExtra("artistName")
        }
    }
}