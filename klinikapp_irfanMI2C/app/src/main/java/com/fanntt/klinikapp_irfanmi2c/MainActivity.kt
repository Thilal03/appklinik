package com.fanntt.klinikapp_irfanmi2c

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.fanntt.klinikapp_irfanmi2c.screen.HomeDoctorsActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        // set sebagai splash screen
        setContentView(R.layout.activity_main)
        // agar page full screen
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)

        //splash screen
        //handle untuk delay dalam beberapa detik
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this,HomeDoctorsActivity::class.java)
            startActivity(intent)
            finish()// agar ketika pindah ke page 2 , itu tidak back ke splash screen
        },3000)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}