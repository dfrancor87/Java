package uf3;
/**
 * @author Danny Franco
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import java.io.FileWriter;
import java.io.PrintWriter;

public class LeetSpeakDannyFranco {

    public static void main(String[] args) {
        char[] vector = {'o', 'i', 'z', 'e', 'a', 's', 'g', 't', 'b', 'p'};
        Scanner teclado = new Scanner(System.in);

        System.out.println("===========================================================");
        System.out.println("Programa que sustituye letras por numeros y viceversa");
        //menú
        System.out.println("Elegi una opcion: ");
        System.out.println("1) Escribe 1 si quieres traducir un texto en formato normal");
        System.out.println("2) Escribe 2 si quieres traducior un texto en formato Leet Speak");
        System.out.println("===========================================================");
        int opcion = teclado.nextInt();
        //opcion 1
        if (opcion == 1) {
            //buscar el fichero
            JFileChooser selector = new JFileChooser();
            selector.showOpenDialog(null);
            selector.setFileSelectionMode(JFileChooser.FILES_ONLY);
            //AQUI TENEMOS EL NOMBRE DEL FICHERO SELECCIONADO
            if (selector.getSelectedFile() != null) {
                File fichero = selector.getSelectedFile();
                try {
                    //leer fichero
                    Scanner entrada = new Scanner(fichero);
                    while (entrada.hasNextLine()) {
                        String linea = entrada.nextLine();
                        //codigo para reemplazar caracterers
                        String nuevaLinea = "";//aqui se guardará la linea traducida
                        for (int i = 0; i < linea.length(); i++) {
                            if ((esta(linea.charAt(i), vector))) {//si el caracter de la linea se encuentra en el vector
                                //reemplazara el caracter
                                int n = 0;//busqueda en el vector
                                while (linea.charAt(i) != vector[n]) {//va a parar si coincide el caracter con el vector
                                    n++;
                                }
                                nuevaLinea += n;
                            } else {// si el caracter no esta en el vector FALSE
                                nuevaLinea += linea.charAt(i);//guardamos el mismo caracter sin modificarlo
                            }
                        }
                        System.out.println(nuevaLinea);//linea a guardar
                        //write
                        //FileWrite elegir asignar destino y nombre del nuevo fichero
                        FileWriter nuevoFichero = new FileWriter("D:\\leet speak\\textoLeetSpeak.txt", true);
                        PrintWriter pw = new PrintWriter(nuevoFichero);
                        pw.print(nuevaLinea);
                        //agregar salto de linea
                        pw.println();
                        //cerrar fichero
                        nuevoFichero.close();
                        //terminar de escribir datos
                        pw.close();
                    }
                    entrada.close();
                    System.out.println("\nFichero transformado a formato Leet Speak!!! ");//mostar ruta de nuevo fichero???
                } catch (FileNotFoundException e) {
                    System.out.println("Fichero no encontrado");
                } catch (NoSuchElementException e) {
                    System.out.println("Se esperaba un fichero de texto");
                } catch (Exception e) {
                    System.out.println("Ha ocurrido un error");
                    System.out.println(e.toString());
                }

            } else {
                //si no se selecciona ningun fichero
                System.out.println("No se ha seleccionado ningun fichero");
            }
            // opcion 2
        } else if (opcion == 2) {
            //codigo de leet speak a texto plano
            JFileChooser selector = new JFileChooser();
            selector.showOpenDialog(null);
            selector.setFileSelectionMode(JFileChooser.FILES_ONLY);
            if (selector.getSelectedFile() != null) {
                File fichero = selector.getSelectedFile();
                try {
                    //leer fichero
                    Scanner entrada = new Scanner(fichero);
                    while (entrada.hasNextLine()) {
                        String leetSpeak = entrada.nextLine();
                        //codigo para reemplazar caracterers
                        String lineaNormal = "";
                        for (int i = 0; i < leetSpeak.length(); i++) {
                            if (estaNumero(leetSpeak.charAt(i), vector)) {//si el caracter de la linea se encuentra en el vector
                                 //reemplazara el caracter
                                int n = 0;
                                while (leetSpeak.charAt(i) != n + 48) {//va a parar si coincide el caracter con el vector
                                    n++;
                                }
                                lineaNormal += vector[n];
                            } else {// si el caracter no esta en el vector FALSE
                                lineaNormal += leetSpeak.charAt(i);//guardamos el mismo caracter sin modificarlo
                            }
                        }
                        System.out.println(lineaNormal);//linea a guardar
                        //write
                        //FileWrite elegir asignar destino y nombre del nuevo fichero
                        FileWriter nuevoFichero = new FileWriter("D:\\leet speak\\textoPlano.txt", true);
                        PrintWriter pw = new PrintWriter(nuevoFichero);
                        pw.print(lineaNormal);
                        //agregar salto de linea
                        pw.println();
                        //cerrar fichero
                        nuevoFichero.close();
                        //terminar de escribir datos
                        pw.close();

                    }
                    entrada.close();
                    System.out.println("\nFichero traducido a texto plano!!!");
                } catch (FileNotFoundException e) {
                    System.out.println("Fichero no encontrado");
                } catch (NoSuchElementException e) {
                    System.out.println("Se esperaba un fichero de texto");
                } catch (Exception e) {
                    System.out.println("Ha ocurrido un error");
                    System.out.println(e.toString());
                }
            }
        }else{
            System.out.println("Eleccion Incorrecta");
        }
    }
    //FUNCIONES
    //busca si el caracter de la palabra esta en el vector
    public static boolean esta(char c, char[] vector) {
        for (int i = 0; i < vector.length; i++) {
            if (c == vector[i]) {
                return true;
            }
        }
        return false;
    }
    //funcion 2 para leetSpeak
    public static boolean estaNumero(char c, char[] vector) {
        for (int i = 0; i < vector.length; i++) {
            if (c == i + 48) {//se suma 48 que es igual al 0  para poder comparar caractereres iguales
                return true;
            }
        }
        return false;
    }
}