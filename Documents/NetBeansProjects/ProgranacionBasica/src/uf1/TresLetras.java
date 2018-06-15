/*
Leer 3 letras del usuario e indicar cuantas repeticiones hay
 */
package uf1;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class TresLetras {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa 3 letras");
        String letras = entrada.next();
        char letra1, letra2, letra3;
        letra1 = letras.charAt(0);
        letra2 = letras.charAt(1);
        letra3 = letras.charAt(2);
        if (letra2 == letra1 || letra2 == letra3) {
            System.out.println("Se repiten 3 letras");
        } else if (letra1 == letra2 || letra1 == letra3) {
            System.out.println("Se repiten 2 letras ");
        } else if (letra1 == letra2 && letra2==letra3){
            System.out.println("Se repiten 3");
        }
        else {
            System.out.println("no se repiten");
        }

    }
}
