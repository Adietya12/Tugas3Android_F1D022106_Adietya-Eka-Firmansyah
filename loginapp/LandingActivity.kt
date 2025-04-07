package com.example.loginapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.loginapp.User

class LandingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)

        val user = intent.getParcelableExtra<User>("user_data")

        val textView = findViewById<TextView>(R.id.tvWelcome)
        textView.text = "Welcome, ${user?.name ?: "User"}"
    }
}
