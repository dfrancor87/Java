/*
227. Escriu un programa que mostri les N primeres línies d’un fitxer de text. N es
demana per teclat
 */
package uf3.listaEjercicios;

/**
 *
 * @author Danfer
 */
import java.io.*;
import java.util.*;

public class ejer227 {

    public static void main(String[] args) {
        System.out.println("Programa que lee las N primeras lineas de un fichero");
        Scanner entrada = new Scanner(System.in);
        //contar el total de filas del fichero

        System.out.println("Ingresa un numero");
        int numero = entrada.nextInt();

        //read
        try {
            FileReader fichero = new FileReader("D:\\ficheros\\ejer227.txt");
            Scanner sc = new Scanner(fichero);
            int contador = 0;
            while (sc.hasNext() && contador < numero) {
                String linea = sc.nextLine();
                System.out.println(linea);
                contador += 1;
            }
        } catch (Exception ex) {
            System.out.println(ex);

        }
    }
}

/*
        USANDO BUFFEREDREADER 
//Usamos la clase BufferReadeader para tener acceso a un metodo propio (readLine()) y asi mediante un contador contar las lineas.

    public static void main(String[] args) {
        System.out.println("Programa que lee las N primeras lineas de un fichero");
        Scanner entrada = new Scanner(System.in);
        

        System.out.println("Ingresa un numero");
        int numero = entrada.nextInt();

        //read
        try {
            FileReader fichero = new FileReader("D:\\ficheros\\ejer227.txt");
            //Scanner sc = new Scanner(fichero);
            BufferedReader br = new BufferedReader(fichero);
            int contador = 0;
            String linea;
            while ((linea =br.readLine())!= null  && contador < numero) {
                
                System.out.println(linea);
                contador += 1;
            }
        } catch (Exception ex) {
            System.out.println(ex);

        }
    }
}


*/