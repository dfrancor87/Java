/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenuf3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Danfer
 */
import java.util.NoSuchElementException;
public class Pregunta1 {
    public static void main(String[] args)  {
       //leer
       try{
           
           FileReader fichero = new FileReader("LeetSpeakDannyFranco.java");
            Scanner sc = new Scanner(fichero);
            
            int contIf=0;
            while  (sc.hasNext()){
               String linea = sc.nextLine();
            
                if (sc.next().toLowerCase().equals("if")){
                    
                    contIf++;
                }
            }
            System.out.println("Hay un total de "+contIf+" if's");
           
       } catch (Exception e) {
            System.out.println("No se encuentra el Archivo");
       }
        
        
    }
    
}
