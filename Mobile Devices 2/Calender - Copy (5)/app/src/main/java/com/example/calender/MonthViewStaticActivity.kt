package com.example.calender

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import java.time.LocalDateTime

class MonthViewStaticActivity : AppCompatActivity() {

    private var mToday : LocalDateTime? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_month_view_static)

        mToday = intent.getSerializableExtra("today") as? LocalDateTime
        Toast.makeText(getApplicationContext(), "MonthViewActivity : " + mToday?.dayOfWeek.toString(), Toast.LENGTH_SHORT).show()

        findViewById<TextView>(R.id.month_title).apply {
            text = mToday?.month.toString() }

        populateDates()

    }

    fun populateDates() {

        val days = mToday?.dayOfMonth?.toLong()
        val monthStart = mToday?.minusDays(days)

        Toast.makeText(getApplicationContext(), "MonthViewActivity : " + monthStart.toString(), Toast.LENGTH_SHORT).show()



    }
}
