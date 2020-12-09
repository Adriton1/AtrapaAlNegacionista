package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class OpcionesAct extends AppCompatActivity {
    ImageButton cruz;
    Button guardar, volverAlMenu, musica;
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
