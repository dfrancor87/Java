/*
226. Escriun un altre programa que amb el contingut del fitxer anterior, el que conté
cognom1, cognom2, nom i telèfon generi un fitxer de sortida amb les inicials de cada
persona. En l’exemple, seria:
MLS
JGP
PSG
 */
package uf3.listaEjercicios;

/**
 *
 * @author Danfer
 */
import java.io.*;
import java.util.*;
public class ejer226 {
    public static void main(String[] args) {
        try {
            //leer fichero
            FileReader fichero = new FileReader ("D:\\ficheros\\225.txt");
            Scanner sc = new Scanner(fichero);// =???? todo el fichero esta dentro de sc
            
            while (sc.hasNext()){//????? has next va linea a linea
                String linea = sc.nextLine();// lee toda la primera linea
                Scanner sc_linea = new Scanner (linea); //????
                sc_linea.useDelimiter("\\s+");  //\\evita los espacios o saltos de linea 
                
                char ap1 = sc_linea.next().toUpperCase().charAt(0);
                char ap2 = sc_linea.next().toUpperCase().charAt(0);
                char nom = sc_linea.next().toUpperCase().charAt(0);
                System.out.println(ap1+""+ap2+""+nom);
                //sc_linea.next(); TELEFONO
                
                // crear fichero
                FileWriter nuevoFichero = new FileWriter ("D:\\ficheros\\ejer226.txt", true);
                PrintWriter pw = new PrintWriter(nuevoFichero);//escribir en el fichero
                pw.print(ap1+""+ap2+""+nom+"");
                //agregar un salto de linea
                pw.println();
                //cerrar fichero
                nuevoFichero.close();
                //terminamos de escibir datos
                pw.close();
                
                
                
                
                
            }
            //cerrar el primer fichero
            fichero.close();
            sc.close();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
    
}
