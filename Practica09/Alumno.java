package com.company;

public class Alumno {

    String nombre, matricula;
    float promedio;
    int alumnoNumero;
    int[] calificaciones = new int[7];
    String calificacion;

    public Alumno(String nombre, String matricula, int alumnoNumero){
        this.nombre = nombre;
        this.matricula = matricula;
        this.alumnoNumero = alumnoNumero;
    }

    private void ordenarCalificaciones(){
        for(int i=0; i < calificaciones.length; i++){
            if(i<6){
                calificacion += calificaciones[i] + ", ";
            }
            else{
                calificacion += calificaciones[i];
            }
        }
    }

    public void calcularPromedio(){
        for(int i=0; i < calificaciones.length; i++){
            promedio = promedio + calificaciones[i];
        }
        promedio = promedio / calificaciones.length;
        ordenarCalificaciones();
    }

    public void mostrarCalificaciones(){
        System.out.print("Calificaciones: ");
        for(int i=0; i < calificaciones.length; i++){
            if(i<6){
                System.out.print(calificaciones[i] + ", ");
            }
            else{
                System.out.print(calificaciones[i]);
            }
        }
    }

    public void mostrarDatos(){
        System.out.println("    Alumno No. "+alumnoNumero+": \n");
        System.out.println("    Nombre: "+nombre);
        System.out.println("    Matricula: "+matricula);
        System.out.println("    Calificación: "+calificacion);
        System.out.printf("    Promedio: %.2f", promedio);
        System.out.println("\n");
    }

    public String imprimirDatos(){
        return "    Alumno No. "+alumnoNumero+": \n    Nombre: "+nombre+"\n    Matricula: "+matricula+"\n   Calificaciones: "+calificacion+"\n    Promedio: "+promedio;
    }

}
