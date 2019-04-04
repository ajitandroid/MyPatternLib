package com.example.myplibrary;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MyLibraryActivity extends AppCompatActivity {

    public String name;
    public String age;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void MyToast(Context context){
        Toast.makeText(context, "Name : "+ name+"Age : "+age, Toast.LENGTH_SHORT).show();
    }
}
