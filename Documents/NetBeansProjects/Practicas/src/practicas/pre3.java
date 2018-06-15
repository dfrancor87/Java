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
public class pre3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        char [] vector  = new char [10];
        for (int i = 0; i < vector.length; i++) {
            int x= (int)(Math.random()*2);
            if (x==0){
                vector[i]= (char)(Math.random()*('z' - 'a')+'a');
                System.out.print(vector[i]+" ");
            }else{
                vector[i]=(char)(Math.random()*('Z' - 'A')+'A');
                 System.out.print(vector[i]+" ");
            }            
        }
        System.out.println("Escribe una letra");
        char letra=entrada.next().charAt(0);
        char resul = muestraLetra(vector, letra);
        System.out.println(resul);
    }
    public static char muestraLetra (char [] vector, char letra){
        for (int i = 0; i < vector.length; i++) {
            if(vector[i]== letra && i == vector.length-1){
                return vector[0];
                
            }else if (vector[i]== letra){
                return vector[i+1];                
            }
 
        }
         return '0';
    }
    
}
