package com.example.myapplication;


import java.util.ArrayList;

class ParPuntuacion{
    public String nombre;
    public int puntos;
}
public class PuntuacionDB {
    private int puntuacionReciente;
    private ArrayList<ParPuntuacion> listaPuntuacionesMejores;

    public int getPuntuacionReciente() {
        return puntuacionReciente;
    }

    public void setPuntuacionReciente(int puntuacionReciente) {
        this.puntuacionReciente = puntuacionReciente;
    }

    public ArrayList<ParPuntuacion> getListaPuntuacionesMejores() {
        return listaPuntuacionesMejores;
    }

    public void setListaPuntuacionesMejores(ArrayList<ParPuntuacion> listaPuntuacionesMejores) {
        this.listaPuntuacionesMejores = listaPuntuacionesMejores;
    }
}
