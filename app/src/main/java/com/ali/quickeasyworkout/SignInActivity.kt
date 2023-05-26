package com.ali.quickeasyworkout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


lateinit var  btnLogin: Button

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        btnLogin = findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
}
    }
}