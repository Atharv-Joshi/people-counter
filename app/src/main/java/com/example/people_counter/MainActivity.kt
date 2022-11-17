package com.example.people_counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var timesClicked = 0
        findViewById<Button>(R.id.mybutton).setOnClickListener {
            val textView = findViewById<TextView>(R.id.textView)
            timesClicked += 1
            textView.text = timesClicked.toString()
        }
    }
}