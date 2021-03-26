package com.example.assignment10

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        Log.v("DisplayMessageActivity", "onCreate")

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        val intent = intent
        //val message = intent.getStringExtra("com.example.Assignment10.MESSAGE")
        //val message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE) + " - DisplayMessageActivity.onCreate"
        val message = intent.getStringExtra("com.example.Assignment10.MESSAGE") + " - DisplayMessageActivity.onCreate"
        //val message = "DisplayMessageActivity.onCreate"

        // Capture the layout's TextView and set the string as its text
        val textView: TextView = findViewById(R.id.textView)
        textView.text = textView.text.toString() + message
/*
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message
*/
        }
    }
