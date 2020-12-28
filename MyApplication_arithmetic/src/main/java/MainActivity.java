package com.example.myapplication_arithmetic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText et1,et2;
Button add,sub,mul,div;
TextView tv;
int res=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.editText);
        et2=(EditText)findViewById(R.id.editText2);
        add=(Button)findViewById(R.id.button);
        sub=(Button)findViewById(R.id.button2);
        mul=(Button)findViewById(R.id.button3);
        div=(Button)findViewById(R.id.button4);
        tv=(TextView)findViewById(R.id.textView);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res=Integer.parseInt(et1.getText().toString())+Integer.parseInt(et2.getText().toString());
                tv.setText(Integer.toString(res));

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res=Integer.parseInt(et1.getText().toString())-Integer.parseInt(et2.getText().toString());
                tv.setText(Integer.toString(res));

            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res=Integer.parseInt(et1.getText().toString())*Integer.parseInt(et2.getText().toString());
                tv.setText(Integer.toString(res));

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res=Integer.parseInt(et1.getText().toString())/Integer.parseInt(et2.getText().toString());
                tv.setText(Integer.toString(res));

            }
        });
    }
}
