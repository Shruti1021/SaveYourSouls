package com.example.shruti.saveyoursouls;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tutorials extends AppCompatActivity {
    private Button earthquake;
    private Button flood;
    private Button lightning;
    private Button fire;
    private Button mining;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorials);
        earthquake = (Button)findViewById(R.id.button3);
        earthquake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEarthquake();
            }
        });
        flood = (Button)findViewById(R.id.button4);
        flood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFlood();
            }
        });
        lightning = (Button)findViewById(R.id.button5);
        lightning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLightning();
            }
        });
        fire = (Button)findViewById(R.id.button6);
        fire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFire();
            }
        });
        mining = (Button)findViewById(R.id.button7);
        mining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMining();
            }
        });

    }
    public void openEarthquake(){
        Intent intent = new Intent(this,earthquake.class);
        startActivity(intent);
    }
    public void openFlood(){
        Intent intent = new Intent(this,flood.class);
        startActivity(intent);
    }
    public void openLightning(){
        Intent intent = new Intent(this,lightning.class);
        startActivity(intent);
    }
    public void openFire(){
        Intent intent = new Intent(this,fire.class);
        startActivity(intent);
    }
    public void openMining(){
        Intent intent = new Intent(this,mining.class);
        startActivity(intent);
    }
}
