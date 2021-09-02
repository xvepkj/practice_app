package com.example.practice_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
  lateinit var toastButton : Button
  lateinit var explicitIntent : Button
  lateinit var implicitIntent : Button
  lateinit var serviceButton : Button
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    toastButton = findViewById(R.id.toast_button)
    explicitIntent = findViewById(R.id.explicit_intent)
    implicitIntent = findViewById(R.id.implicit_intent)
    serviceButton = findViewById(R.id.service)

    toastButton.setOnClickListener{
      Toast.makeText(applicationContext, "This is a test",Toast.LENGTH_SHORT).show()
    }

    explicitIntent.setOnClickListener{
      val Intent = Intent(applicationContext, IntentActivity::class.java)
      startActivity(Intent)
    }

    implicitIntent.setOnClickListener{
      val sendIntent = Intent().apply {
        action = Intent.ACTION_SEND
        putExtra(Intent.EXTRA_TEXT, "Hi")
        type = "text/plain"
      }
      startActivity(sendIntent)
     }

    serviceButton.setOnClickListener{
      val Intent = Intent(applicationContext, ServiceActivity::class.java)
      startActivity(Intent)
    }
  }
}