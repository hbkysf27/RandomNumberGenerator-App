package com.example.diceroller

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val autostart: Button = findViewById(R.id.btnstart)
        val txtView: TextView = findViewById(R.id.txthello)
        val start = true

        autostart.setOnClickListener()
        {
            if (start) {
                val luckyNumber = (1..6).random()
                txtView.text = luckyNumber.toString()

                //start=false
                autostart.text="ROLL"


            }

        }
    }
}