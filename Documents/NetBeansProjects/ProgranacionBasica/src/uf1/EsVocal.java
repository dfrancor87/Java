/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf1;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class EsVocal {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingresa una letra:   ");
        String letras = entrada.next();
        char letraOri = letras.charAt(0);
        char letra = letras.toLowerCase().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("Es vocal la letra: " + letraOri);
        } else {
            System.out.println("no es una vocal la letra: " + letraOri);
        }
    }
}
