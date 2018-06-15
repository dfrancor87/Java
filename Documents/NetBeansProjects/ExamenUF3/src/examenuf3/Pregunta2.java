/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenuf3;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Danfer
 */
public class Pregunta2 {

    public static void main(String[] args) {
        String[] palabras = {"Hola", "Felicitat", "Esperança", "Sinceridad", "Modernidat", "Actualitat", "Demati", "Tarda", "Nit", "La", "Es", "Era", "Al"};
        int numeroLineas = (int) (Math.random() * (40 - 10 + 1) + 10);//numero de lineas que tendras el fichero
        System.out.println("El fichero tendra " + numeroLineas + " lineas");//numero de lineas del fichero
        System.out.println("=====Esto se guardará en el fichero=============");
        int contLinea = 0; // para el while de numero de lineas 

        try {
            FileWriter nuevoFichero = new FileWriter("paraulas2222.txt");
            PrintWriter pw = new PrintWriter(nuevoFichero);
           
            while (contLinea < numeroLineas) {
                int numAletarioPalabras = (int) (Math.random() * 10) + 1;// palabras que deben de haber en una linea
                String linea = generaLinea(palabras, numAletarioPalabras);//la funcion recibe el vector palabras y el numero de palabras que tendrá la linea
                System.out.println(linea);
                contLinea++;
                pw.print(linea);
                pw.println();
                
            }
            nuevoFichero.close();
            pw.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
//funcion que genera una linea con 1 o 10 palabras de l vector
    public static String generaLinea(String[] palabras, int numAletarioPalabras) {
        String linea = "";//linea a concatenar
        int contpalabras = 0;
        while (contpalabras < numAletarioPalabras) {
            //numero aleatorio para el vector
            int index = (int) (Math.random() * 13);
            linea += palabras[index] + " ";
            contpalabras += 1;
        }
        return linea;
    }
}
