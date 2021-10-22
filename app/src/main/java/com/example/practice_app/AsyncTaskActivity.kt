package com.example.practice_app

import android.app.ProgressDialog
import android.os.AsyncTask
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import org.json.JSONArray
import org.json.JSONException
import java.io.InputStreamReader
import java.lang.Exception
import java.net.HttpURLConnection
import java.net.URL

class AsyncTaskActivity : AppCompatActivity() {
    var apiUrl =
        "http://mobileappdatabase.in/demo/smartnews/app_dashboard/jsonUrl/single-article.php?article-id=71"
    var title: String? = null
    var image: String? = null
    var category: String? = null
    var titleTextView: TextView? = null
    var categoryTextView: TextView? = null
    var progressDialog: ProgressDialog? = null
    var displayData: Button? = null
    var imageView: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_async_task)
        // get the reference of View's
        titleTextView = findViewById<View>(R.id.titleTextView) as TextView
        categoryTextView = findViewById<View>(R.id.categoryTextView) as TextView
        displayData = findViewById<View>(R.id.displayData) as Button
        imageView = findViewById<View>(R.id.imageView) as ImageView
        // implement setOnClickListener event on displayData button
        displayData!!.setOnClickListener { // create object of MyAsyncTasks class and execute it
            val myAsyncTasks: MyAsyncTasks = MyAsyncTasks()
            myAsyncTasks.execute()
        }
    }

    open inner class MyAsyncTasks :
        AsyncTask<String?, Int?, String>() {
        override fun onPreExecute() {
            super.onPreExecute()
            // display a progress dialog for good user experiance
            progressDialog = ProgressDialog(this@AsyncTaskActivity)
            progressDialog!!.setMessage("Please Wait")
            progressDialog!!.setCancelable(false)
            progressDialog!!.show()
        }

        override fun doInBackground(vararg params: String?): String? {

            // implement API in background and store the response in current variable
            var current = "Pratham"
            for (i in 1..100000){
                publishProgress(i)
            }
            return current
        }

        override fun onProgressUpdate(vararg values: Int?) {
            super.onProgressUpdate(*values)
            progressDialog!!.setMessage(values[0].toString())
        }
        override fun onPostExecute(s: String) {
            Log.d("data", s)
            Picasso.get()
                .load(R.drawable.img)
                .into(imageView)
            titleTextView!!.text = s
            // dismiss the progress dialog after receiving data from API
            progressDialog!!.dismiss()

        }
    }
}