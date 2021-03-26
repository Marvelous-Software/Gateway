package com.example.calender

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AppointmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appointment)
    }

    public fun showWeather(view : View)
    {
        val intentWeather = Intent(this, WeatherActivity::class.java).apply {}

        startActivity(intentWeather)
    }
}
