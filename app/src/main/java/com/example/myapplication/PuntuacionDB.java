package com.example.myapplication;


import java.util.ArrayList;

class ParPuntuacion{
    public String nombre;
    public int puntos;
}
public class PuntuacionDB {
    private String puntuacionReciente;
    private ArrayList<ParPuntuacion> listaPuntuacionesMejores;

    public String getPuntuacionReciente() {
        return puntuacionReciente;
    }

    public void setPuntuacionReciente(String puntuacionReciente) {
        this.puntuacionReciente = puntuacionReciente;
    }

    public ArrayList<ParPuntuacion> getListaPuntuacionesMejores() {
        return listaPuntuacionesMejores;
    }

    public void setListaPuntuacionesMejores(ArrayList<ParPuntuacion> listaPuntuacionesMejores) {
        this.listaPuntuacionesMejores = listaPuntuacionesMejores;
    }
}
