package com.company;

public class Main {

    public static void main(String[] args) {

        Banco B = new Banco();
        capturarEntrada cEntrada = new capturarEntrada();

        int x;
        boolean cuentaExiste=false;

        do{

        System.out.print("\n\n\n--------------------------Practica 5--------------------------");

        System.out.print("\n    [1] Crear una cuenta.");
        System.out.print("\n    [2] Acceder a una cuenta. ");
        System.out.println("\n    [0] Salir. ");
        System.out.print("\n    Introduzca la opción deseada: ");
        x = cEntrada.capturarInt();

        if(x==1){
            B.crearCuenta();
            cuentaExiste = true;
        }
        else if(x==2){
            if(cuentaExiste){
                B.accederCuenta();
            }
            else{
                System.out.print("\n    No existen cuentas.");
            }
        }
        else if(x==0){
            System.out.print("\n    Que tenga buen día. \n\n\n");
        }
        else{
            System.out.print("\n    Opción no valida. ");
        }

        }while(x!=0);
    }
}
