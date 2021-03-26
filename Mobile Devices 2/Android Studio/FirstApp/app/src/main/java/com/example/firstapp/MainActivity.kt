package com.example.firstapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private fun generateMyItems(): List<String> {
        val myItems: MutableList<String> = mutableListOf<String>()
        for (i in 0..99) {
            myItems.add( "This is item " + i )
        }
        return myItems
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //message.text = "Hello Kotlin on my first app!"
        //mainTitle.text = "Hello Kotlin on my first app!"

        val forecastList = findViewById<RecyclerView>(R.id.forecast_list)
        forecastList.layoutManager = LinearLayoutManager(this)
        forecastList.adapter = ForecastListAdapter( generateMyItems() )
        
        var itemDecoration = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        itemDecoration.setDrawable( ContextCompat.getDrawable( this, R.drawable.divider)!!)
        forecastList.addItemDecoration(itemDecoration)



    }

}
