package com.metodosnumericos;

import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;

import java.util.Scanner;

public class MetodoNewton {

    DJep djep;
    Node nodoFuncion;
    Node nodoDerivada;

    double limiteInferior;
    double limiteSuperior;
    Integer iteraciones = 0;
    double xAnterior = Double.parseDouble("1000");
    double xActual;
    double error;
    String funcionaDerivar;

    public void calcularDatos() {
        System.out.println("ingrese la funcion a derivar: ");
        Scanner entradaEscaner = new Scanner(System.in);
        derivar(entradaEscaner.next());

      /*  System.out.println("Metodo Regla Falsa*****");
        System.out.println("Por favor introduzca el valor del limite inferior: ");
        Scanner entradaEscaner = new Scanner(System.in);
        limiteInferior = Double.parseDouble(entradaEscaner.next());

        System.out.println("Por favor introduzca el valor del limite superior: ");
        entradaEscaner = new Scanner(System.in);
        limiteSuperior = Double.parseDouble(entradaEscaner.next());

        System.out.println("Por favor introduzca el valor del error: ");
        entradaEscaner = new Scanner(System.in);
        error = Double.parseDouble(entradaEscaner.next());

        xActual = limiteInferior - (f(limiteInferior) * (limiteInferior - limiteSuperior) / (f(limiteInferior) - f(limiteSuperior)));

        while (Math.abs(xActual - xAnterior) > error) {
            xAnterior = xActual;

            if (f(limiteInferior) == 0) {
                xActual = limiteInferior;
                break;
            }

            if (f(limiteSuperior) == 0) {
                xActual = limiteSuperior;
                break;
            }

            if (f(xActual) == 0) {
                break;
            }

            if ((f(limiteInferior) * f(xActual)) < 0) {
                limiteSuperior = xActual;
            } else {
                limiteInferior = xActual;
            }
            xActual = limiteInferior - (f(limiteInferior) * (limiteInferior - limiteSuperior) / (f(limiteInferior) - f(limiteSuperior)));
            iteraciones++;
        }
        System.out.println("La raiz es: " + xActual + " y el numero de iteraciones fueron: " + iteraciones);*/
    }

    private double f(double valor) {
        return Math.sin(Math.pow(valor, 2) + 4);
    }


    public void derivar(String funcion) {
        try {
            this.djep = new DJep();
            // agrega funciones estandares cos(x), sin(x)
            this.djep.addStandardFunctions();

            // agrega constantes estandares, pi, e, etc
            this.djep.addStandardConstants();

            // por si existe algun numero complejo
            this.djep.addComplex();

            // permite variables no declarables
            this.djep.setAllowUndeclared(true);

            // permite asignaciones
            this.djep.setAllowAssignment(true);

            // regla de multiplicacion o para sustraccion y sumas
            this.djep.setImplicitMul(true);

            // regla de multiplicacion o para sustraccion y sumas
            this.djep.addStandardDiffRules();

            // coloca el nodo con una funcion preestablecida
            this.nodoFuncion = this.djep.parse(funcion);

            // deriva la funcion con respecto a x
            Node diff = this.djep.differentiate(nodoFuncion, "x");

            // Simplificamos la funcion con respecto a x
            this.nodoDerivada = this.djep.simplify(diff);

            // Convertimos el valor simplificado en un String
            funcion = this.djep.toString(this.nodoDerivada);
            System.out.println("la derivada es: " + funcion);

        } catch (ParseException e) {
            funcion = "NaN";
            System.out.println("Error: " + e.getErrorInfo());
        }
    }
}
