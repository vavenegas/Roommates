package com.example.personalinforoommate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class PersonalInfo3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var counter = 0
        FinishButtonL3.setOnClickListener {
            /*counter = counter + 1
            textView1.text = counter.toString()*/
            val intent = Intent(this, SummaryofPI4::class.java)
            startActivity(intent)

            val input = fullNameEditTextL3.text
        }
    }
}
