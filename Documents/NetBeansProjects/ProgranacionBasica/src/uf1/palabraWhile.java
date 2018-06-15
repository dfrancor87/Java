/*
*HACER UN PROGRAMA QUE PIDA UNA PALABRA Y CUENTE LAS VOCALES 
* QUE TIENE A E I O U
*
*/
package uf1;
import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class palabraWhile {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa una palabra:");
      /*  String palabra = entrada.nextLine(). ;// lee toda la línea*/
       String palabra = entrada.next().toLowerCase(); // Se lee solo hasta el espacio
       
       int cont =0;
       int indice=0;
         
       while (indice < palabra.length()){//palabra.length nos da la longuitud de una palabra
           if (palabra.charAt(indice)=='a' || palabra.charAt(indice)=='e' || palabra.charAt(indice)=='i' || palabra.charAt(indice)=='o' || palabra.charAt(indice)=='u' ){
               cont++;   
           }
           indice++;
       }
        System.out.println("Tiene "+cont+" vocales");
    }
    
}
