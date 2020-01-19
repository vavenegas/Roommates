package com.example.personalinforoommate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginBt.setOnClickListener {
            val intent = Intent ( this, PersonalInfo3 ::class.java)
            startActivity(intent);
        }

        toRegister.setOnClickListener {
            val intent = Intent (this, Register::class.java)
            startActivity(intent);
        }
    }
}
