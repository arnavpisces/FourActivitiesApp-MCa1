package com.example.fouractivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final  String myTAG = "NUM_RESUME";
    public static int counter=0;
    public String resumeTime="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState!=null) {
            int numTimes = savedInstanceState.getInt(resumeTime);
//            Toast.makeText(this, "Orientation Changed: " + (numTimes), Toast.LENGTH_SHORT).show();
        }
        Log.d(myTAG, "OnCreate being called: "+ counter);
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
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        // Save the user's current game state
        savedInstanceState.putInt(resumeTime, counter++);
        Toast.makeText(this, "State Changed: " + counter, Toast.LENGTH_SHORT).show();
        // Always call the superclass so it can save the view hierarchy state
        Log.d(myTAG, "Inside onSaveInstance: "+ counter);

    }
//    public void onConfigurationChanged(Configuration newConfig) { //code used from https://developer.android.com/guide/topics/resources/runtime-changes
//        super.onConfigurationChanged(newConfig);
//
//        // Checks the orientation of the screen
//        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
//            Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
//
//        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
//            Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
//        }
//    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }
}
