package com.example.personalinforoommate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.personalinforoommate.R
import com.example.personalinforoommate.yayyy
import kotlinx.android.synthetic.main.activity_profile_one.*

class ProfileOne : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_one)

        sadbutton1.setOnClickListener {
            val intent = Intent(this, Profilethree::class.java)
            startActivity(intent)
        }
        happybutton1.setOnClickListener {
            val intent = Intent(this, yayyy::class.java)
            startActivity(intent)

        }
    }
}
