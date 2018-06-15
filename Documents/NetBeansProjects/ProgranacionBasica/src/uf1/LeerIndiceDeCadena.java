/*
 Pedir una cadena y luego un numero indice y mostrale
la letra de esa poscion del String
 */
package uf1;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class LeerIndiceDeCadena {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Programa mostrar el indice de una frase");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa una frase por favor:");
        String frase = entrada.nextLine();
        int index;

        System.out.println("Ingresa indice que quieres ver");
        index = entrada.nextInt();
       
        if (index <= frase.length()) {
            System.out.println("La letra que quieres ver es " + frase.charAt(index-1));
        } else {
            System.out.println("Indice incorrecto");
            
        }
    }
}
