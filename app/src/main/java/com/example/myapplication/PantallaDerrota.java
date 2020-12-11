package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PantallaDerrota extends AppCompatActivity {
    Button volver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_derrota);
        volver=(Button) findViewById(R.id.volverPerdido);
    }
    public void FuncionVolverMenuPrincipal(View view){
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PantallaDerrota.this, MainActivity.class));
            }
        });
    }
}