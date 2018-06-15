/*
Hacer una funcion que rellene un vector de valores aletorios
entre los limites indicados 
psv rellenaVector (int [] nums, int min, int max)
 */
package uf2;

import java.util.Scanner;

public class LlenarVectorConLimites {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("PROGRAMA VECTOR CON LIMITES");
        int[] vector = new int[10];
        int min, max;
        System.out.print("Ingresa primer limite del vector: ");
        min = entrada.nextInt();
        System.out.print("Ingresa segundo limite del vector (mayor que el anterior): ");
        max = entrada.nextInt();
        if (min > max) {
            int aux = min;
            min = max;
            max = aux;
        }
        llenarVector(vector, min, max);
    }

    public static void llenarVector(int[] vector, int min, int max) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * (max - min) + min);
            System.out.print(vector[i] + " ");

        }

    }
}
