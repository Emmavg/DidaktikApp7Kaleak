package com.example.didaktikapp_zazpikaleak;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Zona1_5 extends AppCompatActivity {

    ImageView fotoAntigua;
    TextView pista;
    MediaPlayer audio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zona1_5);

        fotoAntigua = findViewById(R.id.imgZona1_5_Foto);
        pista = findViewById(R.id.txtZona1_5_Hint);

        //Audio Narrador
        audio = MediaPlayer.create(Zona1_5.this, R.raw.audio_zona1_5);
        audio.start();

        fotoAntigua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               pista.setVisibility(View.VISIBLE);
            }
        });


    }
}