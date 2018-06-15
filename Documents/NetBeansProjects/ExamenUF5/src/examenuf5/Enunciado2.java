/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenuf5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Danny Franco
 */
public class Enunciado2 {

    public static void main(String[] args) {
        File lectura = new File("palabras.txt");
        Scanner lee;
        try {
            lee = new Scanner(lectura);
            while (lee.hasNext()) {
                String palabra = lee.next();
                System.out.println(palabra);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }

    }
}
