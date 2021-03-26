package com.example.calender

class Week {

    private var weekDays : ArrayList<Day>? = null


    init
    {
        weekDays = ArrayList<Day>()
    }


    fun addDay( day : Day)
    {
        weekDays?.add(day)
    }
}