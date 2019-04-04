package com.example.myplibrary;

import android.content.Context;
import android.content.Intent;

public class MyStudents {

    @Deprecated
    public MyStudents(Context context){
        context.startActivity(new Intent(context, MyLibraryActivity.class));
    }

}
