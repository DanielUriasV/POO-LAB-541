package com.company;

public class Animal {

    String nombre, sexo;
    int edad;
    boolean vacuna,Alimento;

    public Animal(String nombre, String sexo, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarnombre(int i){
        System.out.println("["+(i+1)+"] "+getNombre()+" el animal");
    }
    public void setVacuna(boolean vacuna) {
        this.vacuna = vacuna;
    }
    public boolean getVacuna(){
        return vacuna;
    }
    public boolean getAlimento() {
        return Alimento;
    }
    public void setAlimento(boolean alimento) {
        Alimento = alimento;
    }
    public void Comida(){
        System.out.print("comida");
    }

}
