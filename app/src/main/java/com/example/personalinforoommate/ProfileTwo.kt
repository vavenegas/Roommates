package com.example.personalinforoommate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.personalinforoommate.R
import kotlinx.android.synthetic.main.activity_profile_two.*

class ProfileTwo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_two)

        sadbutton2.setOnClickListener {
            val intent = Intent(this, ProfileOne::class.java)
            startActivity(intent)

        }

        happybutton2.setOnClickListener {
            val intent = Intent(this, Profilethree::class.java)
            startActivity(intent)
        }
    }
}
