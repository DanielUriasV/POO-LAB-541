package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args){

        System.out.println("--------------------------------------Practica 9-------------------------------------");

        Lectura Archivo = new Lectura("C:\\Users\\Daniel\\Documents\\Codigos\\Practica9\\src\\com\\company\\practica9.csv");
        Alumno A1 = new Alumno("Urias Vega Juan Daniel", "1267333", 1);
        Alumno A2 = new Alumno("Escudero Valdez Michelle Anette", "1267334", 2);
        Alumno A3 = new Alumno("Mi perro Nick", "1267335", 3);

        Archivo.calificaciones(A1, A2, A3);
        A1.calcularPromedio();
        A2.calcularPromedio();
        A3.calcularPromedio();

        A1.mostrarDatos();
        A2.mostrarDatos();
        A3.mostrarDatos();

        try {
            File nuevoArchivo = new File("Calificaciones.txt");
            FileWriter escribirArchivo = new FileWriter(nuevoArchivo);
            PrintWriter imprimirArchivo = new PrintWriter(escribirArchivo);

            imprimirArchivo.println(A1.imprimirDatos());
            imprimirArchivo.println(A2.imprimirDatos());
            imprimirArchivo.println(A3.imprimirDatos());
            imprimirArchivo.close();

            System.out.println("    Archivo creado exitosamente.");
        }
        catch (IOException e){
            System.out.println("    Error al crear el archivo.");
        }
    }
}
