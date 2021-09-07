package com.example.practice_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat

import android.content.Intent




class FSActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fsactivity)
        val startButton : Button = findViewById(R.id.start_FS)
        val stopButton : Button = findViewById(R.id.stop_FS)

        startButton.setOnClickListener{
            val serviceIntent = Intent(this, ForegroundService::class.java)
            serviceIntent.putExtra("inputExtra","Hey")
            ContextCompat.startForegroundService(this, serviceIntent)
        }

        stopButton.setOnClickListener{
            stopService(Intent(this, ForegroundService::class.java))
        }
    }
}