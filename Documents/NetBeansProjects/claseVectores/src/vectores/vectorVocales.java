/*
Pedir una letra al usuario e indicarle si 
es o no vocal. Utilizar un vector con todas
las vocales para decidirlo.
 */
package uf1;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class vectorVocales {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] vectorVocales = {'a', 'e', 'i', 'o', 'u'};
        char letra;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa una letra");
        letra = entrada.next().charAt(0);
        int esVocal = 0;
        for (int index = 0; index < vectorVocales.length; index++) {

            if (letra == vectorVocales[index]) {
                esVocal = 1;
            } 

        }
        if (esVocal == 1) {
            System.out.println("es vocal");
        } 
        if (esVocal==0){
            System.out.println("no es vocal");
        }

    }

}
