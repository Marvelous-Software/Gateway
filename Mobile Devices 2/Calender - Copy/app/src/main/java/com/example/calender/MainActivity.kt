package com.example.calender

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.time.LocalDateTime

class MainActivity : AppCompatActivity() {

    var mToday = LocalDateTime.now()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Show a toast just once, otherwise it might be captured in the screenshot.
        Toast.makeText(getApplicationContext(), mToday.toLocalDate().toString(), Toast.LENGTH_SHORT).show()
    }
}
