package com.example.myapplication_background;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button red,blue,green;
    ConstraintLayout linear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        red=(Button)findViewById(R.id.button);
        blue=(Button)findViewById(R.id.button2);
        green=(Button)findViewById(R.id.button3);
        linear=(ConstraintLayout)findViewById(R.id.linear);

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linear.setBackgroundColor(Color.RED);
            }
        });

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linear.setBackgroundColor(Color.BLUE);
            }
        });

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linear.setBackgroundColor(Color.GREEN);
            }
        });
    }
}
