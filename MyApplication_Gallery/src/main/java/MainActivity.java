package com.example.myapplication_gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int img[] = {R.drawable.fruits, R.drawable.flower, R.drawable.music, R.drawable.bird};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gallery g = findViewById(R.id.gallery);
        g.setAdapter(new MyAdapter(this));
        g.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                ImageView imageView = findViewById(R.id.imageView);
                imageView.setImageResource(img[position]);
            }
        });


    }

    private class MyAdapter extends BaseAdapter {
        Context context;
        public MyAdapter(MainActivity mainActivity) {
            context=mainActivity;
            TypedArray a=context.obtainStyledAttributes(R.styleable.MyGallery);
            int im=a.getResourceId(R.styleable.MyGallery_android_galleryItemBackground,0);
            a.recycle();
        }
        @Override
        public int getCount() {
            return img.length;
        }
        @Override
        public Object getItem(int position) {
            return null;
        }
        @Override
        public long getItemId(int position) {
            return 0;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView=new ImageView(context);
            imageView.setImageResource(img[position]);
            imageView.setLayoutParams(new Gallery.LayoutParams(150,150));
            imageView.setPadding(20,20,20,20);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            return imageView;
        }
    }}
