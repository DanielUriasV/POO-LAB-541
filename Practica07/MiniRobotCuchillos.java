package com.company;

public class MiniRobotCuchillos extends GUI implements Cuchillos{

    public MiniRobotCuchillos(int bateria, String id, String nombre, String ultimaAccion){
        super(bateria, id, nombre, ultimaAccion);
    }

    @Override
    public void informacion() {
        System.out.println("\n    Información.");
        System.out.println("    Número de Identificación: "+id);
        System.out.println("    Nombre del robot: "+nombre);
        System.out.println("    Bateria: "+bateria+"%");
        System.out.println("    Ultima acción realizada: "+ultimaAccion);
        System.out.println();
    }

    @Override
    public boolean prepararIngredientes(boolean ingredientes){

        if(!ingredientes){
            System.out.println("    Se han cortado los ingredientes exitosamente. ");
            ingredientes = true;
            bateria = bateria-10;
            ultimaAccion = "Cocinar platillo.";

            if(bateria == 0){
                System.out.println("    Baterias agotadas. Recargando... ");
                System.out.println("    Las baterias han sido recargadas. ");
                bateria=100;
            }

        }
        else{
            System.out.println("    Los ingredientes ya se habian cortado con anterioridad. ");
        }
        return ingredientes;

    }

}
