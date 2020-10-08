package com.metodosnumericos.diferenciacionnumerica;

import com.metodosnumericos.MetodoBiseccion;
import com.metodosnumericos.MetodoNewton;
import com.metodosnumericos.MetodoReglaFalsa;

import java.util.Scanner;

public class MenuDiferenciacionNumerica {

    public void selecionarMetodoDifNumerica() {
        System.out.println("1. Formula de diferenciacion numerica");
        System.out.println("2. Formula de los 2 puntos");
        System.out.println("3. Formula de los 3 puntos.");

        Scanner entradaEscaner = new Scanner(System.in);
        int opcionSeleccionada = Integer.parseInt(entradaEscaner.next());

        switch (opcionSeleccionada) {
            default:
                break;
        }
    }

}
