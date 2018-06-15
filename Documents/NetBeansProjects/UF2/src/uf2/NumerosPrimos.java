/*
funcion que dado un numero enterno retorne una variable 
boleana indicando
-true - es primo
-false - no lo és
 */
package uf2;

import java.util.Scanner;
public class NumerosPrimos {
    public static void main(String[] args) {
        System.out.println("Programa para mostrar una tabla de numeros primos");
        Scanner entrada = new Scanner (System.in);
        System.out.print("Cuantos numeros primos quieres ver: ");
        int numVer=entrada.nextInt();
        int numProva=2, numPrimos=0;
        
        while(numVer < numPrimos){
            if (numeroPrimo(numProva)){
                numPrimos++;
                System.out.printf("%7d", numProva);
                if (numVer % 10==0){
                    System.out.println();
                }
            }
            numProva++;      
        }
    }
    public static boolean numeroPrimo(int num) {
        for (int i = 2; i < num; i++) {
            if (num %i == 0){
                return false;
            }
            
        }
        return false;
    }
}
