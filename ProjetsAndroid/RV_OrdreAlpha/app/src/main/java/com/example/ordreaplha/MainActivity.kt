package com.example.ordreaplha

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.ordreaplha.adapters.MonAdapter
import com.example.ordreaplha.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: MonAdapter
    private val items: MutableList<String> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecycler()
        fillRecycler()
    }

    private fun setupRecycler() {
        adapter = MonAdapter(::moveItem)
        binding.rvMonAdapter.adapter = adapter
        binding.rvMonAdapter.setHasFixedSize(true)
        binding.rvMonAdapter.addItemDecoration(
            DividerItemDecoration(
                binding.rvMonAdapter.context, DividerItemDecoration.VERTICAL
            )
        )
    }

    private fun fillRecycler() {
        items.addAll(listOf("Bob", "Jack", "Pierre", "Jean", "Franky", "Charles"))
        adapter.submitList(items)
    }

    private fun moveItem(position: Int, direction : Int){
        if(direction == -1 && position > 0){
            val item = items.removeAt(position)
            items.add(position - 1, item)
        }
        else if(direction == 1 && position < items.size -1){
            val item = items.removeAt(position)
            items.add(position + 1, item)
        }
        adapter.submitList(items.toList())
    }
}

