/*
*funcion que reciba un String y lo muestre sin vocales
+FUNCION MAIN
 */
package uf2;
import java.util.*;
public class stringSinVocales {
    public static void sinVocales(String frase) {     
        int cont=0;
        while (cont<frase.length()){
            if (frase.charAt(cont)!= 'a' && frase.charAt(cont)!= 'e' && frase.charAt(cont)!= 'i' && frase.charAt(cont)!= 'o'  && frase.charAt(cont)!= 'u'   ){                                        
            System.out.print(frase.charAt(cont));  
            }
            cont++;
        } 
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa una frase");
        String frase = entrada.nextLine().toLowerCase();
        sinVocales(frase);
        
    }
}
