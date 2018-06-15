/*
Generear 10 valores aleatorios entre 5 y 1000
y mostrarlos al mismo tiempo. Al final del programa 
se indicará cual ha sido el máximo valor mostrado
 */
package uf1;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class ValoresAletorios10Entre5y1000 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int valor, max, num;
        valor = 0;
        max = 0;
        while (valor < 10) {
            num = (int) (Math.random() * (1000-5+1)+5);//FORMULA PARA MAXIMO Y MINIMO //==(996)+5
            valor++;
            System.out.println(num);
            if (num > max) {
                max = num;
            }//fin de IF

        }//FIN DE WHILE
        System.out.println("el maximo es "+max);
    }

}
