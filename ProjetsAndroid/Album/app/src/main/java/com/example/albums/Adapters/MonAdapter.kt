package com.example.albums.Adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.albums.PageDetail
import com.example.albums.databinding.MonAlbumBinding
import com.example.albums.models.Album

class MonAdapter : ListAdapter<Album, MonAdapter.MonAlbumViewHolder>(MonItemDiffCallback){
    inner class MonAlbumViewHolder(private val binding : MonAlbumBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(album : Album){
            binding.nomAlbumId.text = album.name
            binding.nomArtisteId.text = album.artistName

            binding.AlbumId.setOnClickListener{
                val intent = Intent(binding.root.context, PageDetail::class.java)
                intent.putExtra("id", album.id)
                intent.putExtra("name", album.name)
                intent.putExtra("artistName", album.artistName)
                binding.root.context.startActivity(intent)
            }
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