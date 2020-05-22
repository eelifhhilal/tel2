package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val LoginButton: Button = findViewById(R.id.Login_button)
        LoginButton.text = "Log In"
        LoginButton.setOnClickListener {it: wiev!
                Toast.makeText()
        }
        }
}
