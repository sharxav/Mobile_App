package com.example.gridviewimage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;

public class MainActivity extends AppCompatActivity {
    static final int img[]={R.drawable.music,R.drawable.login,R.drawable.xylo,R.drawable.table};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView g1=findViewById(R.id.gridview);
        g1.setAdapter(new ImageAdapter(this));
        g1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }

    private class ImageAdapter extends BaseAdapter {
        final Context mContext;
        public ImageAdapter(MainActivity mainActivity) {
            mContext=mainActivity;
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

            ImageView i = new ImageView(mContext);


            i.setImageResource(img[position]);
            i.setLayoutParams(new GridView.LayoutParams(200, 200));
            i.setScaleType(ImageView.ScaleType.CENTER_CROP);
            i.setPadding(10, 10, 10, 10);
            return i;

        }
    }

}
