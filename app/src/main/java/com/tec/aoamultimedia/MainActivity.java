package com.tec.aoamultimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
    }

    private void initComponents(){
        Button catButton    = findViewById(R.id.catMainButton);
        Button lionButton   = findViewById(R.id.lionMainButton);

        catButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp  = MediaPlayer.create(getApplicationContext(),R.raw.gato);
                mp.start();

            }
        });

        lionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp  = MediaPlayer.create(getApplicationContext(),R.raw.leon);
                mp.start();
            }
        });
    }
}
