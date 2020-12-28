package com.example.gesture1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.gesture.Gesture;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GestureDetectorCompat gd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button b1=findViewById(R.id.button);
        gd = new GestureDetectorCompat(this, new MyGesture());



    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        gd.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    class MyGesture extends GestureDetector.SimpleOnGestureListener {
        @Override
        public void onLongPress(MotionEvent e) {
            Toast.makeText(getApplicationContext(),"OnLongPress",Toast.LENGTH_LONG).show();
            super.onLongPress(e);
        }

        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            Toast.makeText(getApplicationContext(),"OnScroll",Toast.LENGTH_LONG).show();
            return super.onScroll(e1, e2, distanceX, distanceY);
        }

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            Toast.makeText(getApplicationContext(),"OnFling",Toast.LENGTH_LONG).show();
            return super.onFling(e1, e2, velocityX, velocityY);
        }

        @Override
        public void onShowPress(MotionEvent e) {
            Toast.makeText(getApplicationContext(),"OnShowPress",Toast.LENGTH_LONG).show();
            super.onShowPress(e);
        }
    }
}
