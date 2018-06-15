/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf2;

import java.util.*;

public class FactorialRecursividad {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Factorial con recusividad");
        System.out.println("Ingresa un numero");
        long num = entrada.nextInt();        
        System.out.println(factorial(num));
    }
    public static long factorial (long num){
        if (num<=1){//caso base
            return 1;
        }else{//caso recursivo
            return num * factorial (num-1);
        }
    }
}
