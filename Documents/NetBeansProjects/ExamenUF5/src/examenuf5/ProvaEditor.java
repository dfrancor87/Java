package examenuf5;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Danny Franco
 */
public class ProvaEditor {

    public static void main(String[] args) {

        EditorText editor = new EditorText();

        Scanner entrada = new Scanner(System.in);
        String linea;
        int opcion;
        do {           
          
            System.out.println("1 Escribir una linea");
            System.out.println("2 desfer Afegir");
            System.out.println("3 refer Afegir");
            System.out.println("4 texto total");
            System.out.println("0 salir");
            System.out.print("Eige una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n\n\n\nEscribe una linea");
                    Scanner in = new Scanner(System.in);
                    linea = in.nextLine();
                    //agregar linea
                    editor.afegirLiniaAlFinal(linea);
                    break;
                case 2:
                    System.out.println("\n\n\n\ndesfer Afegir");
                    //control z
                    editor.desferAfegir();
                    break;
                case 3:
                    System.out.println("\n\n\n\nrefer Afegir");
                    editor.referAfegir();
                    break;
                case 4:
                    System.out.println("texto total");
                    editor.print();
                    /////
                    // editor iterable
                  /*  for (String linea: String){
                        System.out.println(linea);
                    }*/
                    
                    break;
                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 0);

    }
}
