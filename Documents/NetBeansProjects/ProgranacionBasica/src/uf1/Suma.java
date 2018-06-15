//Hacer un programa que pida 2 números y muestre el mayor
package uf1;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class Suma {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Progrma suma numeros");
        int num1, num2, suma;
        System.out.println("Ingresa número 1:    ");
        num1 = Entrada.nextInt();
        System.out.println("Ingresa número 2:    ");
        num2 = Entrada.nextInt();
        
        System.out.println("La suma es: "+(num1+num2));
        System.out.println("La resta es: "+(num1-num2));
        System.out.println("La producto es: "+(num1*num2));
        System.out.println("La division es: "+(num1/num2));
        System.out.println("el residuo es: "+(num1%num2));
  

    }

}

