package uf3;

import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Mostra com podem llegir d'un fitxer caràcter a caràcter
 * @author Administrador
 */
public class LlegirCaracters {

    public static void main(String[] args) {
        try {
            // Primer cal obrir el fitxer
            FileReader fr = new FileReader("prueba.txt");
            // Després llegim el primer caràcter
            // S'ha d'emmagatzemar en una variable de tipus int
            int caract = fr.read();
            // Es continua llegint fins a trobar el caràcter -1
            // que marca el final del fitxer
            while (caract != -1) {
                // Si hem de fer qualsevol mena de tractament el farem aquí
                // Mostrem en pantalla el caràcter llegit convertit a char
                System.out.print((char) caract);
                // Llegim el següent caràcter
                caract = fr.read();
            }
            // Tanquem el fitxer
            fr.close();
        } catch (Exception i) {
            System.out.println("Error de lectura del fitxer");
        }
    }
}

