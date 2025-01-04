package com.fanntt.klinikapp_irfanmi2c

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity_Start2 : AppCompatActivity() {
    private lateinit var btnStart2 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_start2)

        btnStart2=findViewById(R.id.btnStart2)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnStart2.setOnClickListener(){

            val intentMenu2 = Intent(this@Activity_Start2,
                PageLogin::class.java)
            startActivity(intentMenu2)

        }
    }
}