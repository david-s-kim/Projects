package com.example.chapter2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberTextView = findViewById<TextView>(R.id.numberText)
        val resetButton = findViewById<Button>(R.id.resetButton)
        val plusButton = findViewById<Button>(R.id.plusButton)


        var number = 0


        resetButton.setOnClickListener {
            number = 0
            numberTextView.text = number.toString()
            Log.i("onClick", "reset 숫자는 $number")

        }

        plusButton.setOnClickListener {
            number += 1
            numberTextView.text = number.toString()
            Log.i("onClick", "plus 숫자는 $number")

        }
    }
}