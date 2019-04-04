package com.example.myplibrary;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MyLibraryActivity extends AppCompatActivity {

    public String name;
    public String age;
    TextView txtCnt;
    Button btnClick;
    int cnt = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_lib);

        txtCnt = findViewById(R.id.txtCnt);
        btnClick = findViewById(R.id.btnClick);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtCnt.setText(Integer.toString(cnt++));
            }
        });

    }
    public void MyToast(Context context){
        Toast.makeText(context, "Name : "+ name+"Age : "+age, Toast.LENGTH_SHORT).show();
    }
}
