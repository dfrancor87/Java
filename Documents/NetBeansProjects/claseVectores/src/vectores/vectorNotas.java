/*
Generar un vector de 10 enteros 
entre 1 y 10 y mostrarlos
(Notas mostrar despues la nota media
de la clase(10alumnos), la nota maxima
y la nota minima
 */
package vectores;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class vectorNotas {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vectorNotas = new int[10];
        int media, max = -99, min = 99, sumaNota = 0;
        for (int index = 0; index < vectorNotas.length; index++) {
            System.out.println("Ingresa la nota");
            vectorNotas[index] = entrada.nextInt();
            sumaNota += vectorNotas[index];
            if (vectorNotas[index] > max) {
                max = vectorNotas[index];
            }
            if (vectorNotas[index] < min) {
                min = vectorNotas[index];
            }
        }
        media = sumaNota / 10;
        
        System.out.println("La media es " + media);
        System.out.println("La nota maxima es " + max);
        System.out.println("La nota minima es " + min);
    }

}
