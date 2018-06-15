//package fitxers;

// https://docs.oracle.com/javase/8/docs/api/java/io/FileReader.html 
// https://docs.oracle.com/javase/8/docs/api/java/io/BufferedReader.html

/**
 * Versió modificada de l'exemple java806a.
 * Lectura d'un fitxer de text caràcter a caràcter mitjançant un buffer 
 * de lectura. També fem servir un comptador per quantificar el temps 
 * que es tarda en llegir el arxiu.
 */

import java.io.*;

public class java807a {
    public static void main( String args[] ) {
        long intervalo = System.currentTimeMillis();
        BufferedReader bReader = null;
        int c;

        try {
            bReader = new BufferedReader( new FileReader("prova.txt") );
            while( (c = bReader.read()) != -1 ) {
            }
        } catch( Exception e ) {
            e.printStackTrace();
        } finally {
			System.out.println("Per aquí sempre es passa !");
            try {
                if( bReader != null )
                    bReader.close();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        }
        System.out.println( "Temps: "+
            (System.currentTimeMillis()-intervalo)+ " ms" );
    }
}
