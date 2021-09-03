package com.example.practice_app

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LifeCycle : AppCompatActivity() {
  val TAG = "Lifecycle"
  lateinit var pauseButton: Button
  lateinit var numberOfPauses : TextView

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_life_cycle)
    Log.d(TAG, "OnCreate Called")
    pauseButton = findViewById(R.id.pause_button)
    numberOfPauses = findViewById(R.id.number)

    if (savedInstanceState != null) {
      numberOfPauses.text = savedInstanceState.getInt("no_of_pause", 1).toString()
    }

    pauseButton.setOnClickListener{
      val currentPauseValue : Int = numberOfPauses.text.toString().toInt()
      numberOfPauses.text = (currentPauseValue + 1).toString()
      val sendIntent = Intent().apply {
        action = Intent.ACTION_SEND
        putExtra(Intent.EXTRA_TEXT, "Hi")
        type = "text/plain"
      }
      startActivity(sendIntent)
    }
  }

  override fun onSaveInstanceState(outState: Bundle) {
    super.onSaveInstanceState(outState)
    outState.putInt("no_of_pause",numberOfPauses.text.toString().toInt())
  }

  override fun onStart() {
    super.onStart()
    Log.d(TAG, "onStart Called")
  }

  override fun onResume() {
    super.onResume()
    Log.d(TAG, "onResume Called")
  }

  override fun onPause() {
    super.onPause()
    Log.d(TAG, "onPause Called")
  }

  override fun onStop() {
    super.onStop()
    Log.d(TAG, "onStop Called")
  }

  override fun onDestroy() {
    super.onDestroy()
    Log.d(TAG, "onDestroy Called")
  }

  override fun onRestart() {
    super.onRestart()
    Log.d(TAG, "onRestart Called")
  }

}