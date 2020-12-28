package com.example.myapplication_music;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button start,stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start=(Button)findViewById(R.id.button);
        stop=(Button)findViewById(R.id.button2);

        start.setOnClickListener(this);
        stop.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent inte=new Intent(this,MyService.class);
        if (v==start) {

            inte.putExtra("key",1);
            startService(inte);
        }

        else if (v==stop){
            inte.putExtra("key",2);
            startService(inte);
        }
    }
    private void stopService(MainActivity mainActivity,Class<MyService> myServiceClass) {
    }
}


