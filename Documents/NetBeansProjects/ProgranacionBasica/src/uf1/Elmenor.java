/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf1;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class Elmenor {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Progrma suma numeros");
        int num1, num2, num3;
        System.out.println("Ingresa número 1:    ");
        num1 = Entrada.nextInt();
        System.out.println("Ingresa número 2:    ");
        num2 = Entrada.nextInt();
        System.out.println("Ingresar número 3:   ");
        num3 = Entrada.nextInt();
        //if (num1 == num2 && num3 == num2) {
        //   System.out.println("Los numeros son iguales");
        if (num1 <= num2 && num1 <= num3) {
            System.out.println("El menor: " + num1);

        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println("EL menor es:  " + num2);
        } else {
            System.out.println("El menor es: " + num3);
        }
    }
}
