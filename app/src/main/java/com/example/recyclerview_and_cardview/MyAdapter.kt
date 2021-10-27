package com.example.recyclerview_and_cardview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter :RecyclerView.Adapter<MyAdapter.MyHolder>() {
    var city = arrayOf("Rajkot","Dhari","Shapar")
    var district = arrayOf("Rajkot","Amreli","Junagadh")
    inner class MyHolder(itemView :View) : RecyclerView.ViewHolder(itemView){
        var city : TextView
        var district : TextView
        init {
            city = itemView.findViewById(android.R.id.text1)
            district = itemView.findViewById(android.R.id.text2)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyHolder {
        var v = LayoutInflater.from(parent.context).inflate(android.R.layout.simple_list_item_2,parent,false)
        return MyHolder(v)
    }

    override fun onBindViewHolder(holder: MyAdapter.MyHolder, position: Int) {
        holder.city.text = city[position]
        holder.district.text = district[position]
    }

    override fun getItemCount(): Int {
        return city.size
    }
}