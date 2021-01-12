package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.json.*;

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
        TextView view = (TextView) findViewById(R.id.TimeOutView);
        Context context=getApplicationContext();
        String fileName="json.txt";
        try {
            JSONObject obj= new JSONObject(getJSONLine(context,fileName));
            ChangePunct(obj,view);
        } catch (JSONException e) {
            e.printStackTrace();
            return;
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

    }
    public void ChangePunct(JSONObject object, TextView thetext){
        try {
            puntuacionFinal= Integer.parseInt(object.getString("puntuacionReciente"));
            thetext.setText(puntuacionFinal);
        } catch (JSONException e) {
            e.printStackTrace();
            return;
        }
    }
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