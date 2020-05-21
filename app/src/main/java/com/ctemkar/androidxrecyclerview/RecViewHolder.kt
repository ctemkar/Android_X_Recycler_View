package com.ctemkar.androidxrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
RecyclerView.ViewHolder(inflater.inflate(R.layout.rec_holder_view, parent, false)) {
    private var mTvToken : TextView? = null
    private var mTvValue : TextView? = null
    init {
        mTvToken = itemView.findViewById(R.id.tvToken)
        mTvValue = itemView.findViewById(R.id.tvValue)

    }
    fun bind(tokenText: String, valueText : String) {
        mTvToken?.text = tokenText
        mTvValue?.text = valueText
    }
}