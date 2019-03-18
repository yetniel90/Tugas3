package com.example.rama

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.list.view.*

class RecycleAdapter (val list:Array<User>):
    RecyclerView.Adapter<RecycleAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
       val v = LayoutInflater.from(parent.context).inflate(R.layout.list,parent,false)
        return Holder(v)
     }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val lis= list[position]
        holder.nameTxt.text=lis.name
        holder.img.setImageResource(lis.image)
    }

    override fun getItemCount(): Int = list?.size
   class Holder( itemView: View):RecyclerView.ViewHolder(itemView){
       val img = itemView.findViewById(R.id.fImage) as ImageView
       val nameTxt = itemView.findViewById(R.id.fName) as TextView
   }
}