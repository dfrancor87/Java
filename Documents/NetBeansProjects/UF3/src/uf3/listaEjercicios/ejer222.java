/*
222. Obre un fitxer de text que conté números enters i calcula i mostra per consola
quin és el màxim valor, el mínim i la mitjana. Escriu també aquests resultats en un altre
fitxer que es digui “sortida.txt”.
 */
package uf3.listaEjercicios;

import java.io.*;
import java.util.*;
public class ejer222 {

    public static void main(String[] args) {
        //hacerlo con clase scanner
        //leer un fichero
        try {
            //apertura de fichero
            FileReader fr = new FileReader("D:\\ficheros\\eje222.txt");
            //BufferedReader br = new BufferedReader(fr);
            //almacenar el primer caracter

            int caracter = fr.read();
            //int caracter = leido - '0';
           // System.out.println("caracter = "+caracter);
            int mayor = (char) caracter;
            int menor = (char) caracter;
            int media = 0;
            int suma = 0;
            int totalNumeros = 0;

            //leemos el fichero
            while (caracter != -1) {
                //buscar el mayor y menor

                if (mayor < caracter) {
                    mayor = caracter;
                }
                if (menor > caracter) {
                    menor = caracter;
                }

                //imprimir el numero leido
                System.out.println(caracter);
                totalNumeros += 1;
                suma += caracter;
               
                //vamos al siguiente caracter            
               caracter = fr.read();
           //     caracter = leido - '0';
            }
           
            media = suma/totalNumeros;

            System.out.println("\nEl mayor es " + (char) mayor);
            System.out.println("El menor es " + (char) menor);
            System.out.println("la media es " + (char) media);

            //escribir en un fichero nuevo los resultados
            FileWriter fichero = new FileWriter("D:\\ficheros\\resultado.txt");
            PrintWriter pw = new PrintWriter(fichero);

            pw.println("El maximo es: " + (char) mayor);
            pw.println("el menor es: " + (char) menor);
            fr.close();///cerrar el fichero nuevo
            pw.close();//terminamos de escribir
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}
