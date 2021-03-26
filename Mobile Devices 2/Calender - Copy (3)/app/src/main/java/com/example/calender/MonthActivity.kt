package com.example.calender

import android.R
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MonthActivity : AppCompatActivity() {

    //private mDays : Map<String, TextView>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_month)

        }
    }

/*
    fun build() {

        val Layout = findViewById(R.id.month) as LinearLayout
        for (r in 0..6) {
            val rowTextView = TextView(this)
            rowTextView.text = "This is row #$r"
            Layout.addView(rowTextView)
            //mDays. .get(i) = rowTextView
        }
*/
    }

}
