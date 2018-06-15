package objetosPiso;

import java.util.Scanner;
import java.io.*;

/**
 * Classe per provar la classe Pis
 * @author prof
 */
public class LlegirVectorPisos {
    public static void main(String[] args) {
        
        // public Pis(int metrosCuadrados, int habitaciones, int aseos, double precio, boolean ascensor, int altura) {
        Pis vp [] = llegirVectorPisos();
        // Mostrem tots els pisos que hem llegit
        System.out.println("Dades dels pisos del fitxer");
        System.out.println("===========================");
        for (int n=0;n<vp.length;n++) {
            // Podem controla si vp[n] és null abans d'intentar mostrar-lo
            if (vp[n] != null) {
				System.out.println(vp[n]);
			}
        }
    }
    
    // Recupera un vector de 5 pisos del fitxer indicat per l'usuari i el mostra
    public static Pis [] llegirVectorPisos() {
        Pis [] aux = null; // = new Pis[5];
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Nom del fitxer a recuperar ? ");
            String nomFitxer = entrada.next();
            FileInputStream fi = new FileInputStream(nomFitxer);
            ObjectInputStream obi = new ObjectInputStream(fi);
            
            // Fem un bucle per llegir les dades dels 5 pisos
            // Si el fitxer no té 5 pisos salta una excepció
            // for (int n=0;n<5;n++) {
                 // aux[n] = (Pis) obi.readObject();
            // }
            aux = (Pis []) obi.readObject();

            obi.close();
            fi.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fitxer no trobat");
        } catch (EOFException e) {
            System.out.println("Hem arribat al final del fitxer");
        } catch (IOException e) {
            System.out.println("Problemes d'E/S");
        } catch (ClassNotFoundException e) {
            System.out.println("Format incompatible");
        }
        // Retornem el vector de pisos a la funció que ens ha cridat
        return aux;
    }
}
