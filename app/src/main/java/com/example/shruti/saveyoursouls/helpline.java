package com.example.shruti.saveyoursouls;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.support.v7.widget.PopupMenu;
import android.widget.Toast;

public class helpline extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpline);
    }
    public void showPopup(View v){
        PopupMenu popup = new PopupMenu(this , v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
     switch(menuItem.getItemId()){
         case R.id.item1:
                     openRanchi();

             Toast.makeText(this,"Ranchi",Toast.LENGTH_SHORT).show();
         return true;
         case R.id.item2:
             openDhanbad();
             Toast.makeText(this,"Dhanbad",Toast.LENGTH_SHORT).show();
             return true;
         case R.id.item3:
             openGiridih();
             Toast.makeText(this,"Giridih",Toast.LENGTH_SHORT).show();
             return true;
         case R.id.item4:
             openPurbi();
             Toast.makeText(this,"Purbi Singhbhum",Toast.LENGTH_SHORT).show();
             return true;
         case R.id.item5:
             openBokaro();
             Toast.makeText(this,"Bokaro",Toast.LENGTH_SHORT).show();
             return true;
         default:
             return false;
     }
    }
    public void openRanchi(){
        Intent intent = new Intent(this,ranchi.class);
        startActivity(intent);
    }
    public void openDhanbad(){
        Intent intent = new Intent(this,dhanbad.class);
        startActivity(intent);
    }
    public void openGiridih(){
        Intent intent = new Intent(this,giridih.class);
        startActivity(intent);
    }
    public void openPurbi(){
        Intent intent = new Intent(this,purbi.class);
        startActivity(intent);
    }
    public void openBokaro(){
        Intent intent = new Intent(this,bokaro.class);
        startActivity(intent);
    }
}
