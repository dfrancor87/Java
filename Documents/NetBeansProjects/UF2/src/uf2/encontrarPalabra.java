/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf2;

import java.util.*;

public class encontrarPalabra {

    public static void main(String[] args) {
        //Scanner entrada = new Scanner(System.in);       
        int puntuacio = 0;
        char [][] tauler = {{'A','E','I'},{'P','M','N'},{'A','E','I'},{'P','M','N'}};      
        mostrarSopaLletres(tauler);
        String palabra = demanarParaula();
        puntuacio += comprovar(tauler, palabra);
        mostrarSopaLletres(tauler);
        //  System.out.println(palabra.length());
        //   mostrarSopaLletres(tauler);
        //mostrar sopa de letras con puntos 
    }

    public static void mostrarSopaLletres(char[][] tauler) {
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[i].length; j++) {
                System.out.print(tauler[i][j] + "  ");
            }
            System.out.println("");
        }
    }


    public static String demanarParaula() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduce una palabra que este en el tablero");
        //PASAR LA PALABRA  MAYUSCULAS
        String palabra = entrada.next().toUpperCase();
        return palabra;
    }

    /**
     * Substitueix dins el tauler, les lletres de la paraula per '.' Només en el
     * cas que la paraula sencera es trobi al tauler. Si la paraula no es troba,
     * retornarà un 0
     *
     * @param tauler rep la sopa de lletres, el tauler de joc
     * @param paraula la paraula a buscar
     * @return un enter que és la puntuació de la paraula, 0 si no es troba
     */
    public static int comprovar(char[][] tauler, String paraula) {
        int iPalabra = 0;// indice de palabra
        boolean trobat = true; // si encuentra una letra de la palabra
        //condicionar el for para una busqueda
            
        
            for (int i = 0; i < tauler.length; i++) {
                for (int j = 0; j < tauler[i].length; j++) {
                    
                        
                    
                    
                }
            }            
        
        return 0;//PUNTUACION POR PALABRA INGRESADA
    }

}
