/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf2;

import java.util.Scanner;

public class Fibonaci {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        long num = entrada.nextInt();
        long resul = fibonaci(num);
        System.out.println(resul);
    }

    public static long fibonaci(long num) {
        if (num <= 2) {//casi baso
            return 1;
        } else {//caso recursivo
            return fibonaci(num - 1) + fibonaci(num - 2);
        }
    }
}
