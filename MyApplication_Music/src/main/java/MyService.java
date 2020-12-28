package com.example.myapplication_music;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.IBinder;
import android.provider.Settings;

import static android.app.Service.START_STICKY;

public class MyService extends Service {


    public MyService() {
    }
    MediaPlayer mp;
    @Override
    public IBinder onBind(Intent intent) {

        return null;
    }
    @Override
    public int onStartCommand(Intent intent, int flags,
                              int startId) {
        Bundle extras = intent.getExtras();
        int x = extras.getInt("key");


        if (x == 1) {


            mp = MediaPlayer.create(this, R.raw.hp);
            mp.setLooping(true);
            mp.start();
            return START_STICKY;
        } else {

            mp = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);
            mp.setLooping(true);
            mp.start();
            return START_STICKY;
        }
    }

        @Override
        public void onDestroy() {
            super.onDestroy();
            mp.stop();
        }
    }



