package com.company;

public class Tigre extends Animal {

    public Tigre(String nombre, String sexo, int edad){
        super(nombre, sexo, edad);
    }

    public void mostarNombre(int i){
        System.out.println("    ["+(i+1)+"] "+getNombre()+ " el tigre. ");
    }

    public void comida(){
        System.out.print("carne.");
    }

}

