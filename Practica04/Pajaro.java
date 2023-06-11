package com.company;

public class Pajaro {

    String color, tamaño, habilidad;

    public Pajaro(String color, String tamaño, String habilidad){
        this.color = color;
        this.tamaño = tamaño;
        this.habilidad = habilidad;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String getTamaño(String tamaño){
        return tamaño;
    }

    public String getColor(String color){
        return color;
    }

    public String getHabilidad() {
        return habilidad;
    }
}
