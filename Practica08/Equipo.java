package com.company;

public class Equipo {

    private String nombreEquipo, division, nombreEntrenador;
    private int torneosParticipacion, torneosGanados, torneosPerdidos, NumJugadores;
    private Jugador[] J;

    public void datosJugador(int NumJugadores){
        J = new Jugador[NumJugadores];

        for(int i = 0 ; i < J.length ; i++){
            System.out.println("\n    Introduzca los datos del jugador "+(i+1));
            J[i] = new Jugador();
            J[i].setNombre(CapturaEntrada.capturarString("   Nombre: "));
            J[i].setEstatura(CapturaEntrada.capturarFloat("    Estatura: "));
            J[i].setPosicion(CapturaEntrada.capturarString("    Posición: "));
            int z = 1;
            do {
                J[i].setNumUniforme(CapturaEntrada.capturarEntero("    Número del uniforme: "));
                for(int j = 0; j < i; j++){
                    if(J[i].getNumUniforme()==J[j].getNumUniforme()){
                        System.out.println("\n    Número de jugador ya ocupado. Favor de escoger otro. ");
                        z = 0;
                    }
                }
            }while(z == 0);

            J[i].setPuntosAnotados(CapturaEntrada.capturarEntero("    Puntos anotados: "));
        }
    }

    public void mostrarDatosJugador(){

        System.out.println("---------------------------------Lista de Jugadores-------------------------------------");

        for(int i = 0; 1<J.length; i++){
          System.out.println("\n    Jugador "+(i+1));
          System.out.println("\n    Nombre "+J[i].getNombre());
          System.out.println("\n    Número de uniforme:  "+J[i].getNombre());
        }

        System.out.println("\n    Número de jugadores registrados:  "+J.length);
        System.out.println("\n    Total de puntos anotados: "+puntosAnotadosTotales(J));
    }

    public int puntosAnotadosTotales(Jugador[] J){
        int puntosTotales=0;
        for (int i=0; i<J.length; i++){
            puntosTotales=puntosTotales+J[i].getPuntosAnotados();
        }
        return puntosTotales;
    }

    //Gets
    public int getTorneosGanados() {
        return torneosGanados;
    }

    public int getTorneosParticipacion() {
        return torneosParticipacion;
    }

    public String getDivision() {
        return division;
    }

    public int getTorneosPerdidos() {
        return torneosPerdidos;
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public Jugador[] getJ() {
        return J;
    }

    public int getNumJugadores() {
        return NumJugadores;
    }

    //Sets
    public void setDivision(String division) {
        this.division = division;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    public void setJ(Jugador[] J) {
        this.J = J;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public void setTorneosGanados(int torneosGanados) {
        this.torneosGanados = torneosGanados;
    }

    public void setTorneosParticipacion(int torneosParticipacion) {
        this.torneosParticipacion = torneosParticipacion;
    }

    public void setNumJugadores(int numJugadores) {
        NumJugadores = numJugadores;
    }
    public void setTorneosPerdidos() {
        this.torneosPerdidos = torneosParticipacion - torneosGanados;
    }

}
