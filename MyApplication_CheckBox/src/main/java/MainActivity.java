package com.example.myapplication_checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox cb1,cb2,cb3;
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb1=(CheckBox)findViewById(R.id.cb_india);
        cb2=(CheckBox)findViewById(R.id.cb_us);
        cb3=(CheckBox)findViewById(R.id.cb_china);

        btn=(Button)findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       if (cb1.isChecked()) {
                                           Toast.makeText(MainActivity.this, "You selected India", Toast.LENGTH_LONG).show();
                                       } else {
                                           Toast.makeText(MainActivity.this, "You did not select India", Toast.LENGTH_LONG).show();
                                       }
                                   }
                               }

        );


    }
}
