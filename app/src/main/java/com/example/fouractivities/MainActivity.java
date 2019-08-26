package com.example.fouractivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Configuration last;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void firstClick(View view){
        Intent intent=null;
        switch(view.getId()) {
            case R.id.b1: //b1 is the id of the first button
                intent = new Intent(this,first.class);
                break;
            case R.id.b2:
                intent = new Intent(this,second.class);
                break;
            case R.id.b3:
                intent = new Intent(this,third.class);
                break;
            case R.id.b4:
//                intent = new Intent(this,fourth.class);
                finish();
                System.exit(0);
        }

        startActivity(intent);
    }
//    public void onSaveInstanceState(Bundle savedInstanceState) {
//
//        super.onSaveInstanceState(savedInstanceState);
//        savedInstanceState.putString("Orientation",)
//    }
    public void onConfigurationChanged(Configuration newConfig) { //code used from https://developer.android.com/guide/topics/resources/runtime-changes
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        last=newConfig;
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
            last.orientation=Configuration.ORIENTATION_LANDSCAPE;

        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
            last.orientation=Configuration.ORIENTATION_PORTRAIT;
        }
    }
//    public void onRestoreInstanceState(Bundle savedInstanceState) {
//        setRequestedOrientation(last.orientation);
//    }
}
