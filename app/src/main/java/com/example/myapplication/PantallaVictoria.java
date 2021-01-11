package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;




public class PantallaVictoria extends AppCompatActivity {
    Button volver;
    int puntuacionFinal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_victoria);
        volver=(Button) findViewById(R.id.volver);

        Context context=getApplicationContext();
        String fileName="json.txt";
        /*try {
            JSONObject obj= new JSONObject(getJSONLine(context,fileName));
            PuntuacionDB puntuacionDB= new PuntuacionDB();
            puntuacionDB.setPuntuacionReciente(obj.getInt("puntuacionReciente"));
            puntuacionFinal=puntuacionDB.getPuntuacionReciente();

        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }*/
        TextView view = (TextView) findViewById(R.id.TimeOutView);
        try {
            view.setText(getJSONLine(context,fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //TODAVÍA NO FUNCIONA
    public String getJSONLine(Context context, String name) throws IOException {
        File f = new File(context.getFilesDir(),name);
        FileReader fis= new FileReader(f);
        BufferedReader buffer= new BufferedReader(fis);
        StringBuilder builder= new StringBuilder();
        String line=buffer.readLine();
        while(line!=null){
            builder.append(line).append("\n");
            line=buffer.readLine();
        }
        buffer.close();
        return builder.toString();
    }
    public void FuncionVolverMenuPrincipal(View view){
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PantallaVictoria.this, MainActivity.class));
            }
        });
    }
}