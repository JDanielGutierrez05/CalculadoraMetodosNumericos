package com.metodosnumericos.diferenciacionnumerica;

import java.util.Scanner;

public class MenuTipoDiferenciacion {

    String funcion;
    double pevaluar;
    double error;

    public void selecionarTipoMetodoDifNumerica() {

        System.out.println("Seleccione la formula a aplicar");
        System.out.println("1. Derivada de 2 puntos");
        System.out.println("2. Derivada de 3 puntos ");
        System.out.println("3. Segunda derivada ");

        Scanner entradaEscaner = new Scanner(System.in);
        int opcionSeleccionada = Integer.parseInt(entradaEscaner.next());

        switch (opcionSeleccionada) {
            case 1:
                CalcularMetodosDiferenciacionNum calculosDifNumerica = new CalcularMetodosDiferenciacionNum();
                calculosDifNumerica.calcularDerivadaDosPuntos();
                break;

            case 2:
                MenuFormulaAplicar menuFormAplicar = new MenuFormulaAplicar();
                menuFormAplicar.selecionarFormula();

            case 3:
                break;

            default:
                break;
        }
    }
}

