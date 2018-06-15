//PREGUNTAR EL DIA DE LA SEMANA Y MUESTRE EL MENSAJE:
//dl, dm, dc, dj, dv >>> HOY SE TRABAJA
//ds >>>> ALGUNOS TRABAJAN
//dg >>>>> FIESTA PARA TODOS.
package uf1;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class Dias {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Qué día es hoy?  ");
        String dia = entrada.nextLine();
        char letra1 = dia.toLowerCase().charAt(0);
        char letra2 = dia.toLowerCase().charAt(1);
        if (letra1 != 'd'){
            System.out.println("DIA Incorreto");
        } else {
            switch (letra2) {
                case 'l':
                    System.out.println("Hoy se trabaja.");                  
                    break;
                case 'm':
                    System.out.println("Hoy se trabaja.");
                    break;
                case 'c':
                    System.out.println("Hoy se trabaja.");
                    break;
                case 'j':
                    System.out.println("Hoy se trabaja.");
                    break;
                case 'v':
                    System.out.println("Hoy se trabaja.");
                    break;
                case 's':
                    System.out.println("Algunos trabajan.");
                    break;
                case 'g':
                    System.out.println("Fiesta para todos.");
                    break;
                default:
                    System.out.println("Eso no es un dia valido.");
            }
        }

    }

}
