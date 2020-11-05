package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuPausa extends AppCompatActivity {
    Button reanudar,opciones,salir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reanudar=(Button) findViewById(R.id.button);
        opciones=(Button) findViewById(R.id.button2);
        salir=(Button) findViewById(R.id.button3);
    }
    public void ReanudarJuego(View view){
        reanudar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    public void CambiarAOpciones(View view){
        opciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //LLEVAR A MENU OPCIONES
                startActivity(new Intent(MenuPausa.this,OpcionesAct.class));
            }
        });
    }
    public void SalirDelJuego(View view){
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //AQUI PONER PRIMERO UNA PANTALLITA DE CONFIRMACIÓN, Y SI LE DAS QUE SI, SALES AL MENU PRINCIPAL
                startActivity(new Intent(MenuPausa.this,MainActivity.class));
            }
        });
    }
}