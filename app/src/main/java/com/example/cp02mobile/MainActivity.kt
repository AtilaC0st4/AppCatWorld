package com.example.cp02mobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cp02mobile.R.id.btnConheca


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnConheca = findViewById<Button>(btnConheca)

        btnConheca.setOnClickListener{

            val intent = Intent(this, Personalidade::class.java)
            startActivity(intent)
        }

    }
}