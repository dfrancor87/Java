/*
*Función que reciba un String, le de la vuelta y lo devuelva
exemple:
Hola ----> aloH
 */
package uf2;

import java.util.Scanner;

public class FraseAlReves {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        String frase = entrada.nextLine();
        String resultado = daLaVuelta(frase);
        System.out.println(resultado);
    }

    public static String daLaVuelta(String frase2) {
        String nuevaFrase = "";
        for (int i = frase2.length() - 1; i >= 0; i--) {
            nuevaFrase = nuevaFrase + frase2.charAt(i);

        }
        return nuevaFrase;
    }
}
