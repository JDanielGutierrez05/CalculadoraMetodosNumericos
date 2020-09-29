package com.metodosnumericos;

import org.mariuszgromada.math.mxparser.Argument;
import org.mariuszgromada.math.mxparser.Expression;

import java.util.Scanner;

public class MetodoSecante {

    int iteraciones = 0;
    double x0, x1, x2;
    String funcion;
    double error;

    public void calcularDatos() {
        System.out.println("Metodo de la Secante*****");

        System.out.println("Ingrese la funcion: ");
        Scanner entradaEscaner = new Scanner(System.in);
        funcion = entradaEscaner.nextLine().toLowerCase().trim();

        System.out.println("Por favor introduzca el valor de X0: ");
        entradaEscaner = new Scanner(System.in);
        x0 = Double.parseDouble(entradaEscaner.next());

        System.out.println("Por favor introduzca el valor del X1: ");
        entradaEscaner = new Scanner(System.in);
        x1 = Double.parseDouble(entradaEscaner.next());

        System.out.println("Por favor introduzca el valor del error: ");
        entradaEscaner = new Scanner(System.in);
        error = Double.parseDouble(entradaEscaner.next());
        x2=x0;
        while (Math.abs(f(funcion,x2)) > error) {
            x2 = x1 - (f(funcion,x1) * (x1-x0)) / (f(funcion,x1) - f(funcion,x0)); 
            x0 = x1;
            x1 = x2;
            
            iteraciones++;
            System.out.println("La raiz es: " + x2 + " en la iteracion: " + iteraciones);
        }
        System.out.println("La raiz final es: " + x2 + " y el numero de iteraciones fueron: " + iteraciones);
    }

    private double f(String funcion, double valor) {
        Expression funcionResuelta = new Expression(funcion, new Argument("x = " + valor));
        return funcionResuelta.calculate();
    }
}
