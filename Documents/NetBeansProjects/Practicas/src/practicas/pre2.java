/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;

/**
 *
 * @author Danfer
 */
import java.util.*;
public class pre2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int [] vector = new int [5];
        int min, max;
        for (int i = 0; i < vector.length; i++) {
            vector[i]= (int)(Math.random ()*10);
            System.out.print(vector[i]+" ");
        }
        
        
        System.out.println("ingresa valor min");
        min= entrada.nextInt();
        System.out.println("ingresa valor max");
        max = entrada.nextInt();
        
        if (min>max){
            int aux=min;
            min=max;
            max=aux;
        }
        int resul=fueraRango (vector, min, max);
        System.out.println(resul);
    }
    public static int fueraRango(int[] vector, int min, int max){
        int cont=0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]< min || vector[i]>max){
                cont++;
            }
            
        }
        return cont;
    }
}
