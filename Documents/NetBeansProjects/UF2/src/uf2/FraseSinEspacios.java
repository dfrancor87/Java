/*
*Función que reciba un String y lo devuelva eliminado espacion
 */
package uf2;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class FraseSinEspacios {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        String frase = entrada.nextLine();
        String respuesta = sinEspacios(frase);
        System.out.println(respuesta);
    }

    public static String sinEspacios(String frase2) {
        String nuevaFrase = "";
        for (int i = 0; i < frase2.length(); i++) {
            if (frase2.charAt(i) != ' ') {
                nuevaFrase = nuevaFrase + frase2.charAt(i);
            }
        }
        return nuevaFrase;
    }
}
