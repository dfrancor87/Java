/*
 Generar dos valores aleatorios MIN y MAX, 
 pedir al usuario un número 
 entre esos dos limites y mostrar un mensaje de los 3 posibles:
 *Número correto (entre los dos limites)
 *Número demasiado pequeño
 *Número demasiado grande
 */
package uf1;
import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class AleatorioMinMaz {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int min, max, aux;
        min =(int) (Math.random()*5000+1);//el 1 es el minimo 
        max= (int) (Math.random()*5000+1);
        if (min > max){
            aux=min;
            min=max;
            max=aux;
        }
       // System.out.println(" este numero es min "+min);
        //System.out.println(" este numero es max "+max);
        // numaleatorio =(int) (Math.random()*(max - min+1)+min);
        
       // 
        System.out.println("ingresa un numero: ");
        aux = entrada.nextInt();
        if(aux>=min && aux<=max){
            System.out.println("El número "+aux+" esta entre "+min+" y "+max);
        }
        else if (aux<min){
            System.out.println("El número "+aux+" es mas pequeño que "+min);
        }
        else if (aux>max){
            System.out.println("El número "+aux+" es más grande que "+max);
        }
        System.out.println("El rango es "+min+" hasta "+max);
        
        
        
    }
    
}
