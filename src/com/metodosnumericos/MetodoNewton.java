package com.metodosnumericos;

import org.mariuszgromada.math.mxparser.Argument;
import org.mariuszgromada.math.mxparser.Expression;
import org.mariuszgromada.math.mxparser.mXparser;

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

/*        while (Math.abs(xActual - xAnterior) > error) {
            xAnterior = xActual;

            if (f(xActual) == 0) {
                break;
            }

*//*            if ((f(limiteInferior) * f(xActual)) < 0) {
                limiteSuperior = xActual;
            } else {
                limiteInferior = xActual;
            }
            xActual = limiteInferior - (f(limiteInferior) * (limiteInferior - limiteSuperior) / (f(limiteInferior) - f(limiteSuperior)));*//*
            iteraciones++;
        }*/
        f(funcion, xActual);
        //System.out.println("La raiz es: " + xActual + " y el numero de iteraciones fueron: " + iteraciones);
    }

    private double f(String funcion, double valor) {
        Expression funcionResuelta = new Expression(funcion, new Argument("x = " + valor));
        //mXparser.consolePrintln("funcion es: " + funcionResuelta.getExpressionString() + ", valor es: " + valor + ", resultado es: " + funcionResuelta.calculate());
        return funcionResuelta.calculate();
    }

    private void fDerivada(String funcion, double valor) {
        Expression funcionResuelta = new Expression("der(" + funcion + ", x)", new Argument("x = " + valor));
        mXparser.consolePrintln("funcion a derivar: " + funcion + ", funcion derivada es: " + funcionResuelta.calculate());
    }
}
