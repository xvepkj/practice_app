package com.example.practice_app

import android.graphics.Typeface
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.provider.FontsContract
import android.provider.FontsContract.requestFonts
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.core.provider.FontRequest
import androidx.core.provider.FontsContractCompat

class FontActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_font)
        val textView : TextView =  findViewById(R.id.textView8)
        val handler = Handler()
        val request = FontRequest(
            "com.google.android.gms.fonts",
            "com.google.android.gms",
            "name=Lobster",
            R.array.com_google_android_gms_fonts_certs
        )
        val callback = object : FontsContractCompat.FontRequestCallback() {

            override fun onTypefaceRetrieved(typeface: Typeface) {
                textView.typeface = typeface
            }

            override fun onTypefaceRequestFailed(reason: Int) {

            }
        }
        FontsContractCompat.requestFont(applicationContext, request, callback,handler)
    }
}