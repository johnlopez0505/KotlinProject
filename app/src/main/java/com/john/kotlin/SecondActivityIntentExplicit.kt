package com.john.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class SecondActivityIntentExplicit : AppCompatActivity() {
    private lateinit var btnReturn2: Button
    private lateinit var tvName2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_intent_explicit)

        initEvent()
        showData()
    }

    private fun showData() {
        val name = getIntent().getStringExtra("name")
        tvName2.text = name
        Toast.makeText(this, "Datos mostrados con éxito", Toast.LENGTH_LONG).show()
    }

    private fun initEvent() {
        btnReturn2 = findViewById(R.id.btn_return2)
        tvName2 = findViewById(R.id.tv_second)

        btnReturn2.setOnClickListener {
            val intentReturn = Intent(this, ExampleIntentExplicit::class.java)

            startActivity(intentReturn)
        }
    }
}