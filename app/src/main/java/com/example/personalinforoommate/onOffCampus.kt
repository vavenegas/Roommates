package com.example.personalinforoommate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_on_off_campus.*

class onOffCampus : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_off_campus)

        button.setOnClickListener {
            val intent = Intent( this, questionsPage::class.java)
            startActivity(intent);
        }

        button2.setOnClickListener {
            val intent = Intent(this, questionsPage::class.java)
            startActivity(intent);
        }
    }
}
