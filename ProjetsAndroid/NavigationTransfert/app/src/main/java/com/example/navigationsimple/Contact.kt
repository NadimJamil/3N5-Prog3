package com.example.navigationsimple

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.navigationsimple.databinding.ActivityContactBinding

class Contact : AppCompatActivity() {
    private lateinit var binding : ActivityContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setTitle("Contact")
        val nameEditText = findViewById<EditText>(R.id.name_edit_text)

        binding.button1.setOnClickListener{

            val enteredName = binding.nameEditText.text.toString()
            val Intent = Intent(this, MainActivity::class.java)
            Intent.putExtra("name", enteredName)
            startActivity(Intent)
        }

    }
}