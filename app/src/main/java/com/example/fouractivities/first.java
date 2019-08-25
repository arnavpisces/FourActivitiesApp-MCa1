package com.example.fouractivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class first extends AppCompatActivity {
    EditText disp;
    TextView displayer;
    private static final int SHORT_DELAY = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Intent intent = getIntent();
    }
    public void pressHere(View view){
        //Creating a toast
        Context context = getApplicationContext();
        CharSequence text="let the sArCaSm flow...";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        disp   = (EditText)findViewById(R.id.textEnt);
        String value = disp.getText().toString();
        String converted="";
        for(int i=0;i<value.length();i++){
            if(i%2==0){
                converted+=Character.toLowerCase(value.charAt(i));
            }
            else{
                converted+=Character.toUpperCase(value.charAt(i));
            }
        }
        displayer=(TextView)findViewById(R.id.display);
        displayer.setText(converted);
    }

    public void clear(View view){
        disp   = (EditText)findViewById(R.id.textEnt);
        disp.setText("");
    }
}
