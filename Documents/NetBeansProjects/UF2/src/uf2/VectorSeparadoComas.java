/*
funcion que muestre un vector de enteros 
separados por una coma 
psv mostrarvector
 */
package uf2;

import java.util.Scanner;

public class VectorSeparadoComas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Programa mostar vector separado por comas");
        int [] vector = new int [10];
        muestraVector(vector);
        
        
    }
    public static void muestraVector (int []vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int)(Math.random()*100);
            System.out.print(vector[i]+",");
            
            
        }
        System.out.println("\b");
    }
}
