package com.example.personalinforoommate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class PersonalInfo3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        FinishButtonL3.setOnClickListener {
            val intent = Intent(this, infoNext::class.java)
            startActivity(intent)

        }
    }
}
