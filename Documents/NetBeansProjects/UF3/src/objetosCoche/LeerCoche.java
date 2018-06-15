/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosCoche;

/**
 *
 * @author Danfer
 */
import java.util.*;
import java.io.*;

public class LeerCoche {

    public static void main(String[] args) {
        Coche meu = LeerCoche();//llama a la funcion LeerCoche
        //mostrar coche
        if (meu != null){
            System.out.println("Datos del coche: ");
            System.out.println(meu);
        }
    }

    public static Coche LeerCoche() {
        Coche aux = null;
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Nombre del fichero a recuperar: ");
            String nomFichero = entrada.next();
            FileInputStream fi = new FileInputStream(nomFichero);
            ObjectInputStream obi = new ObjectInputStream(fi);
            aux = (Coche) obi.readObject();
            obi.close();
            fi.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fitxer no trobat");
        } catch (EOFException e) {
            System.out.println("Hem arribat al final del fitxer");
        } catch (ClassNotFoundException e) {
            System.out.println("Format de fitxer  incompatible");
        } catch (IOException e) {
            System.out.println("Problemes d'E/S");
            System.out.println(e);
        }
        //devuelev el coche a la funcuon que la llama
        return null;
    }

}
