package com.metodosnumericos;

import com.metodosnumericos.diferenciacionnumerica.MenuDiferenciacionNumerica;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Seleccione el metodo a ejecutar: ");
        System.out.println("1. Metodo de Biseccion.");
        System.out.println("2. Metodo de Regla Falsa.");
        System.out.println("3. Metodo de Newton.");
        System.out.println("4. Metodo de la secante.");
        System.out.println("5. Metodos de diferenciacion numerica.");

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

            case 3:
                MetodoNewton metodoNewton = new MetodoNewton();
                metodoNewton.calcularDatos();
                break;

            case 4:
                MetodoSecante metodoSecante = new MetodoSecante();
                metodoSecante.calcularDatos();
                break;

            case 5:
                MenuDiferenciacionNumerica menuDiferenciacionNumerica = new MenuDiferenciacionNumerica();
                menuDiferenciacionNumerica.selecionarMetodoDifNumerica();
                break;
            default:
                break;
        }
    }
}

