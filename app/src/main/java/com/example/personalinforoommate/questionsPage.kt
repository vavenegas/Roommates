package com.example.personalinforoommate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_questions_page.*

class questionsPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions_page)

        button.setOnClickListener {
            val intent = Intent(this, Register::class.java)//change to swipe later
            startActivity(intent)
        }
    }
}
