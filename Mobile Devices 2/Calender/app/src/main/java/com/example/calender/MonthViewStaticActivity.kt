package com.example.calender

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import java.time.DayOfWeek
import java.time.LocalDateTime

class MonthViewStaticActivity : AppCompatActivity() {

    private var mToday : LocalDateTime? = null
    private var mViews = arrayOf<TextView>()
    //private var mViews = Array(35) { TextView(getApplicationContext()) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_month_view_static)

        mToday = intent.getSerializableExtra("today") as? LocalDateTime
        //Toast.makeText(getApplicationContext(), "MonthViewActivity : " + mToday?.dayOfWeek.toString(), Toast.LENGTH_SHORT).show()

        findViewById<TextView>(R.id.month_title).apply {
            text = mToday?.month.toString() }

        findViewById<ConstraintLayout>(R.id.month_layout).setOnClickListener {
            ShowAppointment() }


        //Toast.makeText(getApplicationContext(), "MonthViewActivity : pre populateViews", Toast.LENGTH_SHORT).show()
        //populateViews()
        //Toast.makeText(getApplicationContext(), mViews.size.toString(), Toast.LENGTH_SHORT).show()
        populateDates()

    }




    fun populateViews()
    {
        mViews.set(1, findViewById<TextView>(R.id.cell1))
        mViews.set(2, findViewById<TextView>(R.id.cell2))
        mViews.set(3, findViewById<TextView>(R.id.cell3))
        mViews.set(4, findViewById<TextView>(R.id.cell4))
        mViews.set(5, findViewById<TextView>(R.id.cell5))
        mViews.set(6, findViewById<TextView>(R.id.cell6))
        mViews.set(7, findViewById<TextView>(R.id.cell7))
        mViews.set(8, findViewById<TextView>(R.id.cell8))
        mViews.set(9, findViewById<TextView>(R.id.cell9))
        mViews.set(10, findViewById<TextView>(R.id.cell10))
        mViews.set(11, findViewById<TextView>(R.id.cell11))
        mViews.set(12, findViewById<TextView>(R.id.cell12))
        mViews.set(13, findViewById<TextView>(R.id.cell13))
        mViews.set(14, findViewById<TextView>(R.id.cell14))
        mViews.set(15, findViewById<TextView>(R.id.cell15))
        mViews.set(16, findViewById<TextView>(R.id.cell16))
        mViews.set(17, findViewById<TextView>(R.id.cell17))
        mViews.set(18, findViewById<TextView>(R.id.cell18))
        mViews.set(19, findViewById<TextView>(R.id.cell19))
        mViews.set(20, findViewById<TextView>(R.id.cell20))
        mViews.set(21, findViewById<TextView>(R.id.cell21))
        mViews.set(22, findViewById<TextView>(R.id.cell22))
        mViews.set(23, findViewById<TextView>(R.id.cell23))
        mViews.set(24, findViewById<TextView>(R.id.cell24))
        mViews.set(25, findViewById<TextView>(R.id.cell25))
        mViews.set(26, findViewById<TextView>(R.id.cell26))
        mViews.set(27, findViewById<TextView>(R.id.cell27))
        mViews.set(28, findViewById<TextView>(R.id.cell28))
        mViews.set(29, findViewById<TextView>(R.id.cell29))
        mViews.set(30, findViewById<TextView>(R.id.cell30))
        mViews.set(31, findViewById<TextView>(R.id.cell31))
        mViews.set(32, findViewById<TextView>(R.id.cell32))
        mViews.set(33, findViewById<TextView>(R.id.cell33))
        mViews.set(34, findViewById<TextView>(R.id.cell34))
        mViews.set(35, findViewById<TextView>(R.id.cell35))

    }


    fun populateDates() {

        var start : Int
        var dayCounter : Int

        var days = mToday?.dayOfMonth?.toLong()
        var monthStart = mToday?.minusDays(days!!.toLong())
        monthStart = monthStart?.plusDays(1)
        val day = monthStart?.dayOfWeek

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
            //mViews[r].text = ""
        }

        dayCounter = 1

        for ( r in start..7)
        {
            //mViews[r].text = dayCounter.toString()
            dayCounter++
        }

    }

    fun ShowAppointment()
    {
        val intentAppointment = Intent(this, AppointmentActivity::class.java).apply {}

        startActivity(intentAppointment)
    }
}
