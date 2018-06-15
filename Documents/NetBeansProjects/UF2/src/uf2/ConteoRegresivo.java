/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf2;

/**
 *
 * @author Danfer
 */
import java.util.*;

public class ConteoRegresivo {

    public static void main(String[] args) {
        System.out.println("Esto es un conteo regresivo de un numero n");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        String num = entrada.nextLine();
        System.out.println(conteoRegresivo(num));
    }

    public static int conteoRegresivo(String num) {
       int numero = num.charAt(0)-48;// /* 48 es el valor ascii del 0 */ 
       return numero;
    }

}
