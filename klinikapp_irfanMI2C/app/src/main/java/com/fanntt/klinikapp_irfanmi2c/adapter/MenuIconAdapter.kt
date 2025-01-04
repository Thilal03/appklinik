package com.fanntt.klinikapp_irfanmi2c.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ListMenuItemView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.fanntt.klinikapp_irfanmi2c.R
import com.fanntt.klinikapp_irfanmi2c.model.ModelMenuIcon

class MenuIconAdapter (
    val itemMenuList : List<ModelMenuIcon>
) : RecyclerView.Adapter<MenuIconAdapter.MyViewHolder>(){
    class MyViewHolder (itemView: View ) : RecyclerView.ViewHolder(itemView) {

        var ImgMenuIcon : ImageView =itemView.findViewById(R.id.imgMenuIcon)
        var txtMenuIcon : TextView = itemView.findViewById(R.id.txtIcon)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_menu_home,parent,false )
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemMenuList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = itemMenuList[position]
        holder.txtMenuIcon.text = currentItem.txtMenu.toString()
        holder.ImgMenuIcon.setImageResource(currentItem.iconMenu)
    }


}