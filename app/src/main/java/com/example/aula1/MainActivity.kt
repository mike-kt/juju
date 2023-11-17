package com.example.aula1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnStart : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStart = findViewById(R.id.btnStart)




        btnStart.setOnClickListener{
            //Starta uma nova activity
            val intent = Intent(this, Questions::class.java)
            startActivity(intent)

        }
    }




}