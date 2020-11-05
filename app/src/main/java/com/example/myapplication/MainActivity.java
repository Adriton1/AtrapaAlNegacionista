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
    public void aleatorio(){
        ImageView imagen11 =  findViewById(R.id.imag11);    //Infectado posicion 1
        ImageView imagen12 =  findViewById(R.id.imag12);    //Mascarilla bien puesta posicion 1
        ImageView imagen21 =  findViewById(R.id.imag21);    //Infectado posicion 2
        ImageView imagen22 =  findViewById(R.id.imag22);    //Mascarilla bien puesta posicion 2
        ImageView imagen31 =  findViewById(R.id.imag31);    //Infectado posicion 3
        ImageView imagen32 =  findViewById(R.id.imag32);    //Mascarilla bien puesta posicion 3
        ImageView imagen41 =  findViewById(R.id.imag41);    //Infectado posicion 4
        ImageView imagen42 =  findViewById(R.id.imag42);    //Mascarilla bien puesta posicion 4

        Random random= new Random();
        int num= random.nextInt(4);
        switch (num){
            case 0:
                imagen11.setVisibility(View.VISIBLE);
                imagen22.setVisibility(View.VISIBLE);
                imagen32.setVisibility(View.VISIBLE);
                imagen42.setVisibility(View.VISIBLE);
                break;
            case 1:
                imagen12.setVisibility(View.VISIBLE);
                imagen21.setVisibility(View.VISIBLE);
                imagen32.setVisibility(View.VISIBLE);
                imagen42.setVisibility(View.VISIBLE);
                break;
            case 2:
                imagen12.setVisibility(View.VISIBLE);
                imagen22.setVisibility(View.VISIBLE);
                imagen31.setVisibility(View.VISIBLE);
                imagen42.setVisibility(View.VISIBLE);
                break;
            case 3:
                imagen12.setVisibility(View.VISIBLE);
                imagen22.setVisibility(View.VISIBLE);
                imagen32.setVisibility(View.VISIBLE);
                imagen41.setVisibility(View.VISIBLE);
                break;
        }

    }
    public void onClick(View view){

        switch (view.getId()){
            case R.id.imag11:
                ImageView imagen11 = (ImageView) findViewById(R.id.imag11);
                imagen11.setImageResource(R.drawable.e);
                contador.setText("Has encontrado al negacionista!!");
                break;
            case R.id.imag21:
                ImageView imagen21 = (ImageView) findViewById(R.id.imag21);
                imagen21.setImageResource(R.drawable.e);
                contador.setText("Has encontrado al negacionista!!");
                break;
            case R.id.imag31:
                ImageView imagen31 = (ImageView) findViewById(R.id.imag31);
                imagen31.setImageResource(R.drawable.e);
                contador.setText("Has encontrado al negacionista!!");

                break;
            case R.id.imag41:
                ImageView imagen41 = (ImageView) findViewById(R.id.imag41);
                imagen41.setImageResource(R.drawable.e);
                contador.setText("Has encontrado al negacionista!!");
                break;

        }
    }
    public void cuentaatras() {
        contador = findViewById(R.id.cuentaAtras);
        final long duracionTotal= 20 * 1000; //milisegundos
        final long tiempoEntreTicks= 1000; //un segundo
        new CountDownTimer(duracionTotal, tiempoEntreTicks) {
            public void onTick(long milisegHastaFin) {
                long segRest = (milisegHastaFin) /1000;
                contador.setText("Quedan: "+String.valueOf(segRest)+" segundos!!!");
            }

            public void onFinish() {
                contador.setText("Has perdido!!");
                //Te mostraría una pantalla que pone has perdido, con la opción de volver a jugar o salir de la app
            }
        }.start();
    }
}


