/*
77. Escriu un programa que, donat un enter positiu n, mostri “triangles” de mida n.
Exemple: si n=4, mostrarà
*
**
***
****
si n=6, mostrarà
*
**
***
****
*****
******
 */
package uf1;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class triangles {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont, num;
       
        System.out.println("Ingrea un número");
        num = entrada.nextInt();//3
        for (cont = 1; cont <= num; cont++) {
            
            for (int cont2 = 1; cont2 < cont + 1; cont2++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
