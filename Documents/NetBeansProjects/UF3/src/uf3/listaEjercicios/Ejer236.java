/*
236. Donat un fitxer de text, creeu un altre fitxer que només contingui les línies
senars (1,3,5, 7…)
 */
package uf3.listaEjercicios;

import java.io.*;
import java.util.*;

public class Ejer236 {

    public static void main(String[] args) {

        try {
            //leer fichero
             int cont = 1;
            FileReader fichero = new FileReader("236.txt");
            FileWriter nuevoFichero = new FileWriter("impares.txt", true);//declara nuevo fichero
            PrintWriter pw = new PrintWriter(nuevoFichero); //nuevo fichero
            Scanner sc = new Scanner(fichero);//para leer el fichero 
           
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();             
                //crear fichero
                if (cont % 2 == 1) {
                    System.out.println(linea);
                    pw.print(linea + " ");
                }
                cont++;
            }
            pw.println();
            nuevoFichero.close();
            pw.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
