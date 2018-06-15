/*
Leer una palabra como maximo 5 letrasa e indicar cuantas 'a'
minusculas contiene.
si la palabra tiene mas de 5 letras mostrará un mensaje de error
 */
package uf1;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class Palabra {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int x, cont;
        cont = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa una palabra 5 letras como maximo: ");
        String palabra = entrada.nextLine().toLowerCase();
        x = palabra.length();//nos da el numero de letras de la palabra
        if (x > 5) {
            System.out.println("ERROR La palabra tiene mas de 5 letras");
        } else if (x == 2) {//si la palabra tiene dos letas
            if (palabra.charAt(0) == 'a') {
                cont++;
            }
            if (palabra.charAt(1) == 'a') {
                cont++;
            }
            System.out.println("Hay " + cont + " 'a' en la palabra " + palabra);
        } else if (x == 3) {
            if (palabra.charAt(0) == 'a') {
                cont++;
            }
            if (palabra.charAt(1) == 'a') {
                cont++;
            }
            if (palabra.charAt(2) == 'a') {
                cont++;
            }
            System.out.println("Hay " + cont + " 'a' en la palabra " + palabra);
        } else if (x == 4) {
            if (palabra.charAt(0) == 'a') {
                cont++;
            }
            if (palabra.charAt(1) == 'a') {
                cont++;
            }
            if (palabra.charAt(2) == 'a') {
                cont++;
            }
            if (palabra.charAt(3) == 'a') {
                cont++;
            }
            System.out.println("Hay " + cont + " 'a' en la palabra " + palabra);
        } else if (x == 5) {
            if (palabra.charAt(0) == 'a') {
                cont++;
            }
            if (palabra.charAt(1) == 'a') {
                cont++;
            }
            if (palabra.charAt(2) == 'a') {
                cont++;
            }
            if (palabra.charAt(3) == 'a') {
                cont++;
            }
            if (palabra.charAt(4) == 'a') {
                cont++;
            }
            System.out.println("Hay " + cont + " 'a' en la palabra " + palabra);
        }
    }
}

//string palabra= entrada.next; o entrada.nextLine(); .next solo para una letra y nextLine para una frase
        //palabra.length() ----> devuelve el tamaño del String
