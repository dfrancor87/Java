/*
Funcion que reciba un String y cuente cuantas
b's o v's contiene y lo retorne (tambien las mayúsculas)
ps int contarBs(String cade);

 */
package uf2;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class ContarBs {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa que cuenta las b's");
        System.out.println("Ingresa una frase");
        String frase = entrada.nextLine();
        int contadorBs = contadorBs(frase);
        System.out.println("Hay "+contadorBs);
    }

    public static int contadorBs(String frase) {

        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'v' || frase.charAt(i) == 'V' || frase.charAt(i) == 'b' || frase.charAt(i) == 'B') {
                cont++;
            }
        }
        return cont;
    }
}
