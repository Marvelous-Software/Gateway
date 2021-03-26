package com.example.assignment10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText


const val EXTRA_MESSAGE = "com.example.Assignment10.MESSAGE"


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        Log.v("MainActivity", "onCreate")


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View) {

        Log.v("sendMessage", "I'm Here")

        val editText = findViewById<EditText>(R.id.editText)
        Log.v("sendMessage", "after findViewById")
        //val message = editText.text.toString()
        val message = editText.text.toString() + " - MainActivity.sendMessage"
        Log.v("sendMessage", "after toString")
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)

    }

}
