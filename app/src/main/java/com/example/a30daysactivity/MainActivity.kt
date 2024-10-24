package com.example.a30daysactivity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var items: List<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        items = listOf(
            getString(R.string.day1_text),
            getString(R.string.day2_text),
            getString(R.string.day3_text),
            getString(R.string.day4_text),
            getString(R.string.day5_text),
            getString(R.string.day6_text),
            getString(R.string.day7_text),
            getString(R.string.day8_text),
            getString(R.string.day9_text),
            getString(R.string.day10_text),
            getString(R.string.day11_text),
            getString(R.string.day12_text),
            getString(R.string.day13_text),
            getString(R.string.day14_text),
            getString(R.string.day15_text),
            getString(R.string.day16_text),
            getString(R.string.day17_text),
            getString(R.string.day18_text),
            getString(R.string.day19_text),
            getString(R.string.day20_text),
            getString(R.string.day21_text),
            getString(R.string.day22_text),
            getString(R.string.day23_text),
            getString(R.string.day24_text),
            getString(R.string.day25_text),
            getString(R.string.day26_text),
            getString(R.string.day27_text),
            getString(R.string.day28_text),
            getString(R.string.day29_text),
            getString(R.string.day30_text)
        )

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview_layout)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = Adapter(items)
    }
}