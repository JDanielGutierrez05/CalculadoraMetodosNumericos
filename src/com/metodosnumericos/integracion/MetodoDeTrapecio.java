package com.metodosnumericos.integracion;

import org.mariuszgromada.math.mxparser.Argument;
import org.mariuszgromada.math.mxparser.Expression;

import java.util.Scanner;

public class MetodoDeTrapecio {

    double valorAIntervalo, valorBIntervalo, h, sumatoriaFunciones, valorIntervalotemporal;
    String funcion;
    int n;

    public void calcularDatos() {
        System.out.println("*****Metodo de Trapecio*****");

        System.out.println("Por favor ingrese la funcion: ");
        Scanner entradaEscaner = new Scanner(System.in);
        funcion = entradaEscaner.nextLine().toLowerCase().trim();

        System.out.println("Por favor introduzca el valor de a: ");
        entradaEscaner = new Scanner(System.in);
        valorAIntervalo = Double.parseDouble(entradaEscaner.next());

        System.out.println("Por favor introduzca el valor de b: ");
        entradaEscaner = new Scanner(System.in);
        valorBIntervalo = Double.parseDouble(entradaEscaner.next());

        System.out.println("Por favor introduzca el valor de n: ");
        entradaEscaner = new Scanner(System.in);
        n = Integer.parseInt(entradaEscaner.next());

        h = (valorBIntervalo - valorAIntervalo) / n;
        valorIntervalotemporal = valorAIntervalo;
        sumatoriaFunciones += f(funcion, valorIntervalotemporal);

        System.out.println("Valor de n: 0," + " funcion: " + f(funcion, valorIntervalotemporal));

        for (int i = 1; i < n; i++) {
            valorIntervalotemporal += h;
            sumatoriaFunciones += (2 * f(funcion, valorIntervalotemporal));
            System.out.println("Valor de n: " + i + ", funcion: " + f(funcion, valorIntervalotemporal));
        }
        System.out.println("Valor de n: " + n + ", funcion: " + f(funcion, valorBIntervalo));
        sumatoriaFunciones += f(funcion, valorBIntervalo);
        System.out.println("la solucion al ejercicio es: " + (h / 2) * sumatoriaFunciones);
    }

    private double f(String funcion, double valor) {
        Expression funcionResuelta = new Expression(funcion, new Argument("x = " + valor));
        return funcionResuelta.calculate();
    }
}
