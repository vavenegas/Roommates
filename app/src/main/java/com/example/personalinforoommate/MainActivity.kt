package com.example.personalinforoommate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var counter = 0
        button1.setOnClickListener {
            /*counter = counter + 1
            textView1.text = counter.toString()*/
            val intent = Intent(this, Main2Activity::class.java)
            startActivity(intent)
        }
    }
}
