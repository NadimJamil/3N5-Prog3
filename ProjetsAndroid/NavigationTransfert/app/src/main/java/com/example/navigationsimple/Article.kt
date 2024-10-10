package com.example.navigationsimple

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.navigationsimple.databinding.ActivityArticleBinding
import com.example.navigationsimple.databinding.ActivityMainBinding


class Article : AppCompatActivity() {
    private lateinit var binding : ActivityArticleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArticleBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val value = intent.getStringExtra("value")
        
        setTitle("Article #$value")

        val textView = findViewById<TextView>(R.id.txtView1)
        textView.text = getString(R.string.lorem_ipsum)

        binding.btn1.setOnClickListener{
            val Intent = Intent(this, Contact::class.java)
            startActivity(Intent)
        }
    }
}