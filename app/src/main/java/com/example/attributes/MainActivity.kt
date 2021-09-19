package com.example.attributes

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myEditText: EditText = findViewById(R.id.EditText1)

        val myButton1: Button = findViewById(R.id.button1)
        myButton1.setOnClickListener {
            myEditText.setTextColor(Color.BLACK)
        }
        val myButton2: Button = findViewById(R.id.button2)
        myButton2.setOnClickListener {
            myEditText.setTextColor(Color.RED)
        }
        val myButton3: Button = findViewById(R.id.button3)
        myButton3.setOnClickListener {
            myEditText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 8.toFloat())
        }
        val myButton4: Button = findViewById(R.id.button4)
        myButton4.setOnClickListener {
            myEditText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24.toFloat() )
        }
        val myButton5: Button = findViewById(R.id.button5)
        myButton5.setOnClickListener {
            myEditText.setBackgroundColor(Color.WHITE)
        }
        val myButton6: Button = findViewById(R.id.button6)
        myButton6.setOnClickListener {
            myEditText.setBackgroundColor(Color.YELLOW)
        }
    }
}