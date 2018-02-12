package com.learning.dath.videoplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;
import android.widget.MediaController;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final VideoView dathVideoView = findViewById(R.id.dathVideoView);
        dathVideoView.setVideoPath("https://www.youtube.com/watch?v=vSxocnIaN0A");


        //Adding Player Controls like Play, Pause, Stop, etc.,
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(dathVideoView);
        dathVideoView.setMediaController(mediaController);


        dathVideoView.start();
    }
}
