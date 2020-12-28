package com.example.myapplication_colours;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
LinearLayout l=(LinearLayout)findViewById(R.id.linear);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l.setBackgroundColor(Color.RED);
    }

   protected void onStart()
    {
        super.onStart();
        setContentView(R.layout.activity_main);
        
        l.setBackgroundColor(Color.BLUE);
    }
/*
    protected void onResume()
    {
        super.onResume();
        l=(LinearLayout)findViewById(R.id.linear);
        l.setBackgroundColor(Color.GREEN);
    }

    protected void onPause()
    {
        super.onPause();
        l=(LinearLayout)findViewById(R.id.linear);
        l.setBackgroundColor(Color.BLACK);
    }

    protected void  onStop()
    {
        super.onStop();
        l=(LinearLayout)findViewById(R.id.linear);
        l.setBackgroundColor(Color.YELLOW);
    }*/
}
