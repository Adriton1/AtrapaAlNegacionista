package com.example.myapplication;


import java.util.ArrayList;


class ParPuntuacion implements Comparable{
    private int puntos;

    public ParPuntuacion(int puntos){
        this.puntos=puntos;
    }
    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public int compareTo(Object o) {
        int comparePts=((ParPuntuacion)o).getPuntos();
        return 1-(this.puntos-comparePts);
    }
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
