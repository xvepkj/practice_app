package com.example.practice_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.practice_app.databinding.ActivityVbactivityBinding

class VBActivity : AppCompatActivity() {
    private lateinit var binding: ActivityVbactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVbactivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.textViewVB.text = "This is a test"
        binding.buttonVB.setOnClickListener{
            binding.textViewVB.text = "The test is successful."
        }
    }
}