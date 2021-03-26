package com.example.calender

import android.util.Log
import java.sql.Date

class Appointment (start : Date, end : Date) {

        // properties
        private var start: Date? = null
        private var end: Date? = null
        private var name: String? = null


        init{

            this.start = start
            this.end = end

            Log.v("Appointment.init", "Constructor: " + this.getStart())

        }

        // methods
        fun changeStart( start: Date ){
            this.start = start
        }

        fun getStart( ): Date?{
            return start
        }

        fun changeEnd( end: Date ){
            this.end = end
        }

        fun getEnd( ): Date?{
            return end
        }

        fun changeName( name: String ){
            this.name = name
        }

        fun getName( ): String?{
            return name
        }
    }
