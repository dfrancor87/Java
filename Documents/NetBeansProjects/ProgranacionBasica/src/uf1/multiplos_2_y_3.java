/*Dels números compresos entre el 2 i el 100, treure per pantalla primer els que són

múltiples de 2 i després els múltiples de 3.*/
package uf1;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class multiplos_2_y_3 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a;
        for (a = 2; a <= 100; a++) {
            if (a % 2 == 0) {
                System.out.println("Multiplos de 2 "+a);
            }

        }
        for (a = 2; a <= 100; a++) {
            if (a % 3 == 0) {
                System.out.println("Multiplos de 3 " +a);
            }
        }

    }

}
