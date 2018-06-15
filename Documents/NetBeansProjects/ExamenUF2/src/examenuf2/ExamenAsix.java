/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenuf2;

/**
 *
 * @author Danfer
 */
import java.util.*;
public class ExamenAsix {

   public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribir numero");
        //String numero = entrada.nextLine();
        String[] vector={"4","1","2","6","7","7"};
        String resultado = ordenaCad(vector);
        System.out.println("Orden de menor a Mayor: ");
        System.out.println(resultado);
    }
    public static String ordenaCad(String []vector){
        String vuelta=" ";
        for (char c = '0'; c <= '9'; c++) {
            for (int i = 0; i < vector.length; i++) {
                if (vector[i].charAt(0)==c){
                    vuelta = vuelta + c;
                }
            }
        }
        return vuelta;
    }
}