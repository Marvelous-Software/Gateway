package com.example.calender

import android.util.Log
import java.sql.Date

class Day (day : Int, month : Int, year : Int)  {

    private var day: Int? = null
    private var month: Int? = null
    private var year: Int? = null
    private var appointments : ArrayList<Appointment>? = null


    init{

        this.day = day
        this.month = month
        this.year = year

        appointments = ArrayList<Appointment>()

        Log.v("Day.init", "Constructor: " + this.getDay())

    }


    fun addAppointment( appointment : Appointment)
    {
        appointments?.add(appointment)
    }


    fun getDay( ): Int?{
        return day
    }


    fun getMonth( ): Int?{
        return month
    }


    fun getYear( ): Int?{
        return year
    }
}