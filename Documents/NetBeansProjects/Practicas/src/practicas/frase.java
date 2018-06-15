/*
*Función que reciba un String, le de la vuelta y lo devuelva
exemple:
Hola ----> aloH.
 */
package practicas;

/**
 *
 * @author Danfer
 */
import java.util.*;

public class frase {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingresa una frase");
        String frase = entrada.nextLine();
        String resultado = vueltaFrase (frase);
        System.out.println(resultado);
        //frase sin espacios
        String sinEspacios = sinEspacios (frase);
        System.out.println(sinEspacios);
    }
    public static String vueltaFrase (String frase){
        String resultado="";
        for (int i = frase.length()-1; i >= 0; i--) {
            resultado+= frase.charAt(i);
            
        }
        return resultado;
    }
    public static String sinEspacios (String frase){
        String resul="";
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i)!=' '){
                resul+=frase.charAt(i);
            }
            
        }
        return resul;
    }
    
}
