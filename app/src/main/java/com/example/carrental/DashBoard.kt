package com.example.carrental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class DashBoard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)
    }
    fun onClick(view: View) {
        when (view.id) {
            R.id.btnUserProfile -> {
                val intent = Intent(this, UserProfile::class.java)
                startActivity(intent)
            }
        }
    }
}