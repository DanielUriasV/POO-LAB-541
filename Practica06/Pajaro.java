package com.company;

public class Pajaro extends Animal{

    public Pajaro(String nombre, String sexo, int edad){
        super(nombre, sexo, edad);
    }

    public void mostarNombre(int i){
        System.out.println("    ["+(i+1)+"] "+getNombre()+ " el pajaro. ");
    }

    public void comida(){
        System.out.print("semillas.");
    }

}
