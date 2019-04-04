package com.example.myplibrary;

import android.content.Context;
import android.content.Intent;

public class MyStudents {

    public MyStudents(Context context){
        context.startActivity(new Intent(context, MainActivity.class));
    }

}
