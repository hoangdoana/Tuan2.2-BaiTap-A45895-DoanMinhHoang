package com.example.myapplication2.Tuan2

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication2.R

class Tuan2MainActivityResult : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tuan2_main_result)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val tvKQ=findViewById<TextView>(R.id.tuan2TvKQ)
        val i1=intent
        // cach viet tat
        //val so1=i1.extras!!.getString("so1").toFloat();
        //val so2=i1.extras!!.getString("so2").toFloat();

        // cach viet tuong minh
        val chuoi1= i1.extras!!.getString("so1")
        val so1=chuoi1!!.toFloat()
        val chuoi2= i1.extras!!.getString("so2")
        val so2=chuoi2!!.toFloat()
        val tong=so1+so2
        tvKQ!!.text=tong.toString()
    }
}