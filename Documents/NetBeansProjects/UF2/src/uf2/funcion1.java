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
public class funcion1 {

    public static void muestraHola() {
        System.out.println("Hola");
    }

    public static void muestraString(String cadena) {
        System.out.println(cadena);
    }

    public static void colocaEspacios(int esp) {
        for (int i = 0; i < esp; i++) {
            System.out.print(" ");
        }
    }

    public static void muestraVectorStrings(String[] vector, int espacios) {
       
        for (int i = 0; i < vector.length; i++) {
            colocaEspacios((espacios - vector[i].length())/2);
            
            System.out.println(vector[i]);

            }
        
    }

    public static void main(String[] args) {
        muestraHola();
        muestraString("Hola, esto es un String");
        String[] v = {"Hola", "tu", "eres", "mi conocido"};
        muestraVectorStrings(v, 80);

    }
}
