package com.metodosnumericos.integracion;

import org.mariuszgromada.math.mxparser.Argument;
import org.mariuszgromada.math.mxparser.Expression;

import java.util.Scanner;

public class MetodoSimpson {

    double valorAIntervalo, valorBIntervalo, h;
    String funcion;
    int n;

    public void calcularDatos() {
        System.out.println("*****Metodo de Simpsom*****");

        System.out.println("Por favor ingrese la funcion: ");
        Scanner entradaEscaner = new Scanner(System.in);
        funcion = entradaEscaner.nextLine().toLowerCase().trim();
        
        System.out.println("Por favor introduzca el valor inicial del intervalo: ");
        entradaEscaner = new Scanner(System.in);
        valorAIntervalo = Double.parseDouble(entradaEscaner.next());

        System.out.println("Por favor introduzca el valor final del intervalo: ");
        entradaEscaner = new Scanner(System.in);
        valorBIntervalo = Double.parseDouble(entradaEscaner.next());

        System.out.println("Por favor introduzca el valor de n: ");
        entradaEscaner = new Scanner(System.in);
        n = Integer.parseInt(entradaEscaner.next());

        h = (valorBIntervalo - valorAIntervalo) / n;

    }

    private double f(String funcion, double valor) {
        Expression funcionResuelta = new Expression(funcion, new Argument("x = " + valor));
        return funcionResuelta.calculate();
    }
}
