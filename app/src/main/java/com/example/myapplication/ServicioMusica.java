package com.example.myapplication;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class ServicioMusica  extends Service {


    MediaPlayer mp;

    public void onCreate(){

        super.onCreate();

        mp = MediaPlayer.create(this,R.raw.musicajuego);

        mp.setLooping(true);

        mp.setVolume(100,100);
    }


    public int onStartCommand(Intent intent, int flags, int startId){
        mp.start();

        return START_STICKY;
    }

    public void onDestroy(){

        super.onDestroy();

        if(mp.isPlaying()){
            mp.stop();
        }
        mp.release();
        mp = null;
    }

    public void mute(){

        mp.setVolume(0,0);
    }



    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}

