package com.example.personalinforoommate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.personalinforoommate.Matcher
import com.example.personalinforoommate.R
import kotlinx.android.synthetic.main.activity_profilethree.*

class Profilethree : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profilethree)

        sadbutton3.setOnClickListener {
            val intent = Intent(this, Matcher::class.java)
            startActivity(intent)
        }
    }

}
