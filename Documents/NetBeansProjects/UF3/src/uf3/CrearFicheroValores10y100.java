/*
crear un fichero de texto
colocar 20 valores aleatorios entre 10 y 100
y que aparezcan numeros reales
10.00
11.26
47.64
1.000
 */
package uf3;

import java.io.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Danfer
 */
public class CrearFicheroValores10y100 {

    public static void main(String[] args) {
        //ABRIR TXT
        JFileChooser abrir = new JFileChooser();
        abrir.showOpenDialog(null);
        abrir.setFileSelectionMode(JFileChooser.FILES_ONLY);
        //abrir el fihero
        if (abrir.getSelectedFile() != null) {
            File fichero = abrir.getSelectedFile();
            try {
                if (fichero.exists()) {
                    //if para comprobar si el fichero existe
                    System.out.println("El fichero ya existe... ");
                    System.out.println("Quieres sobreescribirlo (S/N)?: ");
                    Scanner in = new Scanner(System.in);
                    char resp = in.next().toUpperCase().charAt(0);
                    if (resp != 'S') {
                        System.out.println("Saliendo");
                        System.exit(0);

                    }
                } else {
                    //aqui se crea el fichero si no existe y si no queremos sobreescribi
                    fichero.createNewFile();
                    //escribir
                }
                FileWriter fw = new FileWriter(fichero.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
               // bw.write("¿Qué estas pensando? ");
               
               String frase ;
               Scanner entrada = new Scanner (System.in);
               frase = entrada.nextLine();
               bw.write(frase);
                //cerrar fichero
                bw.close();
                //mensaje de fichero creado
                System.out.println("Fichero creado con exito");
                
                
            } catch (Exception e) {
                System.out.println("erorr");
            }
        }

    }

}
