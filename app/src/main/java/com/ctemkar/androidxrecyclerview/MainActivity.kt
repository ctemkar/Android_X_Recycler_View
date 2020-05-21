package com.ctemkar.androidxrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var dataSet = listOf(RecData("Row 1 Token", "Row 1 value"),
        RecData("Row 2 Token", "Row 2 value")
        )
    private lateinit var viewManager : RecyclerView.LayoutManager
    private lateinit var viewAdapter : RecyclerView.Adapter<*>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewManager = LinearLayoutManager(this)
        viewAdapter = RecAdapter(dataSet)
        recycler_view.apply {
            layoutManager = viewManager
            adapter = viewAdapter

        }

    }
}
