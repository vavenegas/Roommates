package com.example.personalinforoommate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class SummaryofPI4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        keepSwipe.setOnClickListener {
            val intent = Intent(this, Register::class.java)//chang to swipe later
            startActivity(intent)
        }
    }
}
