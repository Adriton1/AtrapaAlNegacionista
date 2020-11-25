package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class OpcionesAct extends AppCompatActivity {
    ImageButton cruz;
    Button guardar, volverAlMenu;


    Button play_pause;
    MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuopciones);
        cruz= (ImageButton) findViewById(R.id.cruz);
        guardar=(Button) findViewById(R.id.guardar);
        volverAlMenu=(Button) findViewById(R.id.volverAlMenu);
        //prueba rama menupp

        play_pause=(Button)findViewById(R.id.play_pause); //crear el boton en opciones y ponerle ese id

        mp = MediaPlayer.create(this,R.raw.musicajuego);  //esta va al  iniciar la aplicacion



    }


      public void playpause(View view){

          play_pause.setOnClickListener(new View.OnClickListener() { //esto va fuera
                @Override
                public void onClick(View v) {
                    if(mp.isPlaying()){
                        mp.pause();
                        Toast.makeText(OpcionesAct.this, "Pausa" , Toast.LENGTH_SHORT).show();   //mirar xq esto es un mensaje  en popup y el main creo que habria que quitarlo
                    }else{
                        mp.start();
                        Toast.makeText(OpcionesAct.this, "Play" , Toast.LENGTH_SHORT).show();
                   }
                }
           });
     }


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