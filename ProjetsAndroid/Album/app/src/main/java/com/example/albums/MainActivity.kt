package com.example.albums

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.albums.Adapters.MonAdapter
import com.example.albums.databinding.ActivityMainBinding
import com.example.albums.models.Album

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter : MonAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecycler()
        fillRecycler()
    }

    private fun setupRecycler() {
        adapter = MonAdapter() // Créer l'adapteur
        binding.rvMonAdapter.adapter = adapter // Assigner l'adapteur au RecyclerView
        binding.rvMonAdapter.setHasFixedSize(true) // Option pour améliorer les performances
        binding.rvMonAdapter.addItemDecoration( // Ajouter un séparateur entre chaque élément
            DividerItemDecoration(
                binding.rvMonAdapter.context, DividerItemDecoration.VERTICAL

            )
        )
    }

    private fun fillRecycler(){
        val items : MutableList<Album> = mutableListOf()
        val listAlbum = listOf<String>("Antigéographiquement", "J'ai Bu", "Comment Debord", "Darlène", "La Nuit Est Une Panthère", "Jaune", "Thriller", "Imagine", "Animals")
        val listChanteur = listOf<String>("Jérôme Charette-Pépin", "Québec Redneck Bluegrass Project", "Comment Debord", "Hubert Lenoir", "Les Louanges", "Jean-Pierre Ferland", "Michael Jackson", "John Lennon", "Pink Floyd")

            for (a in 0 until listAlbum.size){
                    val nomAlbum = listAlbum[a]
                    val nomChanteur = listChanteur[a % listChanteur.size]
                    items.add(Album(a, nomAlbum, nomChanteur))


            }
        adapter.submitList(items)
    }
}