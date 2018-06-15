/*
Hacer un programa que pida una cadena de texto
string y muestre solo las vocales
jaime
aie
 */
package uf1;
import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class stringMuestreSoloVocales {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa una frase.");
        String frase = entrada.nextLine();
        int index=0;
        
        while (index< frase.length()){
            if (frase.charAt(index)=='a' ||frase.charAt(index)=='e'){
                System.out.println(frase.charAt(index));
                
                
            }
            index++;
        }
        
    }
    
    
}
