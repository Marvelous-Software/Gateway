package com.example.mymusicapp

import android.net.Uri.encode
import android.os.Bundle
import android.provider.AlarmClock
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject


class SongDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_song_details)
        // Get the Intent that started this activity and extract the string
        val song = intent.getSerializableExtra("songSearch") as? Song
        // Capture the layout's TextView and set the string as its text
        val textView = findViewById<TextView>(R.id.songTitle).apply {
            text = song?.getTitle()

            loadData(song?.getArtist(), song?.getTitle())
        }
    }

    fun loadData(artist:String?, songT: String?){

        val songTitle = findViewById<TextView>(R.id.songTitle)

        val songUrl = findViewById<TextView>(R.id.songUrl)

        songUrl.text = songT

        //6de1dc611a0cbb962dac1683c9bea8fb - MS
        //e727fc4292a26655683cd9469a2ea5b1 - JM
        //30b4fee15a2d9f3222840a8a73497bb3 - JM 2
        val url = "https://ws.audioscrobbler.com/2.0/?method=track.getInfo&api_key=30b4fee15a2d9f3222840a8a73497bb3&artist=" +

                encode(artist) +

                "&track=" +

                encode(songT ) +

                "&format=json"

        Log.v("from SongDetails", "u: " + url)

        // Instantiate the RequestQueue.

        val queue = Volley.newRequestQueue(this)

        // Request a string response from the provided URL.

        val request = JsonObjectRequest(Request.Method.GET, url, null,

            Response.Listener<JSONObject> { response ->

                val songInfo = response

                    .getJSONObject("track")

                val album = songInfo.getJSONObject("album")

                songTitle.text = "Album Title: ${album.get("title").toString()}"

                songUrl.text = "LastFM Song URL: ${album.get("url").toString()}"

            },

            Response.ErrorListener {error->

                Log.v("from SongDetails", "M: Exception: %s".format(error.toString()))

            })

        // Add the request to the RequestQueue.

        queue.add(request)

    }

}