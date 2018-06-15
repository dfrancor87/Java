/*

*Función que nos diga si el String recibido 
es un palíndramo.
 */
package uf2;

import java.util.Scanner;


public class Palindromo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Ingresa una frase: ");
        String frase = entrada.nextLine();
        // dejar sin espacios a la frase original
        String nuevaFrase = sinEspacios(frase);
        //declarar otra variabla para poder comparar las dos frases
        
        String frasePalindromo = esPalindromo(nuevaFrase);
        System.out.println("Frase 1:"+ nuevaFrase);
        System.out.println("Frase 2:"+ frasePalindromo);
        
        if (nuevaFrase.equals(frasePalindromo)){
            System.out.println("La frase es palindromo ");
            
        }else {
            System.out.println("No es palindromo");
        }
        
    }
    //dejar sin espacios la Frase original
   public static String sinEspacios(String frase2) {
        String nuevaFrase = "";
        for (int i = 0; i < frase2.length(); i++) {
            if (frase2.charAt(i) != ' ') {
                nuevaFrase = nuevaFrase + frase2.charAt(i);
            }
        }
        return nuevaFrase;
    }
    public static String esPalindromo(String frase) {
        String nuevaFrase="";
        for (int i = frase.length()-1; i >=0; i--) {
            nuevaFrase +=frase.charAt(i);
            
        }
        return nuevaFrase ;
        
    }
}
