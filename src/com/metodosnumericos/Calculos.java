package com.metodosnumericos;

import java.util.Scanner;

public class Calculos {

    float limiteInferior;
    float limiteSuperior;
    Integer iteraciones;
    float xAnterior = Float.parseFloat("1000");
    float xActual;
    float error;

    public void calcularDatos() {
        System.out.println("Por favor introduzca el valor del limite inferior: ");
        Scanner entradaEscaner = new Scanner(System.in);
        limiteInferior = Float.parseFloat(entradaEscaner.next());

        System.out.println("Por favor introduzca el valor del limite superior: ");
        entradaEscaner = new Scanner(System.in);
        limiteSuperior = Float.parseFloat(entradaEscaner.next());

        System.out.println("Por favor introduzca el valor del error: ");
        entradaEscaner = new Scanner(System.in);
        error = Float.parseFloat(entradaEscaner.next());

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

    private float ejecutarFormula(float valor) {
        return (float) (Math.pow(valor, 2) - (3 * valor) - 4);
    }
}
