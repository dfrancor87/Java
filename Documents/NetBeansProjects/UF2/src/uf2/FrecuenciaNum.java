/*
163. Feu una funció que li passis un vector de 100 enters i un número i retorni quantes
vegades apareix el número en el vector.
 */
package uf2;

import java.util.Scanner;

public class FrecuenciaNum {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vector100 = new int[100];
        int num;
        System.out.println("Programa que muestra la frecuencia\nde un numero en el vector\n\n");
        //pedir numero al usuario
        //respetar el rango
        do {
            System.out.println("Ingresa un número y te diré su frecuencia en el vector");
            System.out.println("El número tiene que ser entre 0 y 9");
            num = entrada.nextInt();
        } while (num < 0 || num > 9);
        //Variable de numero de veces que se repite el numero en el vector
        //llama a la funcion
        int repeticiones = llenarVector(vector100, num);
        System.out.println("\nEl número " + num + " se ha repetido " + repeticiones + " veces en el vector");

    }

    public static int llenarVector(int[] vector, int num) {
        int cont = 0;
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
            //System.out.print(vector[i]+" ");
            if (num == vector[i]) {
                cont++;
            }

        }
        return cont;

    }
}
