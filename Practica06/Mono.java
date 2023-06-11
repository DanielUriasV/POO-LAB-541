package com.company;

public class Mono extends Animal{

    public Mono(String nombre, String sexo, int edad){
        super(nombre, sexo, edad);
    }

    public void mostarNombre(int i){
        System.out.println("    ["+(i+1)+"] "+getNombre()+ " el mono. ");
    }

    public void comida(){
        System.out.print("frutas.");
    }

}
