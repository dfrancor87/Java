//Hacer un programa que pida 2 números y muestre el mayor
package uf1;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class SumaNumeros {

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
        if (num1 >= num2 && num1 >= num3)  {
            System.out.println("El mayor: " + num1);

        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("EL mayor es:  " + num2);
        } else {
            System.out.println("El mayor es: "+ num3);
        }

    }

}

