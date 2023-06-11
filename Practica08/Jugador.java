package com.company;

public class Jugador {

    private String nombre, posicion;
    private int numUniforme, puntosAnotados;
    private float estatura;


    //Gets

    public String getNombre(){
        return nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public float getEstatura() {
        return estatura;
    }

    public int getNumUniforme() {
        return numUniforme;
    }

    public int getPuntosAnotados() {
        return puntosAnotados;
    }

    //Sets

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public void setNumUniforme(int numUniforme) {
        this.numUniforme = numUniforme;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setPuntosAnotados(int puntosAnotados) {
        this.puntosAnotados = puntosAnotados;
    }

}
