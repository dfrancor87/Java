/*
Fer una funció que rebi dos vectors d'enters i retorni la diferència màxima que hi ha
entre dos dels elements (el primer d'un vector i el segon de l'altre).
 */
package uf2;

public class MaximaDiferencia2Vectores {

    public static void main(String[] args) {
        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = (int) (Math.random() * 20);
            System.out.print(vector1[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < vector2.length; i++) {
            vector2[i] = (int) (Math.random() * 20);
            System.out.print(vector2[i] + " ");
        }
        int maxDife = diferencia(vector1, vector2);
        System.out.println("\nLa diferencia maxima es: " + maxDife);
    }

    public static int diferencia(int[] v1, int[] v2) {
        int min = v1[0], max = v2[0];
        for (int i = 0; i < v1.length; i++) {
            if (v1[i] < min) {
                min = v1[i];
            }
        }
        for (int i = 0; i < v2.length; i++) {
            if (v2[i] > max) {
                max = v2[i];
            }
        }

        return max - min;
    }
}
