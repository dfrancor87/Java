/*
Funcion para determinar un numero triangular
 */
package uf2;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class NumeroTriangular {
    public static void main(String[] args) {
        System.out.println("Numero Triangular");
        System.out.print("Ingresa un numero: ");
        Scanner entrada= new Scanner (System.in);
        int num = entrada.nextInt();
        boolean resultado= numTriangular(num);
         if (resultado){
            System.out.println("Es triangular");
        }else{
            System.out.println("No es triangular");
        }
        
    }
    public static boolean numTriangular(int num) {
        int numTriangular=1, acu=2;;
        // MENOR ESTRICTO. NUMTRIANGULAR PUEDE SER MENOR O IGUAL QUE NUM 
        // NUMTRIANGULAR = 15 NUM 15 O NUMTRIANGULAR =
        while ( numTriangular < num){
            numTriangular+=acu;
            acu++;
        } 
        return numTriangular==num;   
        
    }
    
}
