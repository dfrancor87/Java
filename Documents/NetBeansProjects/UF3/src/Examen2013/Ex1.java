
package Examen2013;

import java.io.File;
import java.util.Scanner;

/**
 * 1. (2.5 punts) Escriu un programa (Ex1.java) que llegeix d’un fitxer de text que té
 * el següent format (mida en kb, nom del fitxer, separats per espai):
 * 23 fitxer1.dat
 * 45 fitxer2.jpg
 * 28 fitxer3.dat
 * 10 nom4.doc
 * @author carlos
 */
public class Ex1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Donam el nom del fitxer: ");
        String nomFitxer = entrada.nextLine();
        System.out.print("Donam l'extensió a processar ");
        String ext = entrada.nextLine();
        
        File f = new File(nomFitxer);
        int cont = 0;
        int sumaBytes = 0;
        String linia;
        try {
            // Fem servir l'Scanner per llegir les dades
            Scanner in = new Scanner(f);
            // Llegim línia a línia del fitxer
            while (in.hasNextLine()) {
                linia = in.nextLine();
                String parts[] = linia.split("[ .]");
                if (ext.equals(parts[parts.length-1])) {
                    // Sumem el tamany del fitxer
                    sumaBytes += Integer.parseInt(parts[0]);
                    // Incrementem el nombre de fitxers trobats
                    cont++;
                }
            }
            in.close();
        } catch (Exception e) {
            System.out.println("S’ha trobat l’error: " + e.toString());
        }
        // Perquè quedi millor formatat
        // Diferència quan trobem 1 fitxer i no fa servir el plural.
        if (cont == 1) {
            System.out.print("Hi ha " + cont + " fitxer amb extensió ."+ext);
            System.out.println(" i ocupa " + sumaBytes + " kbs");
        } else {
            System.out.print("Hi han " + cont + " fitxers amb extensió ."+ext);
            System.out.println(" i ocupen " + sumaBytes + " kbs");
        }
    }
}