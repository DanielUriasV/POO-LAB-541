package com.company;
import java.util.Scanner;

public class Capturar {

    public static String capturarString(String msg){
        System.out.print(msg);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public static int capturarEntero(String msg){
        System.out.print(msg);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static float capturarFloat(String msg){
        System.out.print(msg);
        Scanner sc = new Scanner(System.in);
        return sc.nextFloat();
    }

}