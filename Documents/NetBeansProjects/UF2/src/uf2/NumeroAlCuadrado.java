/*
Hacer una funcion que calcule y "retorne" el cuadrado
del valor de un entero recibido (Parametro). siguiendo el sgt 
criterio
N^2 = N1+N2+N3
1 a la 2= 1
2 a la 2 = 4 = 1+3
3 a la 2 = 9 = 1+3+5
4 a la 2 = 16 = 1+3+5+7
 */
package uf2;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class NumeroAlCuadrado {
    public static void main(String[] args) {
        System.out.println("Programa calcula el cuadrado");
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int num1 = entrada.nextInt();
        int resultado=cuadrado(num1);
        System.out.println(num1+" al cuadrado es: "+resultado);
        System.out.println("***********************");
        System.out.println("MOSTAR TODOS LOS CUADRADOS");
        int [] cuadradoVector = cuadradoVector(num1);
        for (int i = 0; i < cuadradoVector.length; i++) {
            System.out.print(cuadradoVector[i]+" ");
            
        }
    }
    //FUNCION QUE DEVUELVE EL CUADRADO DE UN NUMERO
    public static int cuadrado (int num1){
        int cont=0, suma=1, resultado=0;
        while(cont<num1){
            resultado=resultado+suma;
            suma +=2;
            cont++;
        }
        return resultado;
                
    }
    //FUNCION QUE DEVUELVE UN VECTOR
    public static int [] cuadradoVector(int num1){
        int [] vector =new int [num1];
        int suma=1, resultado=0;
        for(int i=0; i < vector.length; i++){
            resultado=resultado+suma;
            vector[i]= resultado;
            suma+=2;
            
        }
        
        return vector;
    }
    
    
}
