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
        setContentView(R.layout.menuinicio);
        botonSalir=(Button) findViewById(R.id.BotonSalir);
    }
    private void FuncionTestSalir(View view){ //BORRAR EN EL FUTURO
        botonSalir.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });
    }

}


