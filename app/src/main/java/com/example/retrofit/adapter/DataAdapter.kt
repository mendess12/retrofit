package com.example.retrofit.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofit.R
import com.example.retrofit.model.DataItem

class DataAdapter(private val dataList: List<DataItem>) :
    RecyclerView.Adapter<DataAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var id: TextView = itemView.findViewById(R.id.idTv)
        var title: TextView = itemView.findViewById(R.id.titleTv)
        var body: TextView = itemView.findViewById(R.id.bodyTv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val dataList = dataList[position]
        holder.id.text = dataList.id.toString()
        holder.title.text = dataList.title
        holder.body.text = dataList.body
    }
}