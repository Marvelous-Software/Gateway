package com.example.calender

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import java.time.LocalDateTime


class MonthViewActivity : AppCompatActivity() {

    private var mToday : LocalDateTime? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_month_view)

        mToday = intent.getSerializableExtra("today") as? LocalDateTime
        Toast.makeText(getApplicationContext(), "MonthViewActivity : " + mToday?.toLocalDate().toString(), Toast.LENGTH_SHORT).show()

        findViewById<TextView>(R.id.month_title).apply {
            text = mToday?.month.toString() }

        populateDates()

    }

    private fun populateDates() {
        //val LinearLayout
        val layout: ConstraintLayout = findViewById<ConstraintLayout>(R.id.month_layout)
        val cellSize = layout.width / 7 - 16
        val conParam = ConstraintLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        //conParam.topToBottom = ConstraintSet.PARENT_ID

        for (r in 0..6) {
            val tv = TextView(this)
            tv.text = "$r"
            tv.textSize = 24f
            tv.gravity = Gravity.CENTER
            tv.id = r
            tv.maxWidth = cellSize
            tv.minWidth = cellSize
            tv.setBackgroundColor(Color.RED)
            tv.height = 100
            tv.width = cellSize
            layout.addView(tv, conParam)
        }
    }
}
