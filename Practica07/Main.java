package com.company;

public class Main {

    public static void main(String[] args) {

        boolean ingredientes = false;
        boolean cocinar = false;
        boolean servir = false;
        int x, y;

        RobotChef Chef = new RobotChef(100, "001", "Chef Pavarotti", "Ninguna");
        MiniRobotCuchillos Cortador = new MiniRobotCuchillos(100, "002", "Cortador Linguini", "Ninguna");
        MiniRobotCaliente Cocinador = new MiniRobotCaliente(100, "003", "Cocinador Gusteau", "Ninguna");

        do {

            System.out.println("\n\n-----------------------------------Practica 7---------------------------------------");
            System.out.println("    Menu de robots: \n");
            System.out.print("    [1] Robot Chef. \n");
            System.out.print("    [2] Mini Robot Cuchillos. \n");
            System.out.print("    [3] Mini Robot Manos Calientes. \n");
            System.out.print("    [0] Salir. \n\n");
            x = Capturar.capturarEntero("    Seleccione un robot: ");


            if (x == 1) {

                do {

                    System.out.println("\n--------------------------------------------------------------------------");
                    System.out.println("\n    Menu de acciones: \n");
                    System.out.print("    [1] Cortar ingredientes. \n");
                    System.out.print("    [2] Cocinar platillo. \n");
                    System.out.print("    [3] Servir platillo. \n");
                    System.out.print("    [4] Información. \n");
                    System.out.print("    [0] Salir. \n\n");
                    y = Capturar.capturarEntero("    Seleccione una acción: ");

                    if (y == 1) {
                        ingredientes = Chef.prepararIngredientes(ingredientes);
                    } else if (y == 2) {
                        cocinar = Chef.cocinarPlatillo(cocinar, ingredientes);
                    } else if (y == 3) {
                        servir = Chef.servir(cocinar, ingredientes, servir);
                    } else if (y == 4) {
                        Chef.informacion();
                    } else if (y == 0) {
                        System.out.print("    Saliendo... \n");
                    } else {
                        System.out.print("    Respuesta no valida. \n");
                    }

                }while(y!=0);

            }

            else if (x == 2) {

                do {

                    System.out.println("\n--------------------------------------------------------------------------");
                    System.out.println("\n    Menu de acciones: \n");
                    System.out.print("    [1] Cortar ingredientes. \n");
                    System.out.print("    [2] Cocinar platillo. \n");
                    System.out.print("    [3] Servir platillo. \n");
                    System.out.print("    [4] Información. \n");
                    System.out.print("    [0] Salir. \n\n");
                    y = Capturar.capturarEntero("    Seleccione una acción: ");

                    if (y == 1) {
                        ingredientes = Chef.prepararIngredientes(ingredientes);
                    } else if (y == 2) {
                        System.out.print("    El mini Robot Cortador no puede cocinar platillos. \n");
                    } else if (y == 3) {
                        System.out.print("    El mini Robot Cortador no puede servir platillos. \n");
                    } else if (y == 4) {
                        Cortador.informacion();
                    } else if (y == 0) {
                        System.out.print("    Saliendo... \n");
                    } else {
                        System.out.print("    Respuesta no valida. \n");
                    }

                }while(y!=0);

            }

            else if (x == 3) {

                do {

                    System.out.println("\n--------------------------------------------------------------------------");
                    System.out.println("\n    Menu de acciones: \n");
                    System.out.print("    [1] Cortar ingredientes. \n");
                    System.out.print("    [2] Cocinar platillo. \n");
                    System.out.print("    [3] Servir platillo. \n");
                    System.out.print("    [4] Información. \n");
                    System.out.print("    [0] Salir. \n\n");
                    y = Capturar.capturarEntero("    Seleccione una acción: ");

                    if (y == 1) {
                        System.out.print("    El mini Robot Cocinador no puede cortar ingredientes. \n");
                    } else if (y == 2) {
                        cocinar = Chef.cocinarPlatillo(cocinar, ingredientes);
                    } else if (y == 3) {
                        System.out.print("    El mini Robot Cocinador no puede servir platillos. \n");
                    } else if (y == 4) {
                        Cocinador.informacion();
                    } else if (y == 0) {
                        System.out.print("    Saliendo... \n");
                    } else {
                        System.out.print("    Respuesta no valida. \n");
                    }

                } while (y != 0);

            }
            else if(x==0){

            }
            else {
                System.out.print("    Respuesta no valida. \n");
            }

        }while(x!=0);




    }
}
