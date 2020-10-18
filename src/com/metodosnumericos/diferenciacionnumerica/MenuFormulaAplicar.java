package com.metodosnumericos.diferenciacionnumerica;

import java.util.Scanner;

public class MenuFormulaAplicar {

    public void selecionarFormula() {

        System.out.println("Seleccione la formula a aplicar");
        System.out.println("1. Formula 1");
        System.out.println("2. Formula 2");
        System.out.println("3. Formula 3 ");

        Scanner entradaEscaner = new Scanner(System.in);
        int opcionSeleccionada = Integer.parseInt(entradaEscaner.next());
        CalcularMetodosDiferenciacionNum calculosDifNumerica = new CalcularMetodosDiferenciacionNum();
        switch (opcionSeleccionada) {
            case 1:
                calculosDifNumerica.calcularDerivadaTresPuntosF1();
                break;
            case 2:
                calculosDifNumerica.calcularDerivadaTresPuntosF2();
                break;
            case 3:
                calculosDifNumerica.calcularDerivadaTresPuntosF3();
                break;

            default:
                break;
        }
    }

}

