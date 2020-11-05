package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainJuego extends AppCompatActivity {
    TextView contador;
<<<<<<< HEAD
    boolean hasGanado=false;
=======
    long tiempRest;
    int casoconcreto;

>>>>>>> MenuPP
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantallajuego);
        if (savedInstanceState !=null){
            tiempRest=savedInstanceState.getLong("segundos");
            casoconcreto= savedInstanceState.getInt("caso");
            aleatorio(casoconcreto);
            cuentaatras(tiempRest);
        }
        else {
            aleatorio();
            cuentaatras();
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putLong("segundos",tiempRest);
        outState.putInt("caso",casoconcreto);
    }


    public void aleatorio(){
        //Código temporal. Inicializamos todas la imágenes
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
        casoconcreto=num;
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

        switch (view.getId()){   //cambia al pesonaje en la casilla marcada
            case R.id.imag11:
                ImageView imagen11 = (ImageView) findViewById(R.id.imag11);
                imagen11.setImageResource(R.drawable.e);    //cambia la imagen con la de la mascarilla
                contador.setText("Has encontrado al negacionista!!");   //Escribe en contador
                //startActivity(new Intent(MainJuego.this, PantallaVictoria.class));
                hasGanado=true;
                break;
            case R.id.imag21:
                ImageView imagen21 = (ImageView) findViewById(R.id.imag21);
                imagen21.setImageResource(R.drawable.e);
                contador.setText("Has encontrado al negacionista!!");
                //startActivity(new Intent(MainJuego.this, PantallaVictoria.class));
                hasGanado=true;
                break;
            case R.id.imag31:
                ImageView imagen31 = (ImageView) findViewById(R.id.imag31);
                imagen31.setImageResource(R.drawable.e);
                contador.setText("Has encontrado al negacionista!!");
                //startActivity(new Intent(MainJuego.this, PantallaVictoria.class));
                hasGanado=true;
                break;
            case R.id.imag41:
                ImageView imagen41 = (ImageView) findViewById(R.id.imag41);
                imagen41.setImageResource(R.drawable.e);
                contador.setText("Has encontrado al negacionista!!");
                //startActivity(new Intent(MainJuego.this, PantallaVictoria.class));
                hasGanado=true;
                break;

        }

    }
    //public void haGanado (boolean hasGanado) {
        //if (hasGanado == false) {
           // startActivity(new Intent(MainJuego.this, PantallaDerrota.class));
       // }
   // }


    public void FuncionIrOpcionesJuego(View view) {
        ImageButton imageButton2 = (ImageButton) findViewById(R.id. imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainJuego.this, MenuPausa.class));
            }
        });
    }

    public void cuentaatras() {
        //Se trata de un contador simple si se termina el tiempo se acaba el juego
        contador = findViewById(R.id.cuentaAtras);
        final long duracionTotal= 20 * 1000; //milisegundos
        final long tiempoEntreTicks= 1000; //un segundo
        new CountDownTimer(duracionTotal, tiempoEntreTicks) {
            public void onTick(long milisegHastaFin) {
                long segRest = (milisegHastaFin) /1000;
                tiempRest=segRest;
                contador.setText("Quedan: "+String.valueOf(segRest)+" segundos!!!");
            }

            public void onFinish() {
                contador.setText("Has perdido!!");
                //Te mostraría una pantalla que pone has perdido, con la opción de volver a jugar o salir de la app
            }
        }.start();
    }

    public void aleatorio(Integer caso){
        //Código temporal. Inicializamos todas la imágenes
        ImageView imagen11 =  findViewById(R.id.imag11);    //Infectado posicion 1
        ImageView imagen12 =  findViewById(R.id.imag12);    //Mascarilla bien puesta posicion 1
        ImageView imagen21 =  findViewById(R.id.imag21);    //Infectado posicion 2
        ImageView imagen22 =  findViewById(R.id.imag22);    //Mascarilla bien puesta posicion 2
        ImageView imagen31 =  findViewById(R.id.imag31);    //Infectado posicion 3
        ImageView imagen32 =  findViewById(R.id.imag32);    //Mascarilla bien puesta posicion 3
        ImageView imagen41 =  findViewById(R.id.imag41);    //Infectado posicion 4
        ImageView imagen42 =  findViewById(R.id.imag42);    //Mascarilla bien puesta posicion 4

        casoconcreto=caso;

        switch (caso){
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
    public void cuentaatras(Long tiemp) {
        //Se trata de un contador simple si se termina el tiempo se acaba el juego
        contador = findViewById(R.id.cuentaAtras);
        final long duracionTotal= tiemp * 1000; //milisegundos
        final long tiempoEntreTicks= 1000; //un segundo
        new CountDownTimer(duracionTotal, tiempoEntreTicks) {
            public void onTick(long milisegHastaFin) {
                long segRest = (milisegHastaFin) /1000;
                tiempRest=segRest;
                contador.setText("Quedan: "+String.valueOf(segRest)+" segundos!!!");
            }

            public void onFinish() {
                contador.setText("Has perdido!!");
                //Te mostraría una pantalla que pone has perdido, con la opción de volver a jugar o salir de la app
            }
        }.start();
    }

}
