/*
Funció recursiva que calcula el factorial d’un número.
 */
package uf2;

import java.util.*;

public class FatorialRecursivo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa que calcula el factorial");
        System.out.println("Ingresa numero: ");
        int num = entrada.nextInt();
        int res = factorial(num);
        System.out.println(res);
    }

    public static int factorial(int num) {

        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);

        }
    }

}
