package com.example.practice_app

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.facebook.drawee.backends.pipeline.Fresco
import com.facebook.drawee.view.SimpleDraweeView
import com.facebook.imagepipeline.request.ImageRequest
import com.facebook.imagepipeline.common.ResizeOptions

import com.facebook.imagepipeline.request.ImageRequestBuilder




class FrescoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Fresco.initialize(this)

        setContentView(R.layout.activity_fresco)

        val networkImage : SimpleDraweeView = findViewById(R.id.networkimage)
        val animimage : SimpleDraweeView = findViewById(R.id.animimage)

        networkImage.setImageURI("https://upload.wikimedia.org/wikipedia/commons/7/7c/Mount_Kenya.jpg")

        animimage.controller = Fresco.newDraweeControllerBuilder()
            .setImageRequest(ImageRequest.fromUri("https://media.giphy.com/media/YWf50NNii3r4k/giphy.gif"))
            .setAutoPlayAnimations(true)
            .build()
    }
}