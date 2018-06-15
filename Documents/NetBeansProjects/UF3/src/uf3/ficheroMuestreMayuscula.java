/*
Hacer un programa en java que lea un fichero de texto
y lo muestre por pantalla en mayuscula
 */
package uf3;

import java.io.*;
import java.util.*;

/**
 *
 * @author Danfer
 */
public class ficheroMuestreMayuscula {

    public static void main(String[] args) {
        try {
            //abrir  el fichero
            FileReader fr = new FileReader("D:\\ficheroMuestraMayuscula.txt");
            //almacenar el caracter en una variable int
            int caracter = fr.read();
            while (caracter != -1){
                char mayus = (char) caracter;
                int letra;
                if (mayus >= 'a' && mayus <='z') {
                    letra = 'A' +(caracter -'a');
                }
                else {
                    letra = mayus;
                }
                System.out.print( (char)letra);
                
                caracter = fr.read();
            }
            //cerrar el fichero
            fr.close();
        } catch (Exception e) {
            System.out.println("Se ha producido un error ");
        }

    }

}
