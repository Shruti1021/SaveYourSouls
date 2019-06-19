package com.example.shruti.saveyoursouls;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mainmenu extends AppCompatActivity {
    private Button viewtutorials;
    private Button contacthelpline;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);
        viewtutorials = (Button)findViewById(R.id.button);
        viewtutorials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTutorials();
            }
        });
        contacthelpline = (Button)findViewById(R.id.button2);
        contacthelpline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHelpline();
            }
        });

    }
    public void openTutorials(){
        Intent intent = new Intent(this,tutorials.class);
        startActivity(intent);
    }
    public void openHelpline(){
        Intent intent = new Intent(this,helpline.class);
        startActivity(intent);
    }
}
