package com.example.practice_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.squareup.picasso.Picasso

class PicassoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picasso)

        val imageView : ImageView = findViewById(R.id.myImageView)
        val buttonDrawable : Button = findViewById(R.id.showDrawable)

//        buttonDrawable.setOnClickListener{
//            Picasso
//                .get()
//                .load(R.drawable.img)
//                .into(imageView)
//        }
        buttonDrawable.setOnClickListener{

            Picasso.get()
                .load(R.drawable.img)
                .resize(50, 50)
                .centerCrop()
                .into(imageView)

        }
    }
}