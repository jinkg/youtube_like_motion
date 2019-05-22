package com.kinglloy.examples.youtube

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<RecyclerView>(R.id.recycler_view_front).apply {
            //            adapter =

            isNestedScrollingEnabled = false
            layoutManager = LinearLayoutManager(this@MainActivity)
        }

        findViewById<RecyclerView>(R.id.recycler_view_back).apply {
            //            isNestedScrollingEnabled = false
//            layoutManager = LinearLayoutManager(this@MainActivity)
        }

//        findViewById<View>(R.id.top_image_container).apply {
//            setOnClickListener {
//
//            }
//        }
    }
}
