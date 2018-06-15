/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenuf3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class Pregunta3 {
    public static void main(String[] args) {
        try {
            FileReader fichero = new FileReader ("paraules.txt");//leer
            Scanner sc = new Scanner (fichero);//leer
            FileWriter nuevoFichero = new FileWriter("nomal.txt");
            PrintWriter pw = new PrintWriter(nuevoFichero);
            
            System.out.println("Las siguientes lineas se guardaran en el fichero\n\n");
            while (sc.hasNextLine()){
                String linea = sc.nextLine();
              
                if (linea.length() <= 50 && linea.length() >= 15){
                    System.out.println(linea+" ");
                    pw.print(linea);//guardamos la linea en normal.txt
                    pw.println();//añadimos salto de linea                                                      
                }
            }
            nuevoFichero.close();
            pw.close();
            System.out.println("\n\nFichero creado");
            
        }catch (Exception e){
            System.out.println(e);
        }
        
    }
    
}
