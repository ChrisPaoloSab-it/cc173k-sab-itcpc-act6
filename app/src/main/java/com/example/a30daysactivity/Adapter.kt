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

            else -> R.drawable.day10_image
        }
        holder.dayImage.setImageResource(R.drawable.day1_image)
    }
}