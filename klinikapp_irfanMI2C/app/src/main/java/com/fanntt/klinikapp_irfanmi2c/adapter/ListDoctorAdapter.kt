package com.fanntt.klinikapp_irfanmi2c.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.fanntt.klinikapp_irfanmi2c.R
import com.fanntt.klinikapp_irfanmi2c.detailDokter
import com.fanntt.klinikapp_irfanmi2c.model.ModelListDoctors
import com.fanntt.klinikapp_irfanmi2c.screen.HomeDoctorsActivity


class ListDoctorAdapter(
    val getDetaildoctor: HomeDoctorsActivity,
    val itemDoctorList: List<ModelListDoctors>

) : RecyclerView.Adapter<ListDoctorAdapter.MyViewHolder>(){
    class MyViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        var ImgDoctor : ImageView=itemView.findViewById(R.id.detailimgDoctor)
        var NamaDoctor : TextView=itemView.findViewById(R.id.detailtxtDoctorName)
        var SpecsDoctor : TextView=itemView.findViewById(R.id.detailtxtDoctorSpecs)
        var JumlahReview : TextView=itemView.findViewById(R.id.detailtxtReviews)
        var JumlahRating: TextView=itemView.findViewById(R.id.detailtxtAvgRating)
        var doctorCard : CardView=itemView.findViewById(R.id.doctorCard)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_doctor,parent,false )
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemDoctorList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = itemDoctorList[position]
        holder.ImgDoctor.setImageResource(currentItem.ImgDoctor)
        holder.NamaDoctor.text = currentItem.NamaDoctor.toString()
        holder.SpecsDoctor.text = currentItem.SpecsDoctor.toString()
        holder.JumlahReview.text = currentItem.JumlahReview.toString()
        holder.JumlahRating.text = currentItem.JumlahRating.toString()

        holder.doctorCard.setOnClickListener(){

            //deklarasi intent
            val intent = Intent(getDetaildoctor, detailDokter::class.java)
            //put Extra
            intent.putExtra("ImgDoctor", itemDoctorList[position].ImgDoctor)
            intent.putExtra("NamaDoctor",itemDoctorList[position].NamaDoctor)
            intent.putExtra("SpecsDoctor",itemDoctorList[position].SpecsDoctor)
            intent.putExtra("JumlahReview",itemDoctorList[position].JumlahReview)
            intent.putExtra("JumlahRating",itemDoctorList[position].JumlahRating)
            getDetaildoctor.startActivity(intent)

            Toast.makeText(getDetaildoctor,itemDoctorList[position].NamaDoctor, Toast.LENGTH_SHORT).show()

        }

    }

}