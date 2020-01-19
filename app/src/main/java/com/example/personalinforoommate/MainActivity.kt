package com.example.personalinforoommate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.personalinforoommate.ProfileTwo
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_maineve.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maineve)

        var numberOfMatches = 0
        for (numberOfMatches in 0..10)
            Handler().postDelayed({
                textView.text = "$numberOfMatches"
                true
            }, 1000L * numberOfMatches)
        println("These are the number of matches $numberOfMatches")


        buttonsecond.setOnClickListener {
            val intent = Intent(this, ProfileTwo::class.java)
            startActivity(intent)

        }
    }
}