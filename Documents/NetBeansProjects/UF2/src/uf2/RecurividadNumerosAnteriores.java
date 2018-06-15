/*
Fes una funció recursiva que rep un número 
i mostra tots els seus anteriors.
 */
package uf2;

import java.util.*;

public class RecurividadNumerosAnteriores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dame un numero y te mostraré los anteriores");
        System.out.println("Ingresa un número: ");
        int num = entrada.nextInt();
        numerosAnteriores(num);
    }

    public static void numerosAnteriores(int num) {
        if (num == 1) {
            System.out.print(num + " ");
        } else {
            System.out.print(num + " ");
            numerosAnteriores(num - 1);

        }
    }

}
