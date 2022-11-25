package com.example.leyendagrupo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.telecom.Call;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button btnGrupos, btnOrden, btnComprobar;
    private TextView txtleyenda;
    private ElementoLista[] arrElemento;
    private String[] palabras={"barro", "puente", "peces"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGrupos=findViewById(R.id.zona3_btnGrupos);
        btnOrden=findViewById(R.id.zona3_btnOrden);
        btnComprobar=findViewById(R.id.zona3_btnComprobar);
        txtleyenda=findViewById(R.id.zona3_txtLeyenda);

        String[] alumnos={"Pepe","Juan","Iker","Emma","Miguel","Airam","Alayn","Xavi","Xabi","Javi","Pablo","Maria"};
        int cantGrupos = alumnos.length/3;
        if (alumnos.length%3!=0) {
            cantGrupos++;
        }

        for (int i = 0; i < cantGrupos; i++) {
                                                     
        }
        ArrayList<String> grupo;
        int p = (int) (Math.random()*3+1);
        for (int i = 0; i < alumnos.length; i++) {

        }
        arrElemento=new ElementoLista[][] { new ElementoLista[]( )},

        };
        //************************ COSAS LISTA ********************************
        //Adaptador
//        AdaptadorCliente adapt =
//                new AdaptadorCliente(this, arrClientes);
//        list.setAdapter(adapt);
//        showLoginInicio();
//        btnSalir.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                showCerrar();
//            }
//        });





//        txtleyenda.onTouchEvent(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                return false;
//            }
//        });

        btnComprobar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int espacios=0;
                for (int e = 0; e < txtleyenda.length(); e++) {
                    if(txtleyenda.getText().charAt(e)==' '){
                        espacios++;
                    }
                }
                int contEsta=0;
                for (int i = 0; i < palabras.length; i++) {
                    if(txtleyenda.getText().toString().contains(palabras[i])){
                        contEsta++;
                    }
                }


                btnGrupos.setText(espacios+"------"+contEsta);
                if(espacios<29 || contEsta!=3 || espacios>39){
                    String errores ="";
                    if (contEsta!=3){
                        errores+="La leyenda debe contener las palabras: barro, puente y peces \n\n";
                    }
                    if (espacios<29 || espacios>39){
                        errores+="La leyenda debe contener entre 30 y 40 palabras";
                    }
                    txtleyenda.setBackgroundResource(R.drawable.bordes_edittext_mal);
                    btnOrden.setEnabled(false);
                    Toast.makeText(MainActivity.this,errores, Toast.LENGTH_LONG).show();
                }else{
                    txtleyenda.setBackgroundResource(R.drawable.bordes_edittext_bien);
                    btnOrden.setEnabled(true);
                }

            }
        });








    }
    class AdaptadorElemento extends ArrayAdapter<ElementoLista> {
        public AdaptadorElemento(@NonNull Context context, String[] Clientes) {
            super(context, R.layout.list_item, Clientes);
        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView,
                            @NonNull ViewGroup parent) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            View item = inflater.inflate(R.layout.list_item, null);
            TextView nombre = (TextView)item.findViewById(R.id.lblnombreApe);
            nombre.setText(arrClientes[position].getNombreApe());
            TextView deuda = (TextView)item.findViewById(R.id.lblDeuda);
            deuda.setText("Deuda: "+arrClientes[position].getSuperficie()+"€");

            return (item);
        }
    }

}