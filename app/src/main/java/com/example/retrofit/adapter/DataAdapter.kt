package com.example.retrofit.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofit.R
import com.example.retrofit.model.DataItem

class DataAdapter(private val dataList: List<DataItem>) :
    RecyclerView.Adapter<DataAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var id: TextView = itemView.findViewById(R.id.idTv)
        var title: TextView = itemView.findViewById(R.id.titleTv)
        var body: TextView = itemView.findViewById(R.id.bodyTv)
        var constraintLayout: ConstraintLayout = itemView.findViewById(R.id.constraintLayout)
        var expandableLayout: ConstraintLayout = itemView.findViewById(R.id.constraintLayout2)
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

        val isExpandable = dataList.expandable
        holder.expandableLayout.visibility = if (isExpandable) View.VISIBLE else View.GONE

        holder.constraintLayout.setOnClickListener {
            isAnyItemExpanded(position)
            dataList.expandable = !dataList.expandable
            notifyItemChanged(position, Unit)
        }
    }

    private fun isAnyItemExpanded(position: Int) {
        val temp = dataList.indexOfFirst {
            it.expandable
        }
        if (temp >= 0 && temp != position) {
            dataList[temp].expandable = false
            notifyItemChanged(temp, 0)
        }
    }
}