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

public class StringInt {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa per transformar de base qualsevol valor");
        System.out.print("Donam el valor d'origen: ");
        String num = entrada.next();

        int baseOrigen;
        System.out.print("En quina base està expressat [2...16] ? ");
        baseOrigen = entrada.nextInt();

        if (!isOkNum(num, baseOrigen)) {
            System.out.println("El número indicat: " + num + " no està en base: " + baseOrigen);
            // Acabem el programa
            return;
        }

    }
    // Indica si el número num és correcte per a la base indicada

    public static boolean isOkNum(String num, int base) {
   
        int i = 0;
        while (i != num.length() ) {            
            /*if (charToInt(num.charAt(i)) >= base) {                
                return  false;
            }*/
            i++;
        }       
        return true;

    }
}