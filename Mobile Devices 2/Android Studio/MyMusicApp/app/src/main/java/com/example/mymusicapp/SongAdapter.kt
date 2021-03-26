package com.example.mymusicapp

import android.content.ContentResolver
import android.content.Context
import android.net.Uri
import android.util.Log
import android.view.LayoutInflater
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.song_list_row.view.*

class SongAdapter( songList: ArrayList<Song>, private val clickListener: (Song) -> Unit) : RecyclerView.Adapter<SongAdapter.SongViewHolder>() {

    private val songList: ArrayList<Song>

    init{
        Log.v("init", "???")
        this.songList = songList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int ): SongViewHolder {
        Log.v("onCreateViewHolder", "Pre" + songList.size)
        val itemView: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.song_list_row, parent, false)
        Log.v("onCreateViewHolder", "First" + songList.size)

        return SongViewHolder(itemView)
    }

    override fun onBindViewHolder( holder: SongViewHolder, position: Int ) {

        Log.v("onBindViewHolder", "" + position)

        holder.bind( songList[position], clickListener)

        holder.title.setText(songList[position].getTitle())
        holder.artist.setText(songList[position].getArtist())
        holder.genre.setText(songList[position].getGenre())
        //holder.imageSong.setImage(songList[position].getImageSong())
        holder.imageSong.setImageURI(
            Uri.parse( ContentResolver.SCHEME_ANDROID_RESOURCE +
            "://" +
            "com.example.mymusicapp/" + "drawable/" + songList[position].getImageSong()))

    }

    override fun getItemCount(): Int {
        Log.v("getItemCount", "" + songList.size)

        return songList.size
    }

    inner class SongViewHolder( view: View ) : RecyclerView.ViewHolder( view ){
        var title: TextView
        var artist: TextView
        var genre: TextView
        var imageSong: ImageView
        var row: View

        val c: Context


        init{
            Log.v("SongViewHolder", "init")

            this.title = view.findViewById<TextView>(R.id.title) //as TextView
            this.artist = view.findViewById<View>(R.id.artist) as TextView
            this.imageSong = view.findViewById<View>(R.id.image_song) as ImageView
            this.genre = view.findViewById<View>(R.id.genre) as TextView
            this.row = view.findViewById<View>(R.id.song_row) as View

            c = view.context
            //addListenerToImage()
            //addListenerToTitle()
            //addListenerToRow()
        }

        fun addListenerToImage() {
            title.setOnClickListener {
                Toast.makeText(c, "title clicked!", Toast.LENGTH_LONG).show()
            }
        }

        fun addListenerToTitle() {
            imageSong.setOnClickListener {
                Toast.makeText(c, "*** Image clicked! ***", Toast.LENGTH_LONG).show()
            }
        }

        fun addListenerToRow() {
            row.setOnClickListener {
                Toast.makeText(c, "******* ROW! *******", Toast.LENGTH_LONG).show()
            }
        }

        fun bind(song: Song, clickListener: (Song)->Unit) {
            itemView.title.text = song.getTitle()
            itemView.artist.text = song.getArtist()
            itemView.genre.text = song.getGenre()
            itemView.image_song.setImageURI(
                Uri.parse(
                    ContentResolver.SCHEME_ANDROID_RESOURCE +
                            "://" +
                            "com.example.mymusicapp/" + "drawable/" + song.getImageSong()
                ))
            itemView.setOnClickListener { clickListener(song) }

        }
    }

}