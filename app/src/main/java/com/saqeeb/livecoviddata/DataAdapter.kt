package com.saqeeb.livecoviddata

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class DataAdapter(val data: ArrayList<IndiaState>) : RecyclerView.Adapter<DataAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.india_state_view,parent,false)
        return ViewHolder(view)

    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        if (position % 2 == 0){
            holder.back.setBackgroundColor(Color.WHITE)
        }
        holder.cityName.text = data.get(position).loc
        holder.total.text = "Total :${data.get(position).totalConfirmed.toString()}"
        holder.recover.text ="Discharged :${data.get(position).discharged.toString()}"
        holder.deaths.text = "Deaths :${data.get(position).deaths.toString()}"
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cityName = itemView.findViewById<TextView>(R.id.id_text_state_name)
        val total = itemView.findViewById<TextView>(R.id.id_text_total)
        val deaths = itemView.findViewById<TextView>(R.id.id_text_deaths)
        val recover = itemView.findViewById<TextView>(R.id.id_text_recovered)
        val back = itemView.findViewById<LinearLayout>(R.id.id_card)
    }
}

