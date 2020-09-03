package com.metodosnumericos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Seleccione el metodo a ejecutar: ");
        System.out.println("1. Metodo de Biseccion.");
        System.out.println("2. Metodo de  de Regla Falsa.");

        Scanner entradaEscaner = new Scanner(System.in);
        int opcionSeleccionada = Integer.parseInt(entradaEscaner.next());

        switch (opcionSeleccionada) {
            case 1:
                MetodoBiseccion metodoBiseccion = new MetodoBiseccion();
                metodoBiseccion.calcularDatos();
                break;

            case 2:
                MetodoReglaFalsa metodoReglaFalsa = new MetodoReglaFalsa();
                metodoReglaFalsa.calcularDatos();
                break;

            default:
                break;
        }
    }
}

