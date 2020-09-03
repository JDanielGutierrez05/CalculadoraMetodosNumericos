package com.metodosnumericos;

import java.util.Scanner;

public class MetodoReglaFalsa {

    double limiteInferior;
    double limiteSuperior;
    Integer iteraciones;
    double xAnterior = Double.parseDouble("1000");
    double xActual;
    double error;

    public void calcularDatos() {
        System.out.println("*****Metodo Regla Falsa*****");
        System.out.println("Por favor introduzca el valor del limite inferior: ");
        Scanner entradaEscaner = new Scanner(System.in);
        limiteInferior = Float.parseFloat(entradaEscaner.next());

        System.out.println("Por favor introduzca el valor del limite superior: ");
        entradaEscaner = new Scanner(System.in);
        limiteSuperior = Float.parseFloat(entradaEscaner.next());

        System.out.println("Por favor introduzca el valor del error: ");
        entradaEscaner = new Scanner(System.in);
        error = Float.parseFloat(entradaEscaner.next());

        xActual = limiteInferior - (f(limiteInferior) * (limiteInferior - limiteSuperior) / f(limiteInferior) - f(limiteSuperior));
        iteraciones = 0;

        while (Math.abs(xActual - xAnterior) > error) {
            xAnterior = xActual;
            iteraciones++;

            if ((f(limiteInferior) * f(xActual)) < 0) {
                limiteSuperior = xActual;
            } else {
                limiteInferior = xActual;
            }
            xActual = limiteInferior - (f(limiteInferior) * (limiteInferior - limiteSuperior) / f(limiteInferior) - f(limiteSuperior));
        }
        System.out.println("La raiz es: " + xActual + " y el numero de iteraciones fueron: " + iteraciones);
    }

    private double f(double valor) {
        return Math.sin(Math.pow(valor, 2)) + Math.pow(valor, 2) - 3;
    }
}
