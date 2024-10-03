package com.example.tapelapin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tapelapin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    private lateinit var listeButtons : List<Button>

    var scorePafs = 0
    var scoreFlops = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.pafId.setOnClickListener(View.OnClickListener {
            println("Coucous")
        })
        listeButtons = listOf(
            binding.button1Id,
            binding.button2Id,
            binding.button3Id,
            binding.button4Id,
            binding.button5Id,
            binding.button6Id,
            binding.button7Id,
            binding.button8Id,
            binding.button9Id,
        )
        for(btn in listeButtons){
            btn.setOnClickListener(View.OnClickListener {
                reagirAuClic(it)
            })
        }
        initialiser()
    }
    fun initialiser(){
        for(btn in listeButtons){
            btn.setText("TAUPE")
        }
        val randomInex = listeButtons.random()
        randomInex.setText("LAPIN")
    }

    fun reagirAuClic(it : View){
        val boutonClique : Button = it as Button
        if(boutonClique.text == "LAPIN"){
            boutonClique.setText("TAUPE")
            initialiser()
            Toast.makeText(this, "POOF", Toast.LENGTH_SHORT).show()
            scorePafs++
        }
        else{
            scoreFlops++
        }
        binding.pafId.setText("Pafs : " + scorePafs.toString())
        binding.flopId.setText("Flops : " + scoreFlops.toString())
    }
}