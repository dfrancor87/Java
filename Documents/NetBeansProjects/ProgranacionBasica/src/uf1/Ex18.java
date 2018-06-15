/*
 28 Llegir un número i dir si és múltiple de dos, de tres, de tots dos o de cap dels dos.   
 */
package uf1;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class Ex18 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, multiplo2, multiplo3;
        System.out.println("Introduce un número");
        num = entrada.nextInt();
        //Verificar si es múltiplo de 2 y de 3
        multiplo2 = num % 2;
        multiplo3 = num % 3;
        //Hacemos las comapraciones
        if (multiplo2 == 0 && multiplo3 == 0) {
            System.out.println("El número " + num + " es múltiplo de 2 y de 3");
        } else if (multiplo2 == 0) {
            System.out.println("El número " + num + " es múltiplo de 2");

        } else if (multiplo3 == 0) {
            System.out.println("El número " + num + " es múltiplo de 3");
        } else {
            System.out.println("El número " + num + " no es múltiplo de 2 ni de 3");
        }

    }

}
