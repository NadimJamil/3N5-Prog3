package com.example.albums.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.albums.databinding.MonAlbumBinding

class MonAdapter : ListAdapter<String, MonAdapter.MonAlbumViewHolder>(MonItemDiffCallback){
    inner class MonAlbumViewHolder(private val binding : MonAlbumBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(item : String){
            binding.albumId.text = item
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MonAlbumViewHolder {
        val binding: MonAlbumBinding = MonAlbumBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MonAlbumViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MonAlbumViewHolder, position: Int) {
        val item : String = getItem(position)
        holder.bind(item)
    }
}

object MonItemDiffCallback : DiffUtil.ItemCallback<String>() {
    override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }
}