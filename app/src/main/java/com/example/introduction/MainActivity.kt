package com.example.introduction

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var Buttonfastnfurious10:Button
    lateinit var Buttonsignup:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Buttonfastnfurious10 = findViewById(R.id.button)
        Buttonsignup = findViewById(R.id.Btn_Register)

        Buttonfastnfurious10.setOnClickListener {
            val intent = Intent(this, fastnfurious::class.java)
            startActivity(intent)
        }
        Buttonsignup.setOnClickListener {
            val mimi = Intent(this, Buttonsignup::class.java)
            startActivity(mimi)
        }
