package com.saqeeb.livecoviddata

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.Serializable

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        findViewById<Button>(R.id.id_home_india).setOnClickListener {
            getData()
        }

    }

    private fun getData() {
       val data = Api.indiaService.getIndiaData()
        data.enqueue(object :Callback<IndiaResponse>{
            override fun onFailure(call: Call<IndiaResponse>, t: Throwable) {


                Toast.makeText(this@HomeActivity,t.message,Toast.LENGTH_LONG).show()
            }

            override fun onResponse(call: Call<IndiaResponse>, response: Response<IndiaResponse>) {
                val indiaResponse =response.body()
                displaySummary(indiaResponse)
            }

        })
    }

    private fun displaySummary(indiaResponse: IndiaResponse?) {
        val alertDialog = AlertDialog.Builder(this)
        alertDialog.setTitle("Summary From India")
        if (indiaResponse != null) {
            alertDialog.setMessage("Total: ${indiaResponse.data.summary.total.toString()}\n\n" +
                    "Discharged: ${indiaResponse.data.summary.discharged}\n\n" +
            "Deaths: ${indiaResponse.data.summary.deaths}")
        }
        alertDialog.setPositiveButton("State Wise"){_,_->
            val intent = Intent(applicationContext,IndiaDataActivity::class.java)
           intent.putExtra("DataObject",indiaResponse as Serializable)
            startActivity(intent)
        }.setNegativeButton("Cancel"){_,_->

        }

        val alert = alertDialog.create()
        alert.show()

    }
}