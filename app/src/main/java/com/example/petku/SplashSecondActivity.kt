// SplashSecondActivity.kt
package com.example.petku

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SplashSecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_second2)

        val playButton = findViewById<ImageButton>(R.id.playButton)
        val backButton = findViewById<TextView>(R.id.backButton)

        // Aksi untuk tombol Play
        playButton.setOnClickListener {
            // Navigasi ke halaman berikutnya atau halaman utama
            startActivity(Intent(this@SplashSecondActivity, NextActivity::class.java))
            finish()
        }

        // Aksi untuk tombol Back
        backButton.setOnClickListener {
            // Kembali ke SplashActivity pertama
            startActivity(Intent(this@SplashSecondActivity, SplashActivity::class.java))
            finish()
        }
    }
}
