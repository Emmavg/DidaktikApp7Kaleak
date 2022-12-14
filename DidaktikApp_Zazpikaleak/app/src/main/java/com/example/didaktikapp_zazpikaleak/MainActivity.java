package com.example.didaktikapp_zazpikaleak;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView titulo;
    Button empezar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Generamos la conexion de la BBDD

        //Abrimos la base de datos "DBUsuarios" en modo de escritura
        UsuariosSQLiteHelper zazpidbh = new UsuariosSQLiteHelper(this, "DBZazpikaleak", null, 1);
        SQLiteDatabase db = zazpidbh.getWritableDatabase();

        titulo = findViewById(R.id.inicial_txt);
        empezar = findViewById(R.id.btnZona1_Empezar);

        empezar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Zona1_1.class);
                startActivity(i);
            }
        });

        titulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Desarrollador.class);
                startActivity(i);
            }
        });
    }
}
