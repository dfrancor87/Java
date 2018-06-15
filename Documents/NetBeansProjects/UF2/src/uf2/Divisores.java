/*

*funcion que dado un numero entero muestre sus divisores

lo mismo pero que ademas retorne
el numero de contadorDivisores que ha encontrado
==============================================
No muestra nada sino que retorna un String
con la lista de los contadorDivisores separado por comas
*****************
No muestra nada sino que retorna un 
vector con todos los contadorDivisores 
 */
package uf2;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class Divisores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa que muestre los divisores de un numero ingresa");
        System.out.print("Ingresa un número: ");
        int num = entrada.nextInt();
        System.out.println("\n*********1*************");
        muestraDivisores(num);

        System.out.println("\n*********2*************");
        int contadorDivisores = divisores(num);

        System.out.println("Hay " + contadorDivisores + " divisores");

        System.out.println("\n*********3*************");
        String lista = lista(num);

        System.out.println("\n*********4*************");
        int[] vectorDivisores = vectorDivisores(num);
        for (int i = 0; i < vectorDivisores.length; i++) {
            System.out.print(vectorDivisores[i] + ",");

        }
        System.out.print("\b");
    }

    public static void muestraDivisores(int num) {
        int divisor = num;
        while (divisor > 0) {
            if (num % divisor == 0) {
                System.out.println(divisor + " Es divisble para " + num);
            }
            divisor--;
        }

    }

    public static int divisores(int num) {
        int divisor = num, cont = 0;
        while (divisor > 0) {
            if (num % divisor == 0) {
                cont++;
            }
            divisor--;
        }
        return cont;

    }

    /* return Lista*/
    public static String lista(int num) {
        int divisor = num;
        String lista = "";
        while (divisor > 0) {
            if (num % divisor == 0) {
                lista = lista + divisor + ',';
            }
            divisor--;
        }
        return lista;

    }

    public static int[] vectorDivisores(int num) {
        int divisor = num;
        int[] vectorDivisores = new int[divisores(num)];//llamar a la funcion para saber la dimension del vector
        // for (int i = 0; i < vectorDivisores.length; i++) {
        int i = 0;
        while (divisor > 0 && i < vectorDivisores.length) {
            if (num % divisor == 0) {
                vectorDivisores[i] = divisor;
               i++;
            }
            
            divisor--;

        }

        return vectorDivisores;
    }
}
