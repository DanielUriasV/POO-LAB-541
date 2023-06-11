package com.company;

public class Torneo {

    private String nombreTorneo, region;
    private int numEquipos, partidosJugados, partidosPendientes;
    private Equipo[] E;

    public void datosEquipos(int numEquipos){

        E = new Equipo[numEquipos];

        for(int i = 0 ; i < E.length ; i++){
            System.out.println("    Introduzca los datos del equipo "+(i+1)+": ");

            E[i] = new Equipo();
            E[i].setNombreEquipo(CapturaEntrada.capturarString("    Nombre del Equipo: "));
            E[i].setDivision(CapturaEntrada.capturarString("    División del equipo: "));
            E[i].setNombreEntrenador(CapturaEntrada.capturarString("    Nombre del entrenador: "));
            E[i].setTorneosParticipacion(CapturaEntrada.capturarEntero("    Cantidad de torneos participados: "));
            E[i].setTorneosGanados(CapturaEntrada.capturarEntero("    Cantidad de torneos ganados: "));
            E[i].setTorneosPerdidos();
            E[i].setNumJugadores(CapturaEntrada.capturarEntero("    Número de jugadores en el equipo: "));
            E[i].datosJugador(E[i].getNumJugadores());

        }
    }

    public void mostrarDatosEquipos(){
        System.out.println("---------------------------------Lista de Equipos-------------------------------------");
        for(int i=0; i<E.length; i++){
            System.out.println("\n    Nombre del equipo: "+E[i].getNombreEquipo());
            System.out.println("\n    División "+E[i].getDivision());
            System.out.println("\n    Entrenador:  "+E[i].getNombreEntrenador());
            System.out.println("\n    Torneos participados:  "+E[i].getTorneosParticipacion());
            System.out.println("\n    Torneos participados:  "+E[i].getTorneosGanados());
            System.out.println("\n    Torneos participados:  "+E[i].getTorneosPerdidos());
            E[i].mostrarDatosJugador();
        }
    }


    //Gets
    public int getNumEquipos() {
        return numEquipos;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public int getPartidosPendientes() {
        return partidosPendientes;
    }

    public String getNombreTorneo() {
        return nombreTorneo;
    }

    public String getRegion() {
        return region;
    }

    //Sets
    public void setNombreTorneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }

    public void setNumEquipos(int numEquipos) {
        this.numEquipos = numEquipos;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public void setPartidosPendientes(int partidosPendientes) {
        this.partidosPendientes = partidosPendientes;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}

