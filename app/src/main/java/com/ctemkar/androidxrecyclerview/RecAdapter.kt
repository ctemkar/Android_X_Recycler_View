package com.ctemkar.androidxrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecAdapter(private val dataSet: List<RecData>) : RecyclerView.Adapter<RecViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return RecViewHolder(inflater, parent)
    }

    override fun getItemCount() = dataSet.size


    override fun onBindViewHolder(holder: RecViewHolder, position: Int) {
        holder.bind(dataSet[position].token, dataSet[position].value)
    }

}