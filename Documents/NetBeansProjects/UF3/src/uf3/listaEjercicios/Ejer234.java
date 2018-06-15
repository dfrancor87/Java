/*
234. Escriu un programa que donada una paraula digui en quantes línies apareix.
Refeu l’exercici perquè us digui en quines línies apareix.
 */
package uf3.listaEjercicios;

/**
 *
 * @author Danfer
 */
import java.io.*;
import java.util.*;

public class Ejer234 {

    public static void main(String[] args) {
        String palabra = "hola";
        int cont = 0;

        try {
            //leer 
            FileReader fichero = new FileReader("234.txt");
            Scanner sc = new Scanner(fichero);

            //buscar palabra en la linea
            while (sc.hasNextLine()){
                String linea = sc.nextLine();
                Scanner sc_linea = new Scanner (linea);
                    if (palabra.equals(sc)){
                        cont++;
                    }
                }
            
            System.out.println("La palabra aparece " + cont);
            fichero.close();

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    public static boolean esta(String linea) {

        return true;
    }
}
