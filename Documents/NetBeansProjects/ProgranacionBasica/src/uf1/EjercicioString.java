package uf1;

import java.util.Scanner;

/**
 *
 * @author alum-01
 */
public class EjercicioString {
 
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduceme una palabra y te diré cuantas consonantes tiene: ");
        String palabra = entrada.nextLine().toLowerCase();
        int x;
        int consonante = 0;
        for (x = 0; x < palabra.length(); x++) {
            char l = palabra.charAt(x);
            if (l != 'a' && l != 'e' && l != 'i' && l != 'o' && l != 'u' && l != ' ') {
                  consonante++;
            }

        }
        System.out.println("Tu palabra tiene " + consonante + " consonantes.");
    }
}
