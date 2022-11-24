package com.example.leyendagrupo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnGrupos, btnOrden;
    private TextView txtleyenda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGrupos=findViewById(R.id.zona3_btnGrupos);
        btnOrden=findViewById(R.id.zona3_btnOrden);
        txtleyenda=findViewById(R.id.zona3_txtLeyenda);


        txtleyenda.setOnKeyListener(newialogInterface.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                int espacios=0;
                for (int e = 0; e < txtleyenda.length(); e++) {
                    if(txtleyenda.getText().charAt(e)==' '){
                        espacios++;
                    }
                }
                btnGrupos.setText(espacios+"");
                if(espacios<29){
                    txtleyenda.setBackgroundResource(R.drawable.bordes_edittext_mal);
                }else{
                    txtleyenda.setBackgroundResource(R.drawable.bordes_edittext_bien);
                }

                return false;
            }
        });


        //HOLA QUE TAL







    }
}