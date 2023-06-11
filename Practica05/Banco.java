package com.company;

public class Banco {

    Cuenta cuenta = new Cuenta();
    capturarEntrada cEntrada = new capturarEntrada();


    public void crearCuenta(){
        int x;

        System.out.print("\n\n\n    --------------------------Crear cuenta----------------------");
        System.out.print("\n\n    Introduzca su nombre: ");
        cuenta.setNombre(cEntrada.capturarString());

        System.out.print("\n    Inserte un PIN de 4 digitos: ");
        cuenta.setPin(cEntrada.capturarInt());

        cuenta.setSaldo(0);
        System.out.print("\n    Su saldo actual es de : " + cuenta.getSaldo());

        do{

            System.out.print("\n\n    ¿Desea realizar su primer deposito?  ");
            System.out.print("\n    [1] Si");
            System.out.print("\n    [2] No");
            System.out.print("\n    Introduzca la opción deseada: ");
            x = cEntrada.capturarInt();

            if(x==1){
                System.out.print("\n    Introduzca el monto del deposito: ");
                cuenta.setSaldo(cEntrada.capturarFloat());
                System.out.print("\n    Su saldo actual es de : " + cuenta.getSaldo());
            }

            else if(x==2){
            }

            else{
                System.out.print("\n    Opción no valida. ");
            }

        }while(x!=1 && x!=2);

        System.out.print("\n    Cuenta creada exitosamente. ");
    }

    public void accederCuenta(){
        int pin, x;
        float cantidad;

        System.out.print("\n\n\n    -----------------------Acceder a una cuenta-------------------\n");
        System.out.print("\n    Introduzca su PIN: ");
        pin = cEntrada.capturarInt();

        if(pin==cuenta.getPin()){

            do{

                System.out.print("\n\n\n    Bienvenido "+cuenta.getNombre());
                System.out.print("\n\n    ¿Qué desea hacer? ");
                System.out.print("\n    [1] Consultar");
                System.out.print("\n    [2] Depositar");
                System.out.print("\n    [3] Retirar ");
                System.out.print("\n    [0] Salir");
                System.out.print("\n\n    Introduzca el número de la opción deseada: ");
                x = cEntrada.capturarInt();

                if(x==1){
                    System.out.print("\n    El saldo actual de su cuenta es: "+cuenta.getSaldo());
                }
                else if(x==2){
                    System.out.print("\n    Introduzca el monto a depositar: ");
                    cantidad = cEntrada.capturarFloat();
                    cuenta.setSaldo(cuenta.getSaldo()+cantidad);
                    System.out.print("\n    Deposito completado. ");
                }
                else if(x==3){
                    System.out.print("\n    Introduzca el monto a retirar: ");
                    cantidad = cEntrada.capturarFloat();
                    if(cantidad <= cuenta.getSaldo()){
                        cuenta.setSaldo(cuenta.getSaldo()-cantidad);
                        System.out.print("\n    Retiro completado. ");
                    }
                    else{
                        System.out.print("\n    Saldo insuficiente. ");
                    }
                }
                else if(x==0){
                    System.out.print("\n    Que tenga un buen día. ");
                }
                else{
                    System.out.print("\n    Opción no valida. ");
                }

            }while(x!=0);

        }

        else{
            System.out.print("\n    PIN incorrecto.");
        }

    }


}
