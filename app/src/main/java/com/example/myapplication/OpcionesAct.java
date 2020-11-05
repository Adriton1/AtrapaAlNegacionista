package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class OpcionesAct extends AppCompatActivity {
    ImageButton cruz;
    Button guardar, volverAlMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuopciones);
        cruz= (ImageButton) findViewById(R.id.cruz);
        guardar=(Button) findViewById(R.id.guardar);
        volverAlMenu=(Button) findViewById(R.id.volverAlMenu);
        //prueba rama menupp
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