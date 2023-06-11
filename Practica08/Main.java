package com.company;

public class Main {

    public static void main(String[] args) {

        Torneo T = new Torneo();
        int x;
        boolean hayEntradas = false;

        do {

            System.out.println("\n\n\n-------------------------------Práctica 8--------------------------------------------");

            System.out.println("    Menu: \n");
            System.out.println("    [1] Introducir datos. \n");
            System.out.println("    [2] Mostrar datos. \n");
            System.out.println("    [0] Salir. \n");
            x = CapturaEntrada.capturarEntero("    Introduzca la opción deseada: ");

            if (x == 1) {
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("    Ingrese los datos del torneo:\n");
                T.setNombreTorneo(CapturaEntrada.capturarString("    Nombre del torneo: "));
                T.setRegion(CapturaEntrada.capturarString("    Región: "));
                T.setNumEquipos(CapturaEntrada.capturarEntero("    Cantidad de equipos: "));
                T.setPartidosJugados(CapturaEntrada.capturarEntero("    Partidos jugados: "));
                T.setPartidosPendientes(CapturaEntrada.capturarEntero("    Partidos pendientes: "));
                T.datosEquipos(T.getNumEquipos());
                hayEntradas = true;
            } else if (x == 2 && hayEntradas == true) {
                System.out.println("---------------------------------------------------------------------------------------\n");
                System.out.println("\n    Datos del torneo:");
                System.out.println("\n    Nombre del torneo: " + T.getNombreTorneo());
                System.out.println("\n    Región: " + T.getRegion());
                System.out.println("\n    Equipos participantes: " + T.getNumEquipos());
                System.out.println("\n    Equipos participantes: " + T.getNumEquipos());
                System.out.println("\n    Partidos Jugados: " + T.getPartidosJugados());
                System.out.println("\n    Partidos pendientes: " + T.getPartidosPendientes());
                T.mostrarDatosEquipos();
            } else if (x == 2 && hayEntradas == false) {
                System.out.println("    No hay ningun dato introducido. \n");
            } else if (x == 0) {
                System.out.println("    Hasta luego. \n");
            } else {
                System.out.println("    Opción no valida. \n");
            }
        }while(x!=0);
    }
}