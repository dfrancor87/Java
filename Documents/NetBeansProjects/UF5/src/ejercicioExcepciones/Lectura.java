package ejercicioExcepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Danny Franco
 */
public class Lectura {

    private String fichero;

    public Lectura(String fichero) {
        this.fichero = fichero;
    }

    public void funcio() throws FileNotFoundException {
        String regexp = ".*\\.(com|net|org)";
        File lectura = new File(fichero);
        Scanner lee = new Scanner(lectura);
        while (lee.hasNext()) {
            String domini = lee.next();
            System.out.println(domini);
        }

    }
}
