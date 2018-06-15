package vectores;

import java.util.Scanner;

/**
 * Indica si la lletra introduida per l'usuari és una vocal
 * @author carlos
 */
public class LetraVocal {
    public static void main(String[] args) {
        char [] vocales = {'a','e','i','o','u','A','E','I','O','U'};
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa que et diu si la teva lletra és una vocal !");
        System.out.print("Introdueix una lletra: ");
        char lletra = entrada.next().charAt(0);
        
        int n=0;
        while (n<vocales.length && vocales[n] != lletra) {
            n++;
        }
        // Com sabem si la hem trobat ?
        if (n != vocales.length) {
            System.out.println("La lletra '"+lletra+"' és una vocal !");
        }
        else {
            System.out.println("La lletra '"+lletra+"' NO és una vocal !");
        }
    }
}
