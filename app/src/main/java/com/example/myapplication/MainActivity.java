package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

import static com.example.myapplication.OpcionesAct.encendida;

public class MainActivity extends AppCompatActivity {
    Button botonJugar,botonOpciones,botonSalir;
    TextView contador;
    public Integer inicio=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuinicio);
        botonSalir=(Button) findViewById(R.id.BotonSalir);
        botonJugar=(Button) findViewById(R.id.BotonJugar);
        botonOpciones=(Button) findViewById(R.id.BotonOpciones);
        //Si es la primera vez que se inicia el programa se inicia con la musica
        if(inicio==0) {
            Intent mpI = new Intent(this, ServicioMusica.class);
            this.startService(mpI);
            inicio=inicio+1;
        }

    }



    public void FuncionMenuOpciones(View view){
        botonOpciones.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,OpcionesAct.class));
            }
        });
    }
    public void FuncionTestSalir(View view){ //BORRAR EN EL FUTURO
        botonSalir.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //Cierra la app
                finishAffinity();
            }
        });
    }
    public void FuncionEmpezarJuego(View view){
        botonJugar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MainJuego.class));
            }
        });
    }



}


