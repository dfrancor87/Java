/*
185. Escriu una funció que rep una frase i mostra per pantalla, separades per salt de línia
totes les paraules de la frase. Es considera paraula allò separat per espais, tabuladors
o salts de línia.
void separarFrase(String frase);
 */
package uf2;

/**
 *
 * @author Danfer
 */
import java.util.*;

public class PalabrasRepetidasCadena {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa una frase");
        String frase = entrada.nextLine();
        separaFrase(frase);

    }
    public static void separaFrase(String frase) {
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') {
                System.out.print(frase.charAt(i));
            } else {
                System.out.println("");
            }

        }
    }

}
