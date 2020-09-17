package com.metodosnumericos;

import org.mariuszgromada.math.mxparser.Argument;
import org.mariuszgromada.math.mxparser.Expression;

import java.util.Scanner;

public class MetodoBiseccion {

    double limiteInferior;
    double limiteSuperior;
    Integer iteraciones = 0;
    double xAnterior = Double.parseDouble("1000");
    double xActual;
    String funcion;
    double error;

    public void calcularDatos() {
        System.out.println("*****Metodo Biseccion*****");

        System.out.println("ingrese la funcion: ");
        Scanner entradaEscaner = new Scanner(System.in);
        funcion = entradaEscaner.nextLine().toLowerCase().trim();

        System.out.println("Por favor introduzca el valor del limite inferior: ");
        entradaEscaner = new Scanner(System.in);
        limiteInferior = Double.parseDouble(entradaEscaner.next());

        System.out.println("Por favor introduzca el valor del limite superior: ");
        entradaEscaner = new Scanner(System.in);
        limiteSuperior = Double.parseDouble(entradaEscaner.next());

        System.out.println("Por favor introduzca el valor del error: ");
        entradaEscaner = new Scanner(System.in);
        error = Double.parseDouble(entradaEscaner.next());

        xActual = (limiteInferior + limiteSuperior) / 2;

        while (Math.abs(xActual - xAnterior) > error) {
            xAnterior = xActual;

            if (f(funcion, limiteInferior) == 0) {
                xActual = limiteInferior;
                break;
            }

            if (f(funcion, limiteSuperior) == 0) {
                xActual = limiteSuperior;
                break;
            }

            if (f(funcion, xActual) == 0) {
                break;
            }

            if ((f(funcion, limiteInferior) * f(funcion, xActual)) < 0) {
                limiteSuperior = xActual;
            } else {
                limiteInferior = xActual;
            }
            xActual = (limiteInferior + limiteSuperior) / 2;
            iteraciones++;
        }
        System.out.println("La raiz es: " + xActual + " y el numero de iteraciones fueron: " + iteraciones);
    }

    private double f(String funcion, double valor) {
        Expression funcionResuelta = new Expression(funcion, new Argument("x = " + valor));
        //mXparser.consolePrintln("funcion es: " + funcionResuelta.getExpressionString() + ", valor es: " + valor + ", resultado es: " + funcionResuelta.calculate());
        return funcionResuelta.calculate();
    }
}
