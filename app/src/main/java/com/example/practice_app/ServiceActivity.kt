package com.example.practice_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ServiceActivity : AppCompatActivity() {
    lateinit var startButton : Button
    lateinit var stopButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)

        startButton = findViewById(R.id.startButton)
        stopButton = findViewById(R.id.stopButton)

        startButton.setOnClickListener{
            startService(Intent(this, NewService::class.java))
        }
        stopButton.setOnClickListener{
            stopService(Intent(this, NewService::class.java))
        }
    }
}