package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
     String text="";
     TextView txvr,txvb,txvg,txv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txvr=findViewById(R.id.textView3);
        txvg=findViewById(R.id.textView4);
        txvb=findViewById(R.id.textView5);
        txv=findViewById(R.id.textView6);
    }
    public void changecolor(View v){
        Random x=new Random();
        
    }
}
