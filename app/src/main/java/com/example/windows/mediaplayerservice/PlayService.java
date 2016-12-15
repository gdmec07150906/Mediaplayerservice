package com.example.windows.mediaplayerservice;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;


    public class PlayService extends Service {
    MediaPlayer mediaPlayer;
    public PlayService(){

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        throw  new UnsupportedOperationException("Not yet implemented");

    }

    public  int onStartCommmand(Intent intent,int flags,int startId){
        mediaPlayer.start();
        return  super.onStartCommand(intent,flags,startId);
    }

        public void onCreate(){
            super.onCreate();
            mediaPlayer=MediaPlayer.create(this,R.raw.exodus);
            mediaPlayer.setLooping(true);
        }

        public  void onDestroy(){
            super.onDestroy();
            mediaPlayer.stop();
            mediaPlayer.release();
        }
}
