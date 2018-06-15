/*
VECTORES
funcion que reciba un vector de enteros y retorna
la diferencia maxima entre dos de sus valores

1,3,14,20 
1-20=19 difenrencia maxima

 */
package uf2;

import java.util.Scanner;

public class VectorDiferenciaMaxima {

    public static void main(String[] args) {
        int[] vector = new int[10];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 20);

        }
        mostarVector(vector);
        int dife = diferencia(vector);
        System.out.println("\n"+dife);

    }

    public static int diferencia(int vector[]) {
        int diferencia = 0, max, min;
        max = vector[0];
        min = vector[0];
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > max) {
                max = vector[i];
            }
            if (vector[i] < min) {
                min = vector[i];
            }
            diferencia = max - min;

        }
        return diferencia;
    }

    public static void mostarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + ",");
        }
    }

}
