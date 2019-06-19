package com.example.shruti.saveyoursouls;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import static com.example.shruti.saveyoursouls.R.id.videoView2;

public class flood extends AppCompatActivity {
    Button clk;
    VideoView videov;
    MediaController mediaC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flood);
        clk = (Button) findViewById(R.id.button9);
        videov = (VideoView) findViewById(videoView2);
        mediaC = new MediaController(this);
    }
    public void videoplay(View v)
    {
        String videopath = "android.resource://com.example.shruti.saveyoursouls/"+R.raw.flo;
        Uri uri= Uri.parse(videopath);
        videov.setVideoURI(uri);
        videov.setMediaController(mediaC);
        mediaC.setAnchorView(videov);
        videov.start();

    }
}
