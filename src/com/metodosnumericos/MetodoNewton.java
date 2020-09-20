package com.metodosnumericos;

import org.mariuszgromada.math.mxparser.Argument;
import org.mariuszgromada.math.mxparser.Expression;

import java.util.Scanner;

public class MetodoNewton {

    double xActual;
    Integer iteraciones = 0;
    double xAnterior = Double.parseDouble("1000");
    String funcion;
    double error;

    public void calcularDatos() {
        System.out.println("*****Metodo de Newton*****");
        System.out.println("Por favor introduzca el valor para la formula: ");
        Scanner entradaEscaner = new Scanner(System.in);
        xActual = Double.parseDouble(entradaEscaner.next());

        System.out.println("ingrese la funcion: ");
        entradaEscaner = new Scanner(System.in);
        funcion = entradaEscaner.nextLine().toLowerCase().trim();

        System.out.println("Por favor introduzca el valor del error: ");
        entradaEscaner = new Scanner(System.in);
        error = Double.parseDouble(entradaEscaner.next());

        while (Math.abs(xActual - xAnterior) > error) {
            xAnterior = xActual;

            if (f(funcion, xActual) == 0) {
                break;
            }
            xActual = xAnterior - (f(funcion, xAnterior) / fDerivada(funcion, xAnterior));
            iteraciones++;
            System.out.println("La raiz es: " + xActual + " en la iteracion: " + iteraciones);
        }
        System.out.println("La raiz final es: " + xActual + " y el numero de iteraciones fueron: " + iteraciones);
    }

    private double f(String funcion, double valor) {
        Expression funcionResuelta = new Expression(funcion, new Argument("x = " + valor));
        return funcionResuelta.calculate();
    }

    private double fDerivada(String funcion, double valor) {
        Expression funcionResuelta = new Expression("der(" + funcion + ", x)", new Argument("x = " + valor));
        return funcionResuelta.calculate();
    }
}
