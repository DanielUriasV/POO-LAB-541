package com.company;

public class Main {

    public static void main (String [] args){

        Red P1 = new Red("Rojo", "Mediano", "");
        Blues P2 = new Blues("Azul", "Pequeño", "");
        Chuck P3 = new Chuck("Amarillo", "Mediano", "");
        Pajaro[] PE = new Pajaro[]{new Pajaro("Blanco", "Grande", "Suelta un huevo que impacta contra las cosas. "), new Pajaro("Negro", "Grande", "Explota."), new Pajaro("Rojo", "Gigante", "No hace nada especial.")};

        System.out.println("---------------------------------Practica 4-------------------------------- \n");

        System.out.println("\n    Red:");
        System.out.println("    Color: " + P1.color);
        System.out.println("    Tamaño: " + P1.tamaño);
        System.out.print("    Habilidad: ");
        P1.Habilidad();

        System.out.println("\n    Blues:");
        System.out.println("    Color: " + P2.color);
        System.out.println("    Tamaño: " + P2.tamaño);
        System.out.print("    Habilidad: ");
        P2.Habilidad();

        System.out.println("\n    Chuck:");
        System.out.println("    Color: " + P3.color);
        System.out.println("    Tamaño: " + P3.tamaño);
        System.out.print("    Habilidad: ");
        P3.Habilidad();

        System.out.println("\n    Matilda:");
        System.out.println("    Color: " + PE[0].color);
        System.out.println("    Tamaño: " + PE[0].tamaño);
        System.out.print("    Habilidad: " + PE[0].habilidad);

        System.out.println("\n\n    Bomb:");
        System.out.println("    Color: " + PE[1].color);
        System.out.println("    Tamaño: " + PE[1].tamaño);
        System.out.print("    Habilidad: " + PE[1].habilidad);

        System.out.println("\n\n    Tenrence:");
        System.out.println("    Color: " + PE[2].color);
        System.out.println("    Tamaño: " + PE[2].tamaño);
        System.out.print("    Habilidad: " + PE[2].habilidad);

        System.out.println("\n\n");
    }
}

