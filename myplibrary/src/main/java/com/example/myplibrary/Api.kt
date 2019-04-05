package com.example.myplibrary

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface Api {

    @GET("search")
    fun getList(@Query("term") artist: String): Call<AudioSearchModel>
}