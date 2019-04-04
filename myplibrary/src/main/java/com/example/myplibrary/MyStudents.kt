package com.example.myplibrary

import android.content.Context
import android.content.Intent

class MyStudents @Deprecated("")
constructor(context: Context) {

    init {
        context.startActivity(Intent(context, MyLibraryActivity::class.java))
    }

}
