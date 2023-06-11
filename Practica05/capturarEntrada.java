package com.company;
import java.util.*;

public class capturarEntrada {

    Scanner Teclado = new Scanner(System.in);

    public String capturarString(){
        return Teclado.nextLine();
    }

    public float capturarFloat(){
        return Teclado.nextFloat();
    }

    public int capturarInt(){
        return Teclado.nextInt();
    }

}
