/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf2;

import java.util.*;

public class Mezcladitos {

    public static void main(String[] args) {
        //Scanner entrada = new Scanner(System.in);
        int dimensio = demanarDimensio();
        int puntuacio = 0;
        //System.out.println("La dimension es de   "+ dimensio);
        char[][] tauler = generarSopaLletres(dimensio);
        mostrarSopaLletres(tauler);
        String palabra = demanarParaula();
        puntuacio += comprovar(tauler, palabra);
        System.out.println("tienes " + puntuacio);
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
    
    

    public static char[][] generarSopaLletres(int dimensio) {
        char[][] tauler = new char[dimensio][dimensio];

        int cont = 0; //contador de vocales 
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[i].length; j++) {
                //GENERAR EL DOBLE DE VOCALES                        
                tauler[i][j] = (char) (Math.random() * ('Z' - 'A') + 'A');
            }
        }
        return tauler;
    }

    
    
    
    
    public static int demanarDimensio() {
        Scanner entrada = new Scanner(System.in);
        int dimension;
        //RANGO PARA LA DIMENSION DEL TABLERO
        do {
            System.out.println("De que dimension será el tablero(min 3 max 20");
            dimension = entrada.nextInt();
        } while (dimension < 3 || dimension > 20);
        return dimension;

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
        int p = 0;// indice de palabra
        //condicionar el for para una busqueda
        char[][] tablaNueva = tauler;//guarda el tablero antes de asignar los puntos        
        // buscar la palabra completa en el tablero        
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[i].length; j++) {
                //buscar letras de la palabra                
                if (tauler[i][j] == paraula.charAt(p)) {
                   
                    
                }
               
            }
        }
        return 0;//PUNTUACION POR PALABRA INGRESADA
    }
}
