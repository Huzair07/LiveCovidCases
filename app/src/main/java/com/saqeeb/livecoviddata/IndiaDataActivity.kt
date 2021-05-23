package com.saqeeb.livecoviddata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class IndiaDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_india_data)
        val recycler=findViewById<RecyclerView>(R.id.recycler)
        val indiaResponse = intent.extras!!.get("DataObject") as IndiaResponse
        val data: ArrayList<IndiaState>
        data=indiaResponse.data.regional
        val adapter = DataAdapter(data)
        recycler.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recycler.adapter=adapter

    }
}