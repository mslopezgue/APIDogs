package com.example.ejemploretrofit.cliente

import com.example.ejemploretrofit.service.MascotaService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MascotaClient {

    companion object{
        private val URL_BASE = "https://dog.ceo/api/breed/"

        private val cliente = MascotaClient

        fun getCliente(): MascotaService{
            val retrofit = Retrofit.Builder().baseUrl(URL_BASE).addConverterFactory(GsonConverterFactory.create()).build()
            return retrofit.create(MascotaService::class.java)
        }
    }
}