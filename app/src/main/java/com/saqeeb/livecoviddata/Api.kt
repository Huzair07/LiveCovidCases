package com.saqeeb.livecoviddata

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

    val BASE_URL: String
        get() = "https://api.rootnet.in/covid19-in/stats/"
interface IndiaService {


    @GET("latest/")
    fun getIndiaData() : Call<IndiaResponse>


}
object Api{
    val indiaService:IndiaService
    init {
        val retrofit = Retrofit.Builder().
                baseUrl(BASE_URL).
                addConverterFactory(GsonConverterFactory.create()).
                build()
        indiaService=retrofit.create(IndiaService::class.java)
    }

}