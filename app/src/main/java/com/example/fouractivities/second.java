package com.example.fouractivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class second extends AppCompatActivity {
    TextView displayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void power(View view){
        displayer   = (TextView)findViewById(R.id.desc);
        String value="";
        switch(view.getId()) {
            case R.id.byak:
                value="The Byakugan gives a near 360 diameter field of vision, with one blind spot at the back of the neck above the first thoracic vertebra. It has a powerful range of vision, able to magnify up to cellular level on its targets or view great distances.";
                break;
            case R.id.rinn:
                value="The Rinnegan grants the wielder a wide range of abilities without any chakra to keep the eyes active. Certain abilities are only available to the original owner of the dōjutsu, but possession of even a single transplanted Rinnegan can grant overwhelming power.";
                break;
            case R.id.shar:
                value="With the Sharingan, the user can see chakra.The user is granted incredible clarity of perception, enabling them to read lips or mimic movements. The user is able to copy almost any jutsu they see, memorising ninjutsu, genjutsu, and taijutsu.";
                break;
        }
        displayer.setText(value);
    }
}
