package com.company;

public class Cuenta {

    private String nombre;
    private float saldo;
    private int pin;

    //nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    //pin
    public void setPin(int pin) {
        this.pin = pin;
    }
    public int getPin() {
        return pin;
    }

    //saldo
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public float getSaldo() {
        return saldo;
    }

}
