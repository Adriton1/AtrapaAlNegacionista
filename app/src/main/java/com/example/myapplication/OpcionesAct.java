package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import static android.app.PendingIntent.getActivity;

public class OpcionesAct extends AppCompatActivity {
    ImageButton cruz;
    Button guardar, volverAlMenu;
    /*Button play_pause;
    MediaPlayer mp;*/
    public boolean encendida;
    Button play_pause;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuopciones);
        cruz= (ImageButton) findViewById(R.id.cruz);
        guardar=(Button) findViewById(R.id.guardar);
        volverAlMenu=(Button) findViewById(R.id.volverAlMenu);
        //prueba rama menupp

        /*play_pause=(Button)findViewById(R.id.play_pause);

        mp = MediaPlayer.create(this,R.raw.musicajuego);*/

        //de servicios
        encendida=false;
        //fin servicio
    }

    // inicio servicio
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        //Inflate the layout for this fragment

        View fragmento = inflater.inflate(R.layout.menuopciones, container, false);
        //mirar lo de fragmento
        play_pause = (Button)fragmento.findViewById(R.id.play_pause);

        play_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(encendida){
                    apagaMusica();
                }else {
                    enciendeMusica();
                }
            }
        });
        return fragmento;
    }


    public void enciendeMusica(){

        Intent  mpI = new Intent(getActivity(), ServicioMusica.class);

        getActivity().startService(mpI);

        encendida = !encendida;
    }

    public void apagaMusica(){
        Intent  mpI = new Intent(getActivity(), ServicioMusica.class);

        getActivity().stopService(mpI);

        encendida = !encendida;
    }
//fin servicio
/*
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