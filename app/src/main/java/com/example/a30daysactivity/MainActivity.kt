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
            getString(R.string.day14_text)
        )

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview_layout)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = Adapter(items)
    }
}