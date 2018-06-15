/*
Generar un vector de 20 enteros
entre 1 y 100 de manera aleatoria
mostrar todos los valores pares del vector
 */
package uf1;

import java.util.Scanner;

/**
 *
 * @author Danfer
 *
 */
public class vectorMostrarPares {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
       // Scanner entrada = new Scanner(System.in);
        int[] vector20 = new int[20];
        for (int index = 0; index < vector20.length; index++) {
            vector20[index] = (int) (Math.random() * 100 + 1);
            if (vector20[index] % 2 == 0) {
                System.out.print(vector20[index]+" ");
            }
        }
    }

}
