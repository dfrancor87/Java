/*
*Funcion que reciba un vector de enteros
y retorne el elemento mayot de los que
contenga (Si hay 2 o mas iguales uno cualquiera)
 */
package uf2;

import java.util.Scanner;

public class ElementoMayor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Programa que retorne elemeto mayor\n");
        System.out.print("Dimension del vector?: ");
        int dimension = entrada.nextInt();
        int[] vector = new int[dimension];

        llenaVector (vector); //llena el vector
        mostrarVector (vector); // muestra valores del vector                 
        int valorMayor = valorMayor(vector);
        System.out.println("El mayor es " + valorMayor);
        
    }
    public static void llenaVector(int[] vectorAux) {
      for (int i = 0; i < vectorAux.length; i++) {
            vectorAux[i] = (int) (Math.random() * 10);
        }
        
    }
    public static void mostrarVector(int[]vectorAux){
        for (int i = 0; i < vectorAux.length; i++) {
            System.out.print(vectorAux[i]+"  ");
            
        }
        System.out.println("");
        
    }
    public static int valorMayor(int[] vectorAux) {
        int mayor = vectorAux[0];
        for (int i = 1; i < vectorAux.length; i++) {
            if (vectorAux[i] > mayor) {
                mayor = vectorAux[i];
            }
        }
        return mayor;
    }

}
