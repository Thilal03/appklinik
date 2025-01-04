package com.fanntt.klinikapp_irfanmi2c

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.fanntt.klinikapp_irfanmi2c.screen.HomeDoctorsActivity

class PageLogin : AppCompatActivity() {

    private lateinit var txtSignUp : TextView
    private lateinit var btn3 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_login)

        txtSignUp=findViewById(R.id.txtSignUp)
        btn3=findViewById(R.id.button3)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        txtSignUp.setOnClickListener(){
            val intentMenu2 = Intent(this@PageLogin,
                PageLogin2::class.java)
            startActivity(intentMenu2)
        }
        btn3.setOnClickListener()
        {
            val intentMenu2 = Intent(this@PageLogin,
                HomeDoctorsActivity::class.java)
            startActivity(intentMenu2)
        }
    }
}