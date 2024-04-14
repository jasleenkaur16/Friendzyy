package com.example.friendzyy
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<TextView>(R.id.button)
        // Setting up click listener on the button
        button.setOnClickListener {
            val intent=Intent(this ,login::class.java)
            startActivity(intent)


        }
    }
}
