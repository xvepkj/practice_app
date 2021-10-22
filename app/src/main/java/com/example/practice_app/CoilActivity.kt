package com.example.practice_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import coil.api.load
import coil.transform.RoundedCornersTransformation

class CoilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coil)
        val imageView : ImageView = findViewById(R.id.imageView2)

        imageView
            .load("https://upload.wikimedia.org/wikipedia/commons/d" +
                "/de/%21%21%21%21_Palazzo_Dorell_ancillary_building.jpg"){
                transformations(RoundedCornersTransformation(50F))
                build()
            }
    }
}