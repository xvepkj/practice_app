package com.example.practice_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.app.NotificationManager

import android.app.NotificationChannel

import android.os.Build




class MainActivity : AppCompatActivity() {
  lateinit var toastButton : Button
  lateinit var explicitIntent : Button
  lateinit var implicitIntent : Button
  lateinit var serviceButton : Button
  lateinit var activitylifecycle : Button
  lateinit var basicFragment : Button
  lateinit var navigationComponentButton : Button
  lateinit var viewModelButton : Button
  lateinit var viewModelLDButton : Button
  lateinit var viewBindingActvityButton : Button
  lateinit var viewBindingFragmentButton : Button
  lateinit var fsButton : Button
  lateinit var glideButton : Button
  lateinit var picassoButton : Button
  lateinit var frescoButton : Button
  lateinit var coilButton : Button
  lateinit var asyncTaskButton: Button
  lateinit var fontButton: Button

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
    viewModelButton = findViewById(R.id.viewModel)
    viewModelLDButton =findViewById(R.id.viewModelLD)
    viewBindingActvityButton = findViewById(R.id.view_Binding_Activity)
    viewBindingFragmentButton = findViewById(R.id.VBFragment)
    fsButton = findViewById(R.id.nav_FS)
    glideButton = findViewById(R.id.nav_Glide)
    picassoButton = findViewById(R.id.nav_picasso)
    frescoButton = findViewById(R.id.nav_fresco)
    coilButton = findViewById(R.id.nav_coil)
    asyncTaskButton = findViewById(R.id.nav_asynctask)
    fontButton = findViewById(R.id.nav_font)

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

    viewModelButton.setOnClickListener{
      val Intent = Intent(applicationContext, NavigationContainer::class.java)
      startActivity(Intent)
    }

    viewModelLDButton.setOnClickListener{
      val Intent = Intent(applicationContext, NavigationContainer::class.java)
      startActivity(Intent)
    }
    viewBindingActvityButton.setOnClickListener{
      val Intent = Intent(applicationContext, VBActivity::class.java)
      startActivity(Intent)
    }

    viewBindingFragmentButton.setOnClickListener{
      val Intent = Intent(applicationContext, NavigationContainer::class.java)
      startActivity(Intent)
    }

    fsButton.setOnClickListener{
      val Intent = Intent(applicationContext, FSActivity::class.java)
      startActivity(Intent)
    }

    glideButton.setOnClickListener{
      val Intent = Intent(applicationContext, GlideActivity::class.java)
      startActivity(Intent)
    }

    picassoButton.setOnClickListener{
      val Intent = Intent(applicationContext, PicassoActivity::class.java)
      startActivity(Intent)
    }

    frescoButton.setOnClickListener{
      val Intent = Intent(applicationContext, FrescoActivity::class.java)
      startActivity(Intent)
    }
    coilButton.setOnClickListener{
      val Intent = Intent(applicationContext, CoilActivity::class.java)
      startActivity(Intent)
    }
    asyncTaskButton.setOnClickListener{
      val Intent = Intent(applicationContext, AsyncTaskActivity::class.java)
      startActivity(Intent)
    }
    fontButton.setOnClickListener{
      val Intent = Intent(applicationContext, FontActivity::class.java)
      startActivity(Intent)
    }

    createNotificationChannel();

  }
  private fun createNotificationChannel() {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
      val serviceChannel = NotificationChannel(
        "My Channel",
        "Example Service Channel",
        NotificationManager.IMPORTANCE_DEFAULT
      )
      val manager = getSystemService(
        NotificationManager::class.java
      )
      manager.createNotificationChannel(serviceChannel)
    }
  }
}