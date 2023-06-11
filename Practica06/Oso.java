package com.company;

public class Oso extends Animal{

    public Oso(String nombre, String sexo, int edad){
        super(nombre, sexo, edad);
    }

    public void mostarNombre(int i){
        System.out.println("    ["+(i+1)+"] "+ getNombre()+ " el oso. ");
    }

    public void comida(){
        System.out.print("carne.");
    }

}
