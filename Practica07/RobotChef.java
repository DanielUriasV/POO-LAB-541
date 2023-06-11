package com.company;

public class RobotChef extends GUI implements Cuchillos, manosCalientes{

    public RobotChef(int bateria, String id, String nombre, String ultimaAccion){
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
    public boolean prepararIngredientes(boolean ingredientes) {

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

    public boolean servir(boolean ingredientes, boolean cocinar, boolean servir){

        if(ingredientes && cocinar){
            System.out.println("\n    Platillo servido extiosamente. ");
            System.out.println("\n    Hurra! El platillo estaba delicioso. ");
            bateria = bateria - 10;
            ultimaAccion = "Servir platillo. ";
            servir = true;

            if(bateria == 0){
                System.out.println("    Baterias agotadas. Recargando... ");
                System.out.println("    Las baterias han sido recargadas. ");
                bateria=100;
            }

        }
        else if (!ingredientes){
            System.out.println("    Error: Imposible servir platillo si no se han cortado los ingredientes. ");
        }
        else if(!cocinar){
            System.out.println("    Error: Imposible servir platillo si no se ha cocinado. ");
        }

        return servir;
    }

}
