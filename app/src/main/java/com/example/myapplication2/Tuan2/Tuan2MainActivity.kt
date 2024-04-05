package com.example.myapplication2.Tuan2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication2.R

class Tuan2MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tuan2_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.tuan22Lv1)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val txt1=findViewById<EditText>(R.id.tuan2Txt1)
        val txt2=findViewById<EditText>(R.id.tuan2Txt2)
        val btn1=findViewById<Button>(R.id.tuan2Btn1)
        btn1!!.setOnClickListener {
            val i = Intent(this@Tuan2MainActivity, Tuan2MainActivityResult::class.java)
            i.putExtra("so1", txt1!!.text.toString())
            i.putExtra("so2", txt2!!.text.toString())
            startActivity(i)
        }
    }
}