package com.company;

public class Zoo {

    Animal Animales[] = new Animal[100];
    Animal AnimalesT[] = new Animal[100];
    int i=0,x;

    public void agregarAnimal() {
        if (i <= Animales.length) {

            System.out.println("    Agregar nuevo animal: \n");
            System.out.println("    ¿Que especie es?");
            System.out.println("    [1] Pajaro. ");
            System.out.println("    [2] Mono. ");
            System.out.println("    [3] Tigre. ");
            System.out.println("    [4] Oso. ");
            System.out.println("    [0] Salir. \n");
            System.out.print("    Introduzca la opción deseada: ");
            x = Capturar.capturarEntero("");

            if (x == 1) {
                i++;
                Animales[i] = new Pajaro(Capturar.capturarString("    Nombre: "), Capturar.capturarString("    Sexo: "), Capturar.capturarEntero("    Edad: "));
            } else if (x == 2) {
                i++;
                Animales[i] = new Mono(Capturar.capturarString("    Nombre: "), Capturar.capturarString("    Sexo: "), Capturar.capturarEntero("    Edad: "));
            } else if (x == 3) {
                i++;
                Animales[i] = new Tigre(Capturar.capturarString("    Nombre: "), Capturar.capturarString("    Sexo: "), Capturar.capturarEntero("    Edad: "));
            } else if (x == 4) {
                i++;
                Animales[i] = new Oso(Capturar.capturarString("    Nombre: "), Capturar.capturarString("    Sexo: "), Capturar.capturarEntero("   Edad: "));
            } else {
                System.out.println("    Opcion no valida. ");
            }
        }
        else{
            System.out.println("    Limite de animales alcanzado. ");
        }
    }



    public void transferirAnimal(){
        int num,x=0;
        if(i>0){
            System.out.println("\n    Animales que tenemos actualmente");
            for (int j=0; j<i; j++){
                Animales[j].mostrarnombre(j);
            }

            System.out.println("\n    Introduzca el número del animal: ");
            num = Capturar.capturarEntero("");

            for(int j=0; j<i; j++){
                if(j!=num-1){
                    AnimalesT[x]=Animales[j];
                    x++;
                }
                else{
                    System.out.println("\n    Animal eliminado. ");
                }
            }
            for(x=0; x<i; x++){
                Animales[x]=AnimalesT[x];

            }
            i=i-1;
        }
        else{
            System.out.println("\n    Actualmente no hay animales. ");
        }

    }




    public void MostrarAnimales(){
        if(i>0){
            System.out.println("\n    Lista de animales: \n");
            for (int j=0; j<i; j++){
                System.out.println("\n    Animal No. "+(j+1));
                System.out.println("    Nombre: "+Animales[j].getNombre()+"\n    Sexo: "+Animales[j].getSexo()+"\n    Edad: "+Animales[j].getEdad());
            }
        } else{
            System.out.println("\n    Actualmente no tenemos animales. ");
        }
    }



    public Animal[] getAnimales() {
        return Animales;
    }
    public void setAnimales(Animal[] Animales) {
        this.Animales = Animales;
    }
}
