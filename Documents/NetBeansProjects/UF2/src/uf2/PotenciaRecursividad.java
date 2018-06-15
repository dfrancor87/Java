/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf2;
import java.util.*;
public class PotenciaRecursividad {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Base y exponente");
        System.out.print("Ingresa la base entera: ");
        int base= entrada.nextInt();
        System.out.print("Ingresa el exponente: ");
        int exponente = entrada.nextInt();
        System.out.println(baseExponente(base, exponente));
    }
    public static int baseExponente(int base, int exponente){
        if (exponente == 0){
            return 1;
        }else{
            return 2;
        }
    }
}
