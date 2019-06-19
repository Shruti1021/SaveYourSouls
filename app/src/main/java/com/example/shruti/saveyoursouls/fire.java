package com.example.shruti.saveyoursouls;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import static com.example.shruti.saveyoursouls.R.id.videoView5;

public class fire extends AppCompatActivity {
    Button clk;
    VideoView videov;
    MediaController mediaC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire);
        clk = (Button) findViewById(R.id.button12);
        videov = (VideoView) findViewById(videoView5);
        mediaC = new MediaController(this);
    }
    public void videoplay(View v)
    {
        String videopath = "android.resource://com.example.shruti.saveyoursouls/"+R.raw.fire;
        Uri uri= Uri.parse(videopath);
        videov.setVideoURI(uri);
        videov.setMediaController(mediaC);
        mediaC.setAnchorView(videov);
        videov.start();

    }
}
