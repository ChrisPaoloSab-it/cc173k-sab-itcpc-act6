package com.example.a30daysactivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val
items: List<String>) :
RecyclerView.Adapter<Adapter.ViewHolder>()

{
    class ViewHolder (itemView: View) :
            RecyclerView.ViewHolder(itemView)
    {
        val dayText: TextView = itemView.findViewById(R.id.dayText)
        val dayImage: ImageView = itemView.findViewById(R.id.dayImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_display, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.dayText.text = item

        val imageResource = when (position) {
            0 -> R.drawable.day1_image
            1 -> R.drawable.day2_image
            2 -> R.drawable.day3_image
            3 -> R.drawable.day4_image
            4 -> R.drawable.day5_image
            5 -> R.drawable.day6_image
            6 -> R.drawable.day7_image
            7 -> R.drawable.day8_image
            8 -> R.drawable.day9_image
            9 -> R.drawable.day10_image
            10 -> R.drawable.day11_image
            11 -> R.drawable.day12_image
            12 -> R.drawable.day13_image
            13 -> R.drawable.day14_image
            14 -> R.drawable.day15_image
            15 -> R.drawable.day16_image
            16 -> R.drawable.day17_image
            17 -> R.drawable.day18_image
            18 -> R.drawable.day19_image
            19 -> R.drawable.day20_image
            20 -> R.drawable.day21_image
            21 -> R.drawable.day22_image
            22 -> R.drawable.day23_image
            23 -> R.drawable.day24_image
            24 -> R.drawable.day25_image
            25 -> R.drawable.day26_image
            26 -> R.drawable.day27_image
            27 -> R.drawable.day28_image
            28 -> R.drawable.day29_image

            else -> R.drawable.day30_image
        }
        holder.dayImage.setImageResource(imageResource)
    }
}