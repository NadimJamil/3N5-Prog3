package com.example.exercicenavigation

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.exercicenavigation.databinding.ActivityArticleBinding
import com.example.exercicenavigation.databinding.ActivityContactBinding

class ContactActivity : AppCompatActivity() {
    private lateinit var binding : ActivityContactBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_contact)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding = ActivityContactBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        title="Contact"

        binding.btnAccueil.setOnClickListener{
            val intent = Intent(this, AccueilActivity::class.java)

            startActivity(intent)
        }
    }
}