package com.example.calender

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject

class WeatherActivity : AppCompatActivity() {

    val KelvinOffset = 273.15


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)

        loadData()
    }

    fun loadData(){

        //api.openweathermap.org/data/2.5/forecast/weather?q={city name},{state}&appid={your api key}
        //fb49131d5f027d55cbc474c117a4f458
        //34ab4f88678077f0fe57beb5ad8f4edd
        val url = "https://api.openweathermap.org/data/2.5/weather?q=" +

                Uri.encode("New haven") +

                "," +

                Uri.encode("Conecticut") +

                "&mode=json&appid=34ab4f88678077f0fe57beb5ad8f4edd"

        // Instantiate the RequestQueue.

        val queue = Volley.newRequestQueue(this)

        // Request a string response from the provided URL.

        //Toast.makeText(getApplicationContext(), "pre request", Toast.LENGTH_SHORT).show()

        val request = JsonObjectRequest(Request.Method.GET, url, null,

            Response.Listener<JSONObject> { response ->

                //Toast.makeText(getApplicationContext(), "in request", Toast.LENGTH_SHORT).show()

                val weatherData = response

                    .getJSONArray("weather")

                val weatherDataSection = weatherData.getJSONObject(0)

                findViewById<TextView>(R.id.weather).text = "${weatherDataSection.get("main").toString()}"
                findViewById<TextView>(R.id.forecast).text = "The forecast is for ${weatherDataSection.get("description").toString()}"

                val currentTemperature = response.getJSONObject("main").get("temp")
                //findViewById<TextView>(R.id.currentTemp).text = "current Temp:  ${(currentTemperature - KelvinOffset) * 1.8 + 32} F   ${currentTemperature - KelvinOffset} C "

            },

            Response.ErrorListener {error->

                Log.v("error in loadData", "M: Exception: %s".format(error.toString()))

            })

        //Toast.makeText(getApplicationContext(), "post request", Toast.LENGTH_SHORT).show()

        // Add the request to the RequestQueue.

        queue.add(request)

    }

    fun KelvinToCelcius(K : Double) : Double
    {
        return K - KelvinOffset
    }

    fun KelvinToFahrenheit(K : Double) : Double
    {
        return (K - KelvinOffset) * 1.8 + 32
    }
}
