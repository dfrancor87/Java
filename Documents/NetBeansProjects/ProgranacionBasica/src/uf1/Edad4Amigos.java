/*
pedir la edad de 4 amigos e indicar si pueden entrar 
todos en un espectáculo.
NOTA; Podran entrar si AL MENOS 2 SON MAYORES DE EDAD
 */
package uf1;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class Edad4Amigos {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int edad1, edad2, edad3, edad4, mayores;
        mayores = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Edad de amigo1:");
        edad1 = entrada.nextInt();
        System.out.println("Edad de amigo2:");
        edad2 = entrada.nextInt();
        System.out.println("Edad de amigo3");
        edad3 = entrada.nextInt();
        System.out.println("Edad de amigo4");
        edad4 = entrada.nextInt();
        if (edad1 >= 18) {

            mayores = mayores + 1;
        }
        if (edad2 >= 18) {
            mayores = mayores + 1;
        }
        if (edad3 >= 18) {
            mayores = mayores + 1;
        }
        if (edad4 >= 18) {
            mayores = mayores + 1;
        }
        if (mayores >= 2) {
            System.out.println("pueden entrar "+mayores);
        } else {
            System.out.println("no pueden entra");
        }
    }
}
