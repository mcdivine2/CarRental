package com.example.carrental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SignUpAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
    }

    fun onClick(view: View) {
        when (view.id) {
            R.id.btnSignUpLogIn -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }

        }
    }
}