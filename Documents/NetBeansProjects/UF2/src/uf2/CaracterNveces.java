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

public class CaracterNveces {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un caracter");
        char letra = entrada.next().charAt(0);
        System.out.println("cuantas veces quieres que se repita");
        int num = entrada.nextInt();

        repiteCaracter(letra, num);

        System.out.println("\nmostar el cuadrado");
        for (int i = 0; i < num; i++) {
            repiteCaracter(letra, num);
            System.out.println("");
        }
        
        
        System.out.println("\nmostrar triangulo");
        for (int i = 1; i <= num; i++) {
            repiteCaracter(letra, i);
            System.out.println();
        }
    }

    public static void repiteCaracter(char letra, int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(letra);

        }

    }
}
