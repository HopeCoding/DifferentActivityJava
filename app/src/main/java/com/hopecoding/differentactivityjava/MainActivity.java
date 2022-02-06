package com.hopecoding.differentactivityjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText dataText;
    String veri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataText=findViewById(R.id.dataText);
        veri="";

    }


    public void goActivity(View view){
        veri=dataText.getText().toString();
        if(veri.equals("")){
            Toast.makeText(this,"You forgot enter data",Toast.LENGTH_SHORT).show();
        }else{
            Intent intent=new Intent(MainActivity.this,SecondActivity.class);
            intent.putExtra("data",veri);
            startActivity(intent);
            finish();


        }



    }


}