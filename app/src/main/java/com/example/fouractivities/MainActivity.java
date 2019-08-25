package com.example.fouractivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

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
                break;
        }

        startActivity(intent);
    }
}
