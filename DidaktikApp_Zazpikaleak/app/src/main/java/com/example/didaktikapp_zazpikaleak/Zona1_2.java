package com.example.didaktikapp_zazpikaleak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class Zona1_2 extends AppCompatActivity {

    private Button btnZona1_2_Siguiente;
    private ImageView gif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zona1_2);

        btnZona1_2_Siguiente = findViewById(R.id.btnZona1_2_Siguiente);
        gif = findViewById(R.id.Gif);

        Glide.with(this).load(R.drawable.dingdondgif).into(gif);

        btnZona1_2_Siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Zona1_2.this, Zona1_3.class);
                startActivity(intent);
            }
        });

    }
}