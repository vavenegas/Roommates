package com.example.personalinforoommate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.personalinforoommate.ProfileTwo
import kotlinx.android.synthetic.main.activity_matcher.*

class Matcher : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_matcher)

        back.setOnClickListener {
            val intent = Intent (this, ProfileTwo::class.java)
            startActivity(intent)
        }
    }
}
