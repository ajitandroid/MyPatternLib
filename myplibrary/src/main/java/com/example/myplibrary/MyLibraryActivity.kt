package com.example.myplibrary

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MyLibraryActivity : AppCompatActivity() {

    var name: String? = null
    var age: String? = null
    internal lateinit var txtCnt: TextView
    internal lateinit var btnClick: Button
    internal var cnt = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_lib)
        txtCnt = findViewById(R.id.txtCnt)
        btnClick = findViewById(R.id.btnClick)
        btnClick.setOnClickListener { txtCnt.text = Integer.toString(cnt++) }

    }

    fun MyToast(context: Context) {
        Toast.makeText(context, "Name : " + name + "Age : " + age, Toast.LENGTH_SHORT).show()
    }
}
