package com.example.eve_wxmanhacks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.personalinforoommate.MainActivity
import com.example.personalinforoommate.R
import kotlinx.android.synthetic.main.activity_similarity_of_your_roomate.*

class SimilarityOfYourRoomate : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_similarity_of_your_roomate)


        buttonfirst.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }



}

