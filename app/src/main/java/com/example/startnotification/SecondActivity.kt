package com.example.startnotification


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val message = intent.getStringExtra("MESSAGE")
        val inactive = intent.getStringExtra("INACTIVE")

        val text = findViewById<TextView>(R.id.textV)

        if (inactive == null) {
            text.text = message
        }else {
            text.text = inactive
        }
    }

}