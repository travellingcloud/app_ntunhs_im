package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val btnBackToFirst = findViewById<Button>(R.id.btnBackToFirst)

        btnBackToFirst.setOnClickListener {
            finish()
        }
    }
    var lastTime: Long = 0

    override fun finish() {
        val currentTime = System.currentTimeMillis()
        if (currentTime - lastTime > 3 * 1000) {
            lastTime = currentTime
            Toast.makeText(this, "Press one more time to exit", Toast.LENGTH_SHORT).show()
        } else {
            super.finish()
        }
    }
}