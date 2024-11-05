package com.example.albums.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.albums.databinding.MonAlbumBinding
import com.example.albums.models.Album

class MonAdapter : ListAdapter<Album, MonAdapter.MonAlbumViewHolder>(MonItemDiffCallback){
    inner class MonAlbumViewHolder(private val binding : MonAlbumBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(album : Album){
            binding.albumId.text = album.name
            binding.descAlbumId.text = album.artistName
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MonAlbumViewHolder {
        val binding: MonAlbumBinding = MonAlbumBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MonAlbumViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MonAlbumViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

object MonItemDiffCallback : DiffUtil.ItemCallback<Album>() {
    override fun areItemsTheSame(oldItem: Album, newItem: Album): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Album, newItem: Album): Boolean {
        return oldItem.id == newItem.id &&
                oldItem.name == oldItem.name &&
                oldItem.artistName == oldItem.artistName
    }
}