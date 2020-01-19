package com.example.personalinforoommate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.personalinforoommate.ProfileTwo
import kotlinx.android.synthetic.main.activity_yayyy.*

class yayyy : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yayyy)

        view.setOnClickListener {
            val intent = Intent (this, SummaryofPI4::class.java) //personal info summary
            startActivity(intent);
        }

        skip.setOnClickListener {
            val intent = Intent (this, ProfileTwo::class.java) // change it to swipe page
            startActivity(intent);
        }


    }
}
