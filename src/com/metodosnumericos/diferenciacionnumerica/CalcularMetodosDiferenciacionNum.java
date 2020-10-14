package com.metodosnumericos.diferenciacionnumerica;

import org.mariuszgromada.math.mxparser.Argument;
import org.mariuszgromada.math.mxparser.Expression;

import java.util.Scanner;

public class CalcularMetodosDiferenciacionNum {
    
    String funcion;
    double pevaluar;
    //double error;
    double valorh;
    double fx0;

    public void CalcularDerivadaDosPuntos(){
    
        Scanner entradaEscaner = new Scanner(System.in);    
        System.out.println("Por favor introduzca la funcion: ");
        entradaEscaner = new Scanner(System.in);
        funcion = entradaEscaner.nextLine().toLowerCase().trim();

        //System.out.println("Por favor introduzca el valor del error: ");
        //entradaEscaner = new Scanner(System.in);
        //error = Double.parseDouble(entradaEscaner.next());

        System.out.println("Por favor ingrese el punto: ");
        entradaEscaner = new Scanner(System.in);
        pevaluar = Double.parseDouble(entradaEscaner.next());

        System.out.println("Por favor ingrese el valor de h: ");
        entradaEscaner = new Scanner(System.in);
        valorh = Double.parseDouble(entradaEscaner.next());

        fx0 = (f(funcion,(pevaluar+valorh))-f(funcion,(pevaluar)))/valorh;

        System.out.println("La dervada de dos puntos es : " + fx0 );
    }

    public void CalcularDerivadaTresPuntosF1(){

        Scanner entradaEscaner = new Scanner(System.in);    
        System.out.println("Por favor introduzca la funcion: ");
        entradaEscaner = new Scanner(System.in);
        funcion = entradaEscaner.nextLine().toLowerCase().trim();

        //System.out.println("Por favor introduzca el valor del error: ");
        //entradaEscaner = new Scanner(System.in);
        //error = Double.parseDouble(entradaEscaner.next());

        System.out.println("Por favor ingrese el punto: ");
        entradaEscaner = new Scanner(System.in);
        pevaluar = Double.parseDouble(entradaEscaner.next());

        System.out.println("Por favor ingrese el valor de h: ");
        entradaEscaner = new Scanner(System.in);
        valorh = Double.parseDouble(entradaEscaner.next());

       
        fx0 = (1/(2*valorh))*(-3*f(funcion,(pevaluar))+4*f(funcion,(pevaluar+valorh))-f(funcion,(pevaluar+(2*valorh))));

        System.out.println("La derivada de tres puntos con la formula 1 es : " + fx0 );
    }

    public void CalcularSegundaDerivada(){

    }

    private double f(String funcion, double valor) {
        Expression funcionResuelta = new Expression(funcion, new Argument("x = " + valor));
        return funcionResuelta.calculate();
    }

}
