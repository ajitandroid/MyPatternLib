package com.example.myplibrary

import retrofit2.Call
import retrofit2.http.GET



interface Api {

    @GET("search?term=jack+johnson")
    fun getList(): Call<AudioSearchModel>
}