package com.metodosnumericos.integracion;


import java.util.Scanner;

public class MenuSeleccionIntegracion {

    public void seleccionarMetodoIntegracion() {
        System.out.println("Seleccione el metodo de integracion a ejecutar: ");
        System.out.println("1. Metodo de Trapecio.");
        System.out.println("2. Metodo de Simpson.");

        Scanner entradaEscaner = new Scanner(System.in);
        int opcionSeleccionada = Integer.parseInt(entradaEscaner.next());

        switch (opcionSeleccionada) {
            case 1:
                MetodoDeTrapecio metodoDeTrapecio = new MetodoDeTrapecio();
                metodoDeTrapecio.calcularDatos();
                break;

            case 2:
                MetodoSimpson metodoSimpson = new MetodoSimpson();
                metodoSimpson.calcularDatos();
                break;

            default:
                break;
        }
    }
}