package com.hopecoding.differentactivityjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    TextView dataText2;
    String gelenveri;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        dataText2=findViewById(R.id.dataText2);
        intent=getIntent();
        gelenveri=intent.getStringExtra("data");
        dataText2.setText(gelenveri);

    }

    public void goBackActivity(View view){
        intent=new Intent(SecondActivity.this,MainActivity.class);
        startActivity(intent);
        

    }



}