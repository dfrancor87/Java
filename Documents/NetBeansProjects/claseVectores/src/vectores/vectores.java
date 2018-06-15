/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class vectores {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] vector = {2, 3, 5, 6, 7, -2, 8, 9, 10};
        int menor, mayor;
        menor = 999999999;
        mayor = -99999999;
        for (int index = 0; index < vector.length; index++) {
            if (vector[index] < menor) {
                menor = vector[index];
            }
            if (vector[index] > mayor) {
                mayor = vector[index];
            }
        }
        System.out.println("El menor es " + menor);
        System.out.println("El mayor es " + mayor);
    }
}