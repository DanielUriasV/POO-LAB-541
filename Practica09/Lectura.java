package com.company;

import java.io.FileReader;
import java.io.BufferedReader;

public class Lectura {

    BufferedReader lectura;
    String linea;
    String[] datos = null;
    int [] datosInt = new int[21];

    public Lectura(String Archivo){
        LecturaArchivo(Archivo);
        modificarDatos();
    }

    public void LecturaArchivo(String Archivo) {
        try {
            lectura = new BufferedReader(new FileReader(Archivo));
            while ((linea = lectura.readLine()) != null) {
                datos = linea.split(",");
                System.out.print("\n");
            }
            lectura.close();
            linea = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void modificarDatos(){
        datosInt[0] = 67;
        for(int i = 1; i < datos.length; i++){
            datosInt[i] = Integer.parseInt(datos[i]);
        }
    }

    public void calificaciones(Alumno A1, Alumno A2, Alumno A3){
        int x = 0;

        for(int i=0; i < datos.length; i++){
            if (i < 7){
                A1.calificaciones[x] = datosInt[i];
                x++;
            }
            else if(i >= 7 && i < 14){
                if(x == 7) {
                    x = 0;
                }
                A2.calificaciones[x] = datosInt[i];
                x++;
            }
            else if(i >= 14 && i < 21){
                if(x == 7) {
                    x = 0;
                }
                A3.calificaciones[x] = datosInt[i];
                x++;
            }
        }
    }
}
