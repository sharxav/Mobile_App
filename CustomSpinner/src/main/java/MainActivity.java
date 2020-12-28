package com.example.customspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static final String names[]={"Apple","Banana","Oranges","grapes","kiwi"};
    static final int fruits[]={R.drawable.apple,R.drawable.banana,R.drawable.orange,R.drawable.grapes,R.drawable.kiwi};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner sp=findViewById(R.id.spinner);
        sp.setAdapter(new MyAdapter(this));
    }

    private class MyAdapter extends BaseAdapter {
        Context c;
        public MyAdapter(MainActivity mainActivity) {
            c=mainActivity;
        }

        @Override
        public int getCount() {
            return fruits.length;
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
            View view= LayoutInflater.from(c).inflate(R.layout.myitem,parent,false);
            ImageView i1=view.findViewById(R.id.imageView);
            TextView t1=view.findViewById(R.id.textView);
            i1.setImageResource(fruits[position]);
            t1.setText(names[position]);
            return view;
        }
    }
}
