/*
Leer una cadena de texto e indicar los numeros que 
contiene Ju12an C113
 */
package uf1;
import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class ContarNumerosString {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa para contar las cifras de una cadena");
        System.out.print("Introduce una frase");
        String frase = entrada.nextLine().toLowerCase();
        int  contadorDeNumeros;
        
        contadorDeNumeros=0;
        for(int index=0;index< frase.length(); index++){
            char letra = frase.charAt(index);
            if (letra >= '0' && letra <= '9'){
                contadorDeNumeros++;
            }
        }
        System.out.println("La frase tiene "+contadorDeNumeros+" números");
    }
    
}
