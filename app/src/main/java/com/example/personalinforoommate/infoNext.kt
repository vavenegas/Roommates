package com.example.personalinforoommate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_info_next.*

class infoNext : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_next)

        submit.setOnClickListener {
            val intent = Intent( this, onOffCampus::class.java)
            startActivity(intent)
        }
    }
}
