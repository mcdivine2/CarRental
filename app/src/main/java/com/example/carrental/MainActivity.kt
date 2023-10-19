package com.example.carrental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        when (view.id) {
            R.id.btnLogIn -> {
                val intent = Intent(this, DashBoard::class.java)
                startActivity(intent)
            }
            R.id.btnSignUp -> {
                val intent = Intent(this, SignUpAct::class.java)
                startActivity(intent)
            }
        }
    }

}