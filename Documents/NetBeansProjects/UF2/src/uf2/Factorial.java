/*

hacer una funcion que calcule el Factorial del valor recibido
public static int Factorial (int)
 */
package uf2;

import java.util.*;

public class Factorial {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa factorial");
        System.out.println("Ingresa un numero y te diré su factorial");
        int num = entrada.nextInt();
        int resultado = factorial(num);
        System.out.println("El factorial de " + num + " es: " + resultado);

    }

    public static int factorial(int num) {
        int fac=1;
        if (num == 0) {
            return fac = 1;
        } else {
            for (int i = 1; i <= num; i++) {
             fac=fac*i;                               
            }            
        }
        return fac;
    }

}
