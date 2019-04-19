package com.example.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
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
        int red=x.nextInt(256);
        txvr.setText("red:"+red);
        txvr.setTextColor(Color.rgb(red,0,0));

        int green=x.nextInt(256);
        txvg.setText("green:"+green);
        txvg.setTextColor(Color.rgb(0,green,0));

        int blue=x.nextInt(256);
        txvb.setText("blue:"+blue);
        txvb.setTextColor(Color.rgb(0,0,blue));

        text+=red+","+green+","+blue+"\n";
        txv.setTextSize(16);
        txv.setText(text);
        txv.setMovementMethod(new ScrollingMovementMethod());
        txv.setBackgroundColor(Color.rgb(red,green,blue));
    }
}
