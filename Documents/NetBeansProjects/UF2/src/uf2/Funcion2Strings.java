/*
funcion que reciba 2 Strings y retorne el indice donde se ha encontado la primera
diferencia si son exactamente iguales retorna (-1)
ps int indiceDiferen (String cad1, string cad2)
 */
package uf2;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class Funcion2Strings {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa que encuentra difenrencias");
        System.out.println("Ingresa una frase:");
        String frase1 = entrada.nextLine();
        System.out.println("Ingresa otra frase:");
        String frase2 = entrada.nextLine();
        int indice = indexDife(frase1, frase2);
        System.out.println("la diferencia " + indice);

    }

    public static int indexDife(String f1, String f2) {
        int i = 0, indice = 0;
        if (f1.equals("hola")) {
            indice = f1.length() - 1;
        } else {
            while (i < f1.length()) {
                i++;
            }
            indice = i;
        }
       
        return indice;
    }

}
