package com.example.myapplication2.Tuan2

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication2.R

class Tuan22MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tuan22_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.tuan22Lv1)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var lv1=findViewById<ListView>(R.id.tuan22Lv1)
        var arr= arrayOf("Item1", "Item2", "Item3", "Item4")
        var adapter1 = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,arr)
        lv1!!.adapter=adapter1
    }
}