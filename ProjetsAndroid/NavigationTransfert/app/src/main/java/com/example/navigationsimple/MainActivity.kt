package com.example.navigationsimple

import android.content.Intent
import android.os.Bundle
import android.widget.NumberPicker
import androidx.appcompat.app.AppCompatActivity
import com.example.navigationsimple.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var numberPicker : NumberPicker

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val name = intent.getStringExtra("name")
        if(name != null){
            binding.textView1.text = "Bonjour $name"
        }
        setTitle("Accueil")
        val numberPicker =
            findViewById<NumberPicker>(R.id.numberPicker)
        numberPicker.minValue = 0
        numberPicker.maxValue = 10

        binding.btnArticle.setOnClickListener{
            val value = numberPicker.value.toString()
            val test2 = binding.numberPicker.value
            val test3 = binding.numberPicker.value.toString()
            val test = numberPicker.value
            val intent = Intent(this, Article::class.java)
            intent.putExtra("test3", test3)
            intent.putExtra("test2", test2)
            intent.putExtra("test", test)
            intent.putExtra("value", value)

            startActivity(intent)
        }

        binding.btnContact.setOnClickListener{
            val intent = Intent(this, Contact::class.java)
            startActivity(intent)
        }
    }
}