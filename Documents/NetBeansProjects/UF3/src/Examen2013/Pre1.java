/*
(2.5 punts) Escriu un programa (Ex1.java) que llegeix d’un fitxer de text que té
el següent format (mida en kb, nom del fitxer, separats per espai):

23 fitxer1.dat
45 fitxer2.jpg
28 fitxer3.dat
10 nom4.doc

Donada una extensió (“sense el punt”) ha de calcular quants fitxers hi ha
d’aquesta extensió i quant sumen en kb. En l’exemple, si l’extensió és “dat”, el
resultat a mostrar és “ Hi ha 2 fitxers amb extensió .dat i ocupen 51 kbs”.
 */
package Examen2013;

import java.util.*;
import java.io.*;

public class Pre1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("DIme la extension ");
        String extension = entrada.next();
        int sumaKb=0;
        int contador_archivos=0;
        
        try {
            //leer fichero
            FileReader fr = new FileReader ("D:\\ficheros\\pre1.txt");
            Scanner sc = new Scanner (fr);
            
            while (sc.hasNext()){
                String linea = sc.nextLine();
                Scanner sc_linea = new Scanner (linea);
                sc_linea.useDelimiter("\\s+|\\.");
                 
                               
                int kb = sc_linea.nextInt();
               /* String nombre =*/ sc_linea.next();
                String exten = sc_linea.next();
                //System.out.println(kb+nombre+exten);
                if (exten.equals(extension)){
                    sumaKb +=kb;
                    contador_archivos+=1;
                    
                }
                
                
            }
            System.out.println("hay "+contador_archivos+" y miden "+sumaKb);
            fr.close();
            sc.close();
            
        }catch (Exception ex){
            System.out.println(ex);
        }
        
        
        
    }
}
