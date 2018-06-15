//package fitxers;
// https://docs.oracle.com/javase/8/docs/api/java/io/FileReader.html 

/**
 * Lectura d'un fitxer de text caràcter a caràcter. Incorpora un
 * comptador per quantificar el temps que es tarda en llegir el
 * arxiu.
 */

import java.io.*;

public class java806a {
    public static void main( String args[] ) {
        long intervalo = System.currentTimeMillis();
        FileReader fReader = null;
        int c;

        try {
            fReader = new FileReader("prova.txt");
            while( (c = fReader.read()) != -1 ) {
            }
        } catch( Exception e ) {
            System.out.println("S'ha produït un error. No s'ha trobat el fitxer: prueba.txt");
            // e.printStackTrace();
        } finally {
			System.out.println("Per aquí sempre es passa !");
            try {
                if( fReader != null )
                    fReader.close();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        }
        System.out.println( "Temps: "+
            (System.currentTimeMillis()-intervalo)+ " ms" );
    }
}
