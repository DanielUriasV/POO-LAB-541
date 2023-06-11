package com.company;

public class Main {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        Veterinario V1 = new Veterinario("Daniel","8:00am - 3:00pm", 20);
        int opc, opc2;

        do{

        System.out.println("\n ---------------------------------Practica 6-----------------------------------\n");


        System.out.println("    Menu: \n");
        System.out.println("    [1] Agregar animales. ");
        System.out.println("    [2] Transferir animales. ");
        System.out.println("    [3] Mostrar animales. ");
        System.out.println("    [4] Ir al veterinario. ");
        System.out.println("    [0] Salir. \n");
        System.out.print("    Introduzca la opción deseada: ");
        opc = Capturar.capturarEntero("");

        if(opc==1){
            zoo.agregarAnimal();
        }

        else if(opc==2){
            zoo.transferirAnimal();
        }

        else if(opc==3){
            zoo.MostrarAnimales();
        }

        else if(opc==4){

            System.out.println("    Menu del veterinario: \n");
            System.out.println("    [1] Ver su informacion. ");
            System.out.println("    [2] Vacunar animales. ");
            System.out.println("    [3] Alimentar animales. ");
            System.out.println("    [3] Charlar con el veterinario. ");
            System.out.println("    [0] Salir. \n");
            System.out.print("    Introduzca la opción deseada: ");
            opc2 = Capturar.capturarEntero("");

            switch(opc2){
                case 1:
                    V1.Informacion();
                    break;
                case 2:
                    V1.Vaccinated(zoo.getAnimales(),zoo.Animales.length);
                    break;
                case 3:
                    V1.Alimentar(zoo.getAnimales(),zoo.Animales.length);
                    break;
                case 4:
                    V1.Charlar();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\nOpcion seleccionada no valida");
                    break;
            }

        }

        else if(opc==0){

        }
        else{
            System.out.println("Opcion no valida. ");
        }

        }while(opc!=0);
    }
}


