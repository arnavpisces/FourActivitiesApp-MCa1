package com.example.fouractivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class third extends AppCompatActivity {
    TextView displayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }
    public void dice(View view){
        displayer=(TextView)findViewById(R.id.dice);
        Random rand=new Random();
        int max=6;
        int min=1;
        int rand1=rand.nextInt(max-min+1)+min;
        String value=String.valueOf(rand1);
        displayer.setText(value);
    }
}
