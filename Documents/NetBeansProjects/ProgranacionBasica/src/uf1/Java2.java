package uf1;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class Java2 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("Introdueix tres números n1,n2 i n3");
        System.out.println("Et mostraré el resultat de: (n1+n2)/n3");
        System.out.print("Número 1: ");
        n1 = entrada.nextInt();
        System.out.print("Número 2: ");
        n2 = entrada.nextInt();
        System.out.print("Número 3: ");
        n3 = entrada.nextInt();
        // En aquest segon exemple calculem el resultat prèviament a la variable resultat
        int resultat = (n1 + n2) / n3;
        System.out.println("El resultat és: " + resultat);
    }
}
