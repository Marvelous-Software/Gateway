package com.example.mymusicapp

import android.util.Log
import java.io.Serializable

class Song(title: String, artist: String, genre: String, imageSong: String) : Serializable {

    // properties
    private var title: String? = null
    private var artist: String? = null
    private var genre: String? = null
    private var length: Int? = null
    private var imageSong: String? = null
    //var releaseDate

    init{

        this.title = title
        this.artist = artist
        this.genre = genre
        this.imageSong = imageSong

        Log.v("Song.init", "Constructor: " + this.getTitle())

        // todo: complete the constructor
    }

    // methods
    fun changeTitle( title: String ){
        this.title = title
    }

    fun getTitle( ): String?{
        return title
    }

    fun changeArtist( artist: String ){
        this.artist = artist
    }

    fun getArtist( ): String?{
        return artist
    }

    fun changeGenre( genre: String ){
        this.genre = genre
    }

    fun getGenre( ): String?{
        return genre
    }

    fun changeImageSong( imageSong: String ){
        this.imageSong = imageSong
    }

    fun getImageSong( ): String?{
        return imageSong
    }
    // TODO: implement all the required methods

}