package com.example.practice_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
  lateinit var toastButton : Button
  lateinit var explicitIntent : Button
  lateinit var implicitIntent : Button
  lateinit var serviceButton : Button
  lateinit var activitylifecycle : Button
  lateinit var basicFragment : Button
  lateinit var navigationComponentButton : Button

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    toastButton = findViewById(R.id.toast_button)
    explicitIntent = findViewById(R.id.explicit_intent)
    implicitIntent = findViewById(R.id.implicit_intent)
    serviceButton = findViewById(R.id.service)
    serviceButton = findViewById(R.id.service)
    activitylifecycle = findViewById(R.id.activity_lifecycle)
    basicFragment = findViewById(R.id.basic_fragment)
    navigationComponentButton = findViewById(R.id.navigation_component)

    toastButton.setOnClickListener{
      Toast.makeText(applicationContext, "This is a test", Toast.LENGTH_SHORT).show()
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

    basicFragment.setOnClickListener{
      Toast.makeText(applicationContext, "Just for internal fragment making practice", Toast.LENGTH_SHORT).show()
    }

    activitylifecycle.setOnClickListener{
      val Intent = Intent(applicationContext, LifeCycle::class.java)
      startActivity(Intent)
    }

    navigationComponentButton.setOnClickListener{
      val Intent = Intent(applicationContext, NavigationContainer::class.java)
      startActivity(Intent)
    }
  }
}