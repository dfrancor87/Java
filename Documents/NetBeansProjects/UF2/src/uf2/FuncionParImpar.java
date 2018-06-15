/*
*Funcion que reciba un número entero y retorne
   -Si es par el número devivido entre 2
   -Si es impar el (número . 3 + 1)
 */
package uf2;

import java.util.Scanner;

public class FuncionParImpar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = entrada.nextInt();
        // num = parImpar(num);
        //System.out.println("El resultado es: " + num);
        while (num > 1) {
            System.out.print(num + "  ");
            num = parImpar(num);

        }

    }

    public static int parImpar(int a) {
        if (a % 2 == 0) {
            a = a / 2;
            //return a / 2;

        } else {
            a = a * 3 + 1;

        }

        return a;

    }
}
