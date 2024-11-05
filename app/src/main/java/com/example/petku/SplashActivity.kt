// SplashActivity.java
package com.example.petku

import com.example.petku.R
import android.content.Intent
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val textView = findViewById<TextView>(R.id.textView)
        val playButton = findViewById<ImageButton>(R.id.playButton)
        val skipButton = findViewById<TextView>(R.id.skipButton)

        // Set SpannableString untuk teks yang di format berbeda
        val fullText = "With Petku's reminder feature, you'll never miss a shot"
        val spannableString = SpannableString(fullText)
        spannableString.setSpan(
            ForegroundColorSpan(resources.getColor(R.color.purple)),
            12, 20, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        textView.text = spannableString

        // Aksi untuk tombol Play
        playButton.setOnClickListener { // Navigasi ke halaman berikutnya
            startActivity(
                Intent(
                    this@SplashActivity,
                    NextActivity::class.java
                )
            )
            finish()
        }

        // Aksi untuk tombol Skip
        skipButton.setOnClickListener { // Navigasi ke halaman berikutnya
            startActivity(
                Intent(
                    this@SplashActivity,
                    NextActivity::class.java
                )
            )
            finish()
        }
    }
}