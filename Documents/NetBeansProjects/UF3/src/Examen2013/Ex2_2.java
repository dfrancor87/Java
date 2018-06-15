package Examen2013;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * 2. (2.5 punts) Escriu un programa (Ex2.java) que obri dos fitxers de text plens de
 * números i generi un tercer fitxer que sigui la fusió ordenada de tots dos, sense
 * repetits.
 * Exemple.
 * si el primer fitxer conté: 2 2 3 4 5 1 7 34 12 7 8
 * i el segon fitxer conté: 1 1 3 4 7 12 3 5 8 9
 * el fitxer resultant haurà de contenir: 1 2 3 4 5 7 8 9 12 34
 * Notes: els fitxers poden contenir diverses línies, només contenen números enters
 * i, com a màxim contindran 100 números. Els noms dels fitxers es poden posar
 * per codi. Es recomana ordenar.
 *
 * 
 * Aquesta no és una solució massa estàndard però funciona.
 * Si els números són molt grans es perd molta memòria
 * També treballa amb valors negatius.
 * @author carlos
 */
public class Ex2_2 {

    public static void main(String[] args) {

        File fitxer = new File("Ex2_1.txt");
        File fitxer2 = new File("Ex2_2.txt");
        File fitxer3 = new File("EX2_resultat.txt");
        try {
            PrintStream out = new PrintStream(fitxer3);
            int i,num, maxim = 0, minim = 100;
            boolean firstime=true;
            Scanner in = new Scanner(fitxer);
            Scanner in2 = new Scanner(fitxer2);
            // Busquem el màxim i el mínim de tots dos fitxers
            while (in.hasNextInt()) {
                num = in.nextInt();
                if (firstime) {
                    
                    minim = num;
                    maxim = num;
                    // No ho tornarem a fer
                    firstime = false;
                } 
                else if (num < minim) {
                    minim = num;
                }
                else if(num > maxim) {
                    maxim = num;
                }
            }
            // System.out.println("");
            while (in2.hasNextInt()) {
                num = in2.nextInt();
                // System.out.print(n + " ");
                if (num < minim) {
                    minim = num;
                }
                if (num > maxim) {
                    maxim = num;
                }
            }
            // Els tanquem
            in.close();
            in2.close();
            // Els tornem a obrir per la segona volta
            in = new Scanner(fitxer);
            in2 = new Scanner(fitxer2);
            // Vector per guardar tots els valors
            int[] narray = new int[maxim-minim+1];

            // Omplim tots els valors de l'array amb un número inferior al mínim
            for (i=0;i<narray.length;i++)
                narray[i] = minim - 1;

            // Fem el recorregut del primer fitxer copiant els elements 
            // ordenats al vector. El més petit queda a la posició 0.
            while (in.hasNextInt()) {
                num = in.nextInt();
                narray[num-minim] = num;
            }

            // El mateix amb el segon vector
            while (in2.hasNextInt()) {
                num = in2.nextInt();
                narray[num-minim] = num;
            }
            // Tanquem els vectgors
            in.close();
            in2.close();

            // Guardem i mostrem només els que siguin superiors o iguals al mínim
            for (i = 0; i < narray.length; i++) {
                if (narray[i] >= minim) {
                    out.print(narray[i] + " ");
                    System.out.print(narray[i] + " ");
                }
            }
            System.out.println("");
            out.close();

        } catch (FileNotFoundException e1) {
            System.out.println("Algú dels fitxers no existeix");
        } catch (Exception e2) {
            System.out.println("S'ha produït l'excepció: " + e2);
        }
    }
}
