package Examen2013;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
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
 * @author carlos
 */
public class Ex2 {

    public static void main(String[] args) {

        // Llegir un fitxer
        // String texto = "";
        BufferedReader entrada1, entrada2;
        // String s;
        // Per demanar la informació a l'usuari
        Scanner in = new Scanner(System.in);
        System.out.println("Quin és el nom del fitxer a tractar sense extensió (es faran servir els nom_1/2.txt) ? ");
        String nomFitxer = in.nextLine();
        // Necessitarem un vector de 200 enters com a mínim
        int[] vectorInt = new int[200];
        int index = 0;
        try {

            FileReader fr = new FileReader(nomFitxer + "_1.txt");
            entrada1 = new BufferedReader(fr);
            System.out.println("Tractant el fitxer: " + nomFitxer + "_1.txt");
            while (entrada1.ready()) {
                String aux = entrada1.readLine();
                Scanner sl = new Scanner(aux);
                // System.out.println("Linia: " + aux);
                // System.out.print("Numeros: ");
                while (sl.hasNext()) {
                    vectorInt[index] = Integer.parseInt(sl.next());
                    System.out.print(" " + vectorInt[index]);
                    index++;
                }
                System.out.println("");
            }
        } catch (java.io.FileNotFoundException fnfex) {
            System.out.println("S'ha trobat l'error: " + fnfex.toString());
        } catch (java.io.IOException fnfex) {
            System.out.println("S'ha trobat l'error: " + fnfex.toString());
        }

        // Lo mateix amb el segon fitxer. Es poden agrupar els try {} catch
        // L'índex es segueix incrementant amb els valors del segon fitxer
        try {

            FileReader fr = new FileReader(nomFitxer + "_2.txt");
            entrada2 = new BufferedReader(fr);
            System.out.println("Tractant el fitxer: " + nomFitxer + "_2.txt");
            while (entrada2.ready()) {
                String aux = entrada2.readLine();
                Scanner sl = new Scanner(aux);
                // System.out.println("Linia: " + aux);
                // System.out.print("Numeros: ");
                while (sl.hasNext()) {
                    vectorInt[index] = Integer.parseInt(sl.next());
                    System.out.print(" " + vectorInt[index]);
                    index++;
                }
                System.out.println("");
            }
        } catch (java.io.FileNotFoundException fnfex) {
            System.out.println("S'ha trobat l'error: " + fnfex.toString());
        } catch (java.io.IOException fnfex) {
            System.out.println("S'ha trobat l'error: " + fnfex.toString());
        }

        // Aquí ordenem el vector
        Arrays.sort(vectorInt, 0, index);
        
        // Escrivim el fitxer amb el nom nom.txt
        try {
            FileWriter fw = new FileWriter(nomFitxer + ".txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            for (int i = 0; i < index; i++) {
                // Els valors estan separats per espais
                if (i == 0 || (vectorInt[i] != vectorInt[i - 1])) {
                    salida.print(vectorInt[i]+" ");
                    // Per mostrar la informació per pantalla
                    System.out.print(vectorInt[i]+" ");
                }
            }
            salida.print('\n');
            System.out.println("");
            // salida.println("Esto escribe una linea en el archivo");
            salida.close();

        } catch (java.io.IOException ioex) {
            System.out.println("Ocurrió el error: " + ioex.toString());
        }
    }
}
