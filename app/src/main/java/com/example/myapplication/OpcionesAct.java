package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import org.jetbrains.annotations.NotNull;




public class OpcionesAct extends AppCompatActivity  {
    ImageButton cruz;
    Button guardar, volverAlMenu,musica;
    public static boolean encendida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuopciones);

        cruz= (ImageButton) findViewById(R.id.cruz);
        guardar=(Button) findViewById(R.id.guardar);
        volverAlMenu=(Button) findViewById(R.id.volverAlMenu);
        musica=(Button) findViewById(R.id.botonMusica);
        if (savedInstanceState ==null){
                encendida=true;
        }
        else{
            encendida=savedInstanceState.getBoolean("estado");
        }


    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean("estado",encendida);
    }

    public void FuncionesMusica(View view) {
        musica = (Button) findViewById(R.id.botonMusica);

        musica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (encendida) {
                    apagaMusica();
                } else {
                    enciendeMusica();
                }
            }
        });
    }
    public void enciendeMusica (){

        Intent  mpI = new Intent(this, ServicioMusica.class);

        this.startService(mpI);

        encendida = !encendida;
    }

    public void apagaMusica(){
        Intent  mpI = new Intent(this, ServicioMusica.class);

        this.stopService(mpI);

        encendida = !encendida;
    }


//fin servicio


/* esta es version sin servicio vss
    public void playpause(View view){

        play_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()){
                    mp.pause();
                    Toast.makeText(OpcionesAct.this, "Pausa" , Toast.LENGTH_SHORT).show();   
                }else{
                    mp.start();
                    Toast.makeText(OpcionesAct.this, "Play" , Toast.LENGTH_SHORT).show();
                }
            }
        });
    }*/

    public void volverAlmenu(View view){
        volverAlMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    public void guardar(View view){
        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    public void quitarMenu(View view){
        cruz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


}

