package com.john.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ExampleIntentExplicit : AppCompatActivity() {
    private lateinit var btnFirst : Button
    private lateinit var btnSecond : Button
    private lateinit var intent : Intent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initEvent()
    }
    private fun initEvent() {
        btnFirst = findViewById(R.id.btn1)
        btnSecond = findViewById(R.id.btn2)

        btnFirst.setOnClickListener{ view ->
            intent = Intent(this,FirstActivityIntentExplicit::class.java).apply {
                  putExtra("name","john")
            }
            startActivity(intent)
        }


        btnSecond.setOnClickListener{ view ->
            intent = Intent(this, SecondActivityIntentExplicit::class.java).apply {
                    putExtra("name", "Sonia")
                }
            startActivity(intent)
        }
    }
}