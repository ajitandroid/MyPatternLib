package com.example.myplibrary


import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_my_library.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


/**
 * A simple [Fragment] subclass.
 */
class MyLibraryFragment : Fragment() {

    val BASE_URL = "https://itunes.apple.com/"

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_library, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        txtView.setOnClickListener {
            getList()
        }
    }

    fun getList() {
        var myResponse:String = "NULL"
        val retrofit: Retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        val api = retrofit.create(Api::class.java)
        val call = api.getList("jack johnson")
        call.enqueue(object : Callback<AudioSearchModel> {

            override fun onResponse(call: Call<AudioSearchModel>?, response: Response<AudioSearchModel>?) {
                var usres = response?.body()
                Log.e("RESPONSE", usres.toString())
                myResponse = usres.toString()
                dispData(myResponse)
            }

            override fun onFailure(call: Call<AudioSearchModel>?, t: Throwable?) {
                Log.e("Error", t.toString())
                myResponse = t.toString()
                dispData(myResponse)
            }
        })
    }

    fun dispData(data:String){
        Toast.makeText(activity,data,Toast.LENGTH_SHORT).show()
        txtView.text = data
    }

}
