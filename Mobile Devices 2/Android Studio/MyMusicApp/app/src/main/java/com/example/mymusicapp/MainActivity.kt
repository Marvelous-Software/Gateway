package com.example.mymusicapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Log.v("MainActivity.onCreate", "Starting")

        // creating a RecyclerView objec
        val rView = findViewById<RecyclerView>(R.id.song_list)

        // the layoutManager is responsible of the layout of the page
        rView.layoutManager = LinearLayoutManager( this )

        Log.v("MainActivity.onCreate", "I'm Here")

        // the adapter is responsible for the data to be displayed
        /*
        val sl = getListOfSongs()
        Log.v("MainActivity.onCreate", "songlist. " + sl.size)
        val sa = SongAdapter( sl )
        Log.v("MainActivity.onCreate", "sa. " + sa.itemCount)
        rView.adapter = sa
         */
        rView.adapter = SongAdapter( getListOfSongs(), {song -> songRowClicked(song)})


        Log.v("MainActivity.onCreate", "Ending. " + rView.toString())

    }


    private fun getListOfSongs(): ArrayList<Song> {

        // declaring a list of Songs
        val songList = ArrayList<Song>()

        Log.v("MainActivity.getList", "I'm Here")

        // populate the list of songs
        var song = Song( "Man in the Box", "Alice in Chains", "rock", "maninthebox")
        songList.add(song)
        song = Song( "Black Dog", "Led Zepplin", "rock",  "blackdog")
        songList.add(song)
        song = Song( "Mamma Kin", "Aerosmith", "rock",  "mammakin")
        songList.add(song)
        song = Song( "Red Barchetta", "Rish", "rock",  "redbarchetta")
        songList.add(song)

        Log.v("MainActivity.getList" + songList.get(2).getTitle(), "I'm Here")

        return songList
    }

    private fun songRowClicked(song: Song)
    {
        //Toast.makeText(this, "Click on ${song.getTitle()}", Toast.LENGTH_LONG).show()
        val intentIB = Intent(this, SongDetails::class.java).apply {
            putExtra("songSearch", song)
            //putExtra(AlarmClock.EXTRA_MESSAGE, "CLICK FROM STAR!")
        }
        startActivity(intentIB)
    }
}
