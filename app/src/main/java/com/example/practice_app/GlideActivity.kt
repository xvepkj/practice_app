package com.example.practice_app

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class GlideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_glide)

        val buttonUrl: Button = findViewById(R.id.buttonUrl)
        val buttonDrawable : Button = findViewById(R.id.buttonDrawable)
        val buttonCenterCrop : Button = findViewById(R.id.buttonCenterCrop)
        val buttonFitCenter : Button = findViewById(R.id.buttonFitCenter)
        val buttonCircleCrop : Button = findViewById(R.id.buttonCircleCrop)
        val imageView: ImageView = findViewById(R.id.imageView)
        val resizeImage =
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRe0O0260hzKyKursZUTtZAxECP0gSVJ2JXwQ&usqp=CAU"

        buttonUrl.setOnClickListener {
            Glide.with(this)
                .load(resizeImage)
                .into(imageView)
        }
        buttonDrawable.setOnClickListener{
            Glide.with(this)
                .load(R.drawable.party)
                .into(imageView)
        }
        buttonCenterCrop.setOnClickListener{
            Glide.with(this)
                .load(R.drawable.img)
                .centerCrop()
                .into(imageView)
        }
        buttonFitCenter.setOnClickListener{

            Glide.with(this)
                .load(R.drawable.img)
                .fitCenter()
                .into(imageView)

        }
        buttonCircleCrop.setOnClickListener{
            Glide.with(this)
                .load(R.drawable.img)
                .circleCrop()
                .into(imageView)
        }
    }
}