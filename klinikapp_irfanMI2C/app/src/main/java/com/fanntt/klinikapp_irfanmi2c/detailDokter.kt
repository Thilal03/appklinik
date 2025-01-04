package com.fanntt.klinikapp_irfanmi2c

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import javax.microedition.khronos.opengles.GL10

class detailDokter : AppCompatActivity() {

    private lateinit var detailnama : TextView
    private lateinit var detailspec : TextView
    private lateinit var detailrating : TextView
    private lateinit var detailreview: TextView
    private lateinit var detailimg : ImageView
    private lateinit var carddoctor : CardView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_dokter)

        detailspec=findViewById(R.id.detailtxtDoctorSpecs)
        detailimg=findViewById(R.id.detailimgDoctor)
        detailreview=findViewById(R.id.detailtxtReviews)
        detailnama=findViewById(R.id.detailtxtDoctorName)
        detailrating=findViewById(R.id.detailtxtAvgRating)


        //get data
        val Detailnama = intent.getStringExtra("NamaDoctor")
        val Detailspec = intent.getStringExtra("SpecsDoctor")
        val Detailreview = intent.getStringExtra("JumlahReview")
        val Detailrating = intent.getStringExtra("JumlahRating")
        val DetailImg = intent.getIntExtra("ImgDoctor",0)

        //tampilkan
        detailnama.setText(Detailnama)
        detailimg.setImageResource(DetailImg)
        detailreview.setText(Detailreview)
        detailrating.setText(Detailrating)
        detailspec.setText(Detailspec)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}