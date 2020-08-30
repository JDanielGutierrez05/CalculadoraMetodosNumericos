package com.metodosnumericos;

import java.util.Scanner;

public class Calculos {

    Double limiteInferior;
    Double limiteSuperior;
    Integer iteraciones;
    Double xAnterior = Double.parseDouble("1000");
    Double xActual;
    Double error;

    public void calcularDatos() {
        System.out.println("Por favor introduzca el valor del limite inferior: ");
        Scanner entradaEscaner = new Scanner(System.in);
        limiteInferior = Double.parseDouble(entradaEscaner.next());

        System.out.println("Por favor introduzca el valor del limite superior: ");
        entradaEscaner = new Scanner(System.in);
        limiteSuperior = Double.parseDouble(entradaEscaner.next());

        System.out.println("Por favor introduzca el valor del error: ");
        entradaEscaner = new Scanner(System.in);
        error = Double.parseDouble(entradaEscaner.next());

        xActual = (limiteInferior + limiteSuperior) / 2;
        iteraciones = 0;

        while (Math.abs(xActual - xAnterior) > error) {
            xAnterior = xActual;
            iteraciones++;

            if ((ejecutarFormula(limiteInferior) * ejecutarFormula(limiteSuperior)) < 0) {
                limiteSuperior = xActual;
            } else {
                limiteInferior = xActual;
            }
            xActual = (limiteInferior + limiteSuperior) / 2;
        }
        System.out.println("La raiz es: " + xActual + " y el numero de iteraciones fueron: " + iteraciones);
    }

    private Double ejecutarFormula(Double valor) {
        return Math.pow(valor, 2) - 3 * valor - 4;
    }
}
