package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

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

public class MainActivity extends AppCompatActivity {
    Button botonJugar,botonOpciones,botonSalir;
    TextView contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuinicio);
        botonSalir=(Button) findViewById(R.id.BotonSalir);
        botonJugar=(Button) findViewById(R.id.BotonJugar);
        botonOpciones=(Button) findViewById(R.id.BotonOpciones);
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
                finish();
                System.exit(0);
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


