/*
Leer 3 números naturales e indicar si se puede formar
con ellos un triángulo.
 */
 /*
 Un lado de un triángulo es menor que la suma de los otros dos y mayor que su diferencia.
 (cada lado tiene que ser menor que de las otras dos).
 */
package uf1;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class Triangulos {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c;
        System.out.println("Ingresa lado A: ");
        a = entrada.nextInt();
        System.out.println("Ingresa lado B: ");
        b = entrada.nextInt();
        System.out.println("Ingresa lado C: ");
        c = entrada.nextInt();
        if (((a - c) < b) && (b < (a + c))) {
            System.out.println("Es un triangulo");
        } else {
            System.out.println("No es un triangulo");
            
        }
    }

}
