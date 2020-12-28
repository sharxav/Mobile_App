package com.example.myapplication_checkradio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CheckBox foot=(CheckBox)findViewById(R.id.checkBox);
        final CheckBox cric=(CheckBox)findViewById(R.id.checkBox2);
        final RadioGroup rg=(RadioGroup)findViewById(R.id.radioGroup);
        RadioButton male=(RadioButton)findViewById(R.id.radioButton);
        RadioButton female=(RadioButton)findViewById(R.id.radioButton2);
        Button btn=(Button)findViewById(R.id.button);
        final TextView tv=(TextView)findViewById(R.id.textView);
        btn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                String data="You checked football"+foot.isChecked()+"/n"+"You checked cricket"+cric.isChecked()+"/n"+"You selected"+rg;
                tv.setText(data);
            }
        });
    }
}
