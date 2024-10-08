package com.example.exercicenavigation

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.exercicenavigation.databinding.AccueilBinding

class AccueilActivity : AppCompatActivity() {
    private lateinit var binding : AccueilBinding;

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = AccueilBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        title="Accueil"


        binding.btnArticle.setOnClickListener{
            val intent = Intent(this, ArticleActivity::class.java)

            startActivity(intent)
        }

        binding.btnContact.setOnClickListener{
            val intent = Intent(this, ContactActivity::class.java)

            startActivity(intent)
        }
    }
}