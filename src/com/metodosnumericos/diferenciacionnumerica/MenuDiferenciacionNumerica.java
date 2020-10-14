package com.metodosnumericos.diferenciacionnumerica;

import java.util.Scanner;

public class MenuDiferenciacionNumerica {

    MenuTipoDiferenciacion menuTipoDiferenciacion = new MenuTipoDiferenciacion();

    public void selecionarMetodoDifNumerica() {
        System.out.println("Seleccione el tipo de entrada");
        System.out.println("1. Para ingresar la tabla de datos");
        System.out.println("2. Para ingresar la formula ");

        Scanner entradaEscaner = new Scanner(System.in);
        int opcionSeleccionada = Integer.parseInt(entradaEscaner.next());

        switch (opcionSeleccionada) {
            case 1:
                menuTipoDiferenciacion.selecionarTipoMetodoDifNumerica();
                break;

            case 2:
                menuTipoDiferenciacion.selecionarTipoMetodoDifNumerica();
                break;

            default:
                break;
        }
    }

}
