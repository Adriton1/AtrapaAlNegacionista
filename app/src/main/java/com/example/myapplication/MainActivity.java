package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button botonJugar,botonOpciones,botonSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonSalir=(Button) findViewById(R.id.button3);
        botonSalir.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                CerrarApp(v);
            }
        });
        botonJugar=(Button) findViewById(R.id.button);
        botonJugar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Ejemplo(v);
            }
        });
    }
    public void CerrarApp(View view) {
        MainActivity.this.finish();
        System.exit(0);
    }
    public void Ejemplo(View view) {

    }
}


