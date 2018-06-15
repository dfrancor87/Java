/*
vector de 10 enteros 
llenarlo por teclado
mostrarlo por pantalla
decir si es estrictamente creciente
 */
package vectores;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class creciente {

    public static void main(String[] args) {
        int[] vector = new int[5];
        Scanner entrada = new Scanner(System.in);
        //recorrido para llenar
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingresa un numero:");
            vector[i] = entrada.nextInt();
        }
        //Mostrar el vector
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + ",");

        }
        System.out.println("\b");
        // Recorrer el vector 
        int i = 0;
        while (i < vector.length-1 && vector[i] < vector[i+1]) {
            i++;
            
        }
        
        if (i == vector.length-1) {
            System.out.println("Es creciente"+ (vector.length-1));
        } else {
            System.out.println("No Es creciente");
        }

    }

}
