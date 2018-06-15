/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioExcepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/**
 *
 * @author Danny Franco
 */
public class LlegirDominisText {

    public static void main(String[] args) {

        try {
            funcio();
        } catch (ExceptionDomini ex) {
            System.out.println("Algun domino no hace match");
        }
    }

    public static void funcio() throws ExceptionDomini {

        String regexp = ("^.*\\.(com|net|org)$");  //"\\.com|\\.org|\\.net";
        try {
            Scanner lectura = new Scanner(new File("dominis.txt"));
            while (lectura.hasNext()) {
                String domini = lectura.next();
              //  System.out.println(domini);
            //    domini.matches(regexp);
                if (Pattern.matches(regexp, domini)) throw new ExceptionDomini();
                  
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado");
        }
        

    }

}
