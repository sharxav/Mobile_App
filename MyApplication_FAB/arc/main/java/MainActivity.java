package com.example.myapplication_fab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
FloatingActionButton fab,fab1,fab2;
Animation fab_open,fab_close,rotate_forward,rotate_backward;
boolean isOpen=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab=(FloatingActionButton)findViewById(R.id.floatingActionButton);
        fab1=(FloatingActionButton)findViewById(R.id.floatingActionButton2);
        fab2=(FloatingActionButton)findViewById(R.id.floatingActionButton3);

        fab_open= AnimationUtils.loadAnimation(this,R.anim.fab_open);
        fab_close=AnimationUtils.loadAnimation(this,R.anim.fab_close);
        rotate_forward=AnimationUtils.loadAnimation(this,R.anim.rotate_forward);
        rotate_backward=AnimationUtils.loadAnimation(this,R.anim.rotate_backward);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animateFab();
            }
        });

        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Camera is clicked",Toast.LENGTH_SHORT).show();
            }
        });

        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Folder is clicked",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void animateFab()
    {
        if(isOpen)
        {
            fab.startAnimation(rotate_forward);
            fab1.startAnimation(fab_close);
            fab2.startAnimation(fab_close);
            fab1.setClickable(false);
            fab2.setClickable(false);
            isOpen=false;

        }
        else{

            fab.startAnimation(rotate_backward);
            fab1.startAnimation(fab_open);
            fab2.startAnimation(fab_open);
            fab1.setClickable(true);
            fab2.setClickable(true);
            isOpen=true;
        }
    }
}
