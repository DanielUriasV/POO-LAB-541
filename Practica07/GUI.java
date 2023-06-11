package com.company;

public abstract class GUI {
    int bateria;
    String id, nombre, ultimaAccion;

    public GUI(int bateria, String id, String nombre, String ultimaAccion){
        this.bateria = bateria;
        this.id = id;
        this.nombre = nombre;
        this.ultimaAccion = ultimaAccion;
    }

    public abstract void informacion();

}
