package com.company;

public class Veterinario {

    String nombre, horario;
    int edad;

    public Veterinario(String nombre, String horario, int edad) {
        this.nombre = nombre;
        this.horario = horario;
        this.edad = edad;
    }

    public void Informacion(){
        System.out.println("\n    Informacion del veterinario: ");
        System.out.println("\n    Nombre: "+this.nombre+"\n    Edad: "+this.edad+"\n    Horario: "+this.horario);
    }

    public void Vaccinated(Animal Animales[],int num){
        if(num>0){
            for (int i=0; i<num; i++){
                if (!Animales[i].getVacuna()){
                    Animales[i].setVacuna(true);
                    System.out.println("\n     Vacunaste a "+Animales[i].getNombre());
                }
                else{
                    System.out.println("\n    "+Animales[i].getNombre()+" ya esta vacunado.");
                }
            }
        }
        else{
            System.out.println("\n     Actualmente no tenemos animales. ");
        }

    }

    public void Alimentar(Animal Animales[],int num){
        if(num>0){
            for (int i=0; i<num; i++){
                Animales[i].setAlimento(true);
                System.out.print("\n     Alimentas a "+Animales[i].getNombre()+" con ");
                Animales[i].Comida();
            }
        }
        else{
            System.out.println("\n    Actualmente no tenemos animales.");
        }
    }

    public void Charlar(){
        System.out.println("\n   Charlas un rato con el veterinario.");
    }

}
