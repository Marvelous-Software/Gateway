
import android.R
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.time.DayOfWeek
import java.time.LocalDateTime


class MonthViewStaticActivity : AppCompatActivity() {
    package com.example.calender

    private var mToday : LocalDateTime? = null
    //private var mViews = arrayOf<TextView>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_month_view_static)

        mToday = intent.getSerializableExtra("today") as? LocalDateTime
        Toast.makeText(getApplicationContext(), "MonthViewActivity : " + mToday?.dayOfWeek.toString(), Toast.LENGTH_SHORT).show()

        findViewById<TextView>(R.id.month_title).apply {
            text = mToday?.month.toString() }

        populateViews()

        populateDates()

    }

    fun populateViews()
    {
        //mViews.se


    }

    fun populateDates() {

        var start : Int
        var dayCounter : Int

        var days = mToday?.dayOfMonth?.toLong()
        var monthStart = mToday?.minusDays(days!!.toLong())
        monthStart = monthStart?.plusDays(1)
        val day = monthStart?.dayOfWeek

        Toast.makeText(getApplicationContext(), "MonthViewActivity : " + day.toString(), Toast.LENGTH_SHORT).show()

        if (day == DayOfWeek.SUNDAY)
            start = 1
        else if (day == DayOfWeek.MONDAY)
            start = 2
        else if (day == DayOfWeek.TUESDAY)
            start = 3
        else if (day == DayOfWeek.WEDNESDAY)
            start = 4
        else if (day == DayOfWeek.THURSDAY)
            start = 5
        else if (day == DayOfWeek.FRIDAY)
            start = 6
        else
            start = 7

        for ( r in 1..start)
        {
            //findViewById<TextView>(R.id.cell).apply {
             //   text = mToday?.month.toString() }
        }

        for ( r in start..7)
        {

        }
    }
}
