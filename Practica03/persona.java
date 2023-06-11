package com.company;
import java.util.Scanner;


class persona{

    String nombre;
    String apellidoP;
    String apellidoM;
    String sexo;
    String fechaDia;
    String fechaMes;
    String fechaAnio;
    String entidad;

    String curp = "";
    String RFC = "";

    public void capturarDatos() {

        Scanner sc = new Scanner(System.in);

        System.out.print("\n    Inserte su nombre: ");
        nombre = sc.nextLine();

        System.out.print("\n    Inserte su apellido paterno: ");
        apellidoP = sc.nextLine();

        System.out.print("\n    Inserte su apellido materno: ");
        apellidoM = sc.nextLine();

        System.out.print("\n    Inserte su genero (H/M): ");
        sexo = sc.nextLine();

        System.out.print("\n    Inserte su día de nacimiento (Ejemplo: 02): ");
        fechaDia = sc.nextLine();

        System.out.print("\n    Inserte su mes de nacimiento (Ejemplo: 06): ");
        fechaMes = sc.nextLine();

        System.out.print("\n    Inserte su año de nacimiento (Ejemplo: 00): ");
        fechaAnio = sc.nextLine();

        System.out.print("\n    Inserte su entidad de nacimiento: ");
        entidad = sc.nextLine();

    }

    public void generarCurp(){

        curp += apellidoP.charAt(0);

        for(int i=1; i <= apellidoP.length()-1; i++){
            if(apellidoP.charAt(i)== 'a' || apellidoP.charAt(i)== 'e' || apellidoP.charAt(i)== 'i' || apellidoP.charAt(i)== 'o' ||apellidoP.charAt(i)== 'u'){
                curp+=apellidoP.charAt(i);
                break;
            }
        }

        curp += apellidoM.charAt(0);
        curp += nombre.charAt(0);
        curp += fechaAnio.charAt(0);
        curp += fechaAnio.charAt(1);
        curp += fechaMes.charAt(0);
        curp += fechaMes.charAt(1);
        curp += fechaDia.charAt(0);
        curp += fechaDia.charAt(1);
        curp += sexo.charAt(0);
        curp += apellidoM.charAt(0);
        curp += entidad.charAt(0);

        for(int i=1; i <= entidad.length()-1; i++){
            if(entidad.charAt(i)==' '){
                curp+=entidad.charAt(i+1);
                break;
            }
        }

        for(int i=1; i <= apellidoP.length()-1; i++){
            if(apellidoP.charAt(i)== 'b' || apellidoP.charAt(i)== 'c' || apellidoP.charAt(i)== 'd' || apellidoP.charAt(i)== 'f' ||apellidoP.charAt(i)== 'g' ||
                    apellidoP.charAt(i)== 'h' || apellidoP.charAt(i)== 'j' || apellidoP.charAt(i)== 'k' || apellidoP.charAt(i)== 'l' ||apellidoP.charAt(i)== 'm' ||
                    apellidoP.charAt(i)== 'p' || apellidoP.charAt(i)== 'q' || apellidoP.charAt(i)== 'r' || apellidoP.charAt(i)== 's' ||apellidoP.charAt(i)== 't' ||
                    apellidoP.charAt(i)== 'v' || apellidoP.charAt(i)== 'w' || apellidoP.charAt(i)== 'x' || apellidoP.charAt(i)== 'y' ||apellidoP.charAt(i)== 'z'){
                curp+=apellidoP.charAt(i);
                break;
            }
        }

        for(int i=1; i <= apellidoM.length()-1; i++){
            if(apellidoM.charAt(i)== 'b' || apellidoM.charAt(i)== 'c' || apellidoM.charAt(i)== 'd' || apellidoM.charAt(i)== 'f' || apellidoM.charAt(i)== 'g' ||
                    apellidoM.charAt(i)== 'h' || apellidoM.charAt(i)== 'j' || apellidoM.charAt(i)== 'k' || apellidoM.charAt(i)== 'l' || apellidoM.charAt(i)== 'm' ||
                    apellidoM.charAt(i)== 'p' || apellidoM.charAt(i)== 'q' || apellidoM.charAt(i)== 'r' || apellidoM.charAt(i)== 's' || apellidoM.charAt(i)== 't' ||
                    apellidoM.charAt(i)== 'v' || apellidoM.charAt(i)== 'w' || apellidoM.charAt(i)== 'x' || apellidoM.charAt(i)== 'y' || apellidoM.charAt(i)== 'z'){
                curp+=apellidoM.charAt(i);
                break;
            }
        }

        for(int i=1; i <= nombre.length()-1; i++){
            if(nombre.charAt(i)== 'b' || nombre.charAt(i)== 'c' || nombre.charAt(i)== 'd' || nombre.charAt(i)== 'f' || nombre.charAt(i)== 'g' ||
                    nombre.charAt(i)== 'h' || nombre.charAt(i)== 'j' || nombre.charAt(i)== 'k' || nombre.charAt(i)== 'l' || nombre.charAt(i)== 'm' ||
                    nombre.charAt(i)== 'n' || nombre.charAt(i)== 'p' || nombre.charAt(i)== 'q' || nombre.charAt(i)== 'r' || nombre.charAt(i)== 's' ||
                    nombre.charAt(i)== 't' || nombre.charAt(i)== 'v' || nombre.charAt(i)== 'w' || nombre.charAt(i)== 'x' || nombre.charAt(i)== 'y' ||
                    nombre.charAt(i)== 'z'){
                curp+=nombre.charAt(i);
                break;
            }
        }

        curp+= "09";

        System.out.println("\n    Su curp es: " + curp);

    }

    public void generarRFC(){

        RFC += apellidoP.charAt(0);
        RFC += apellidoP.charAt(1);
        RFC += apellidoM.charAt(0);
        RFC += nombre.charAt(0);
        RFC += fechaAnio.charAt(0);
        RFC += fechaAnio.charAt(1);
        RFC += fechaMes.charAt(0);
        RFC += fechaMes.charAt(1);
        RFC += fechaDia.charAt(0);
        RFC += fechaDia.charAt(1);
        RFC += "UIV";

        System.out.println("\n    Su RFC es: "+RFC);


    }

}
