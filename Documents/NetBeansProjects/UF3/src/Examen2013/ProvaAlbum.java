
package Examen2013;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 * (2 punts) Crea una classe ProvaAlbum que crea una instància de la classe 
 * AlbumCromos, i li afegiu 3 cromos. Grava les dades de l’àlbum de manera 
 * serialitzada a fitxer i comprova que pots llegir i mostrar per pantalla 
 * el què has gravat del disc.
 * @author Administrador
 */
public class ProvaAlbum {
    
     // Espera una resposta S o N de part de l'usuari
    public static boolean siNo (String pregunta)
    {
        Scanner entrada = new Scanner(System.in);
        char car;
        do
        {
            System.out.print(pregunta+" [S/N] ? ");
            car = entrada.next().toUpperCase().charAt(0);
            if (car != 'N' && car != 'S')
            {
                System.out.println("S'esperava una resposta S/N ...");
            }
        }
        while (car != 'N' && car != 'S');
        return car == 'S';
    }

    
    public static void main(String[] args) {
        // Ho creem tot per codi
        // Creem la col·lecció de lliga 2012 amb 150 cromos
        AlbumCromos album = new AlbumCromos("Lliga_2012",150);
        
        // Afegim els 3 cromos que es demanen
        album.afegirCromo(new Cromo(10,"Messi",4.29));
        album.afegirCromo(new Cromo(8,"Raul",1.50));
        album.afegirCromo(new Cromo(7,"Villa",5.12)); 
        
        // Mostrem l'àlbum amb les funcions estandards
        System.out.println("Dades de l'àlbum de cromos abans de guardar-lo en disc: \n"+album);
        
        // Guardem el àlbum de cromos
        gravarAlbum(album);
        
        // Les recuperm i les tornem a mostrar
        AlbumCromos aux=llegirAlbum();
        
         // Mostrem l'àlbum amb les funcions estandards
        System.out.println("Dades de l'àlbum de cromos després de recuperar-lo de disc: \n"+aux);
    }
    
     public static void gravarAlbum(AlbumCromos f) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nom del fitxer per gravar ? ");
        String nomFitxer = entrada.next();
        File in = new File(nomFitxer);
        if(in.exists()) {
            System.out.print("El fitxer ja existeix... ");
            if (siNo ("Ho vol sobreescriure"))
            {
                // Eliminem el fitxer abans d'escriure les dades
                in.delete();
            }
            else
            {
                System.out.println("!!! ATENCIO !!!. No s'ha gravat el fitxer ...\n");
                return;
            }
        }
        try {
            FileOutputStream fo = new FileOutputStream(nomFitxer, false);
            ObjectOutputStream obo = new ObjectOutputStream(fo);
            obo.writeObject(f);
            obo.close();
            fo.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fitxer no trobat");
        } catch (IOException e) {
            System.out.println("Problemes d'E/S");
        }
    }

    public static AlbumCromos llegirAlbum() {
        AlbumCromos aux = null;
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Nom del fitxer a recuperar ? ");
            String nomFitxer = entrada.next();
            FileInputStream fi = new FileInputStream(nomFitxer);
            ObjectInputStream obi = new ObjectInputStream(fi);
            aux = (AlbumCromos) obi.readObject();
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
        return aux;
    }
    
}
