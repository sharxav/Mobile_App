package com.example.alertbox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      AlertDialog.Builder a_builder = new AlertDialog.Builder(MainActivity.this);
                                      a_builder.setMessage("Do you want to Close this App !!!")
                                              .setCancelable(false)
                                              .setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                                                  @Override
                                                  public void onClick(DialogInterface dialog, int which) {
                                                      finish();
                                                  }
                                              })
                                              .setNegativeButton("No",new DialogInterface.OnClickListener() {
                                                  @Override
                                                  public void onClick(DialogInterface dialog, int which) {
                                                      dialog.cancel();
                                                  }
                                              }) ;
                                      AlertDialog alert = a_builder.create();
                                      alert.setTitle("Alert !!!");
                                      alert.show();
                                  }
                              }

        );

    }

}
