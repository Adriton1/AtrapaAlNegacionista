package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainJuego extends AppCompatActivity {
    TextView contador;
    boolean hasGanado=false;
    long tiempRest;
    int casoconcreto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantallajuego);
        ArrayList<ImageView> personas=new ArrayList<>();
        GridLayout miGrid= (GridLayout) findViewById(R.id.Grid);
        int count=miGrid.getChildCount();
        int id,number,badSelect;
        Random ran=new Random();
        badSelect=ran.nextInt(7-1)+1;
        for (int i=0;i<count;i++){
            ImageView hijo=(ImageView) miGrid.getChildAt(i);
            number=ran.nextInt(5-1)+1;
            if(i==badSelect){
                hijo.setImageResource(getImage("mal"+number));
                hijo.setTag("PersonaContagiada");
            }
            else {
                hijo.setImageResource(getImage("bien" + number));
                hijo.setTag("Persona");
            }
            personas.add(hijo);
        }

        if (savedInstanceState !=null){
            tiempRest=savedInstanceState.getLong("segundos");
            casoconcreto= savedInstanceState.getInt("caso");
            cuentaatras(tiempRest);
        }
        else {
            cuentaatras((long) 20);
        }
    }
    public int getImage(String imageName){
        int resourceId=this.getResources().getIdentifier(imageName,"drawable", this.getPackageName());
        return resourceId;

    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putLong("segundos",tiempRest);
        outState.putInt("caso",casoconcreto);
    }

    public void onClick(View view){
        int miID=view.getId();
        ImageView laImagen=(ImageView) findViewById(miID);
        if(laImagen.getTag()=="PersonaContagiada"){
            contador.setText("Has encontrado al negacionista!!");
            hasGanado=true;
            haGanado(hasGanado);
        }
        else{

        }

    }
    public void haGanado (boolean hasGanado) {
        if (hasGanado == false) {
            startActivity(new Intent(MainJuego.this, PantallaDerrota.class));
        }
        else{
            startActivity(new Intent(MainJuego.this, PantallaVictoria.class));
        }
    }


    public void FuncionIrOpcionesJuego(View view) {
        ImageButton imageButton2 = (ImageButton) findViewById(R.id. imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainJuego.this, MenuPausa.class));
            }
        });
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
                if(!hasGanado)
                    contador.setText("Quedan: "+String.valueOf(segRest)+" segundos!!!");
            }

            public void onFinish() {
                if(!hasGanado){
                haGanado(hasGanado);
                }
                //Te mostraría una pantalla que pone has perdido, con la opción de volver a jugar o salir de la app
            }
        }.start();
    }

}
