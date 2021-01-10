package com.example.myapplication;


import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PuntuacionDB {
    private int puntuacionReciente;

    public int getPuntuacionReciente() {
        return puntuacionReciente;
    }

    public void setPuntuacionReciente(int puntuacionReciente) {
        this.puntuacionReciente = puntuacionReciente;
    }

}
