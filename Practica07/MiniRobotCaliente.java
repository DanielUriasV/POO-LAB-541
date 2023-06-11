package com.company;

public class MiniRobotCaliente extends GUI implements manosCalientes{

    public MiniRobotCaliente(int bateria, String id, String nombre, String ultimaAccion){
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
    public boolean cocinarPlatillo(boolean cocinar, boolean ingredientes) {

        if(!ingredientes){
            System.out.println("    Error: Los alimentos no se han preparado. ");
        }
        else{

            if(!cocinar){
                System.out.println("    Platillo cocinado exitosamente. ");
                cocinar = true;
                bateria = bateria-10;
                ultimaAccion = "Cocinar platillo.";

                if(bateria == 0){
                    System.out.println("    Baterias agotadas. Recargando... ");
                    System.out.println("    Las baterias han sido recargadas. ");
                    bateria=100;
                }

            }
            else{
                System.out.println("    Este platillo ya habia sido cocinado con anterioridad. ");
            }

        }
        return cocinar;
    }

}
