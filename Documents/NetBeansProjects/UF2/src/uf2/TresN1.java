/*
metodo recursico 3n +1
5 - 16 - 8 - 4 -2 -1--->> 1 caso base
3*5 +1 =16 si es impar
16/2 = 8 si es par
 */
package uf2;

/**
 *
 * @author Danfer
 */
import java.util.*;

public class TresN1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("programa que calcula el 3N+1");
        System.out.println("Ingresa un numero");
        int num = entrada.nextInt();
        tresN1(num);

    }

    public static void tresN1(int num) {
        //caso base
        if (num == 1) {
            System.out.println(num);
        } else if (num % 2 == 0) {
            System.out.print(num + " ");
            tresN1(num / 2);
        } else {
            System.out.print(num + " ");
            tresN1(num * 3 + 1);

        }

    }

}
