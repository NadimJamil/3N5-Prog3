package com.example.ordreaplha.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.ordreaplha.MainActivity
import com.example.ordreaplha.databinding.ActivityMainBinding
import com.example.ordreaplha.databinding.ListeNomBinding

class MonAdapter(private val moveItemCallback: (Int, Int) -> Unit) : ListAdapter<String, MonAdapter.ListeNomViewHolder>(ListeNomDiffCallback) {
    inner class ListeNomViewHolder(private val binding : ListeNomBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(item:String){
            binding.Nom.text = item

            binding.btnMonter.setOnClickListener {
                moveItemCallback(position, -1) // Move up
            }

            binding.btnDescendre.setOnClickListener {
                moveItemCallback(position, 1) // Move down
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListeNomViewHolder {
        val binding: ListeNomBinding = ListeNomBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListeNomViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListeNomViewHolder, position: Int) {
        val item : String = getItem(position)
        holder.bind(item)
    }
}

object ListeNomDiffCallback : DiffUtil.ItemCallback<String>(){
    override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }
}