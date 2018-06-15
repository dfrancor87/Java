/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf2;

import java.util.*;

public class comprobar {

    public static void main(String[] args) {
        //Scanner entrada = new Scanner(System.in);       
        int puntuacio = 0;
        char[][] tauler = generarSopaLletres();
        mostrarSopaLletres(tauler);
        String palabra = demanarParaula();
        puntuacio += comprovar(tauler, palabra);
        mostrarSopaLletres(tauler);
     //  int hay = calcularLletresQueQueden(tauler);
        System.out.println(calcularLletresQueQueden(tauler));
        preguntarContinuar();
        // System.out.println(palabra.length());

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

    public static char[][] generarSopaLletres() {
        char[][] tauler = new char[4][4];
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[i].length; j++) {
                tauler[i][j] = (char) (Math.random() * ('Z' - 'A') + 'A');
            }
        }
        return tauler;
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
        //copiar el tablero
      //  char[][] copiTauler = tauler;
        //busca la palabra si esta en el tablero
        while (trobat && iPalabra < paraula.length()) {
            char letra = paraula.charAt(iPalabra);
            trobat = buscaLetra(letra, tauler);
            iPalabra++;
        }
        return 10;//PUNTUACION POR PALABRA INGRESADA
    }

    //ESTA  FUNCION SOLO COMPRUEBA SI ESTA LA PALABRA
    public static boolean buscaLetra(char letra, char[][] tauler) {
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[i].length; j++) {
                //buscar letras de la palabra       
                //funcion buscar letra en tablero
                if (tauler[i][j] == letra) {
                    tauler[i][j] = '.';
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Pregunta a l'usuari si vol seguir introduint paraules o acabar
     *
     * @return true si vol continuar, false altrament
     */
    public static boolean preguntarContinuar() {
        Scanner entrada = new Scanner(System.in);
        String respuesta;
        do {
            System.out.println("Quieres seguir juganco (SI/NO)");
            respuesta = entrada.next().toUpperCase();
        } while (!respuesta.equals("SI") && !respuesta.equals("NO"));
        if (respuesta.equals("SI")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Es calcula restant al total les substituïdes per '.'
     *
     * @param tauler el tauler del joc
     * @return num enter de lletres que queden disponibles per jugar
     */
    public static int calcularLletresQueQueden(char[][] tauler) {
        int cont = 0;
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[i].length; j++) {
                if (tauler[i][j] != '.') {
                    cont++;
                }
            }
        }
        System.out.println(cont+"hat");
        return cont;
    }
    
    
    
    
    
    
     /**
     * Fórmula = longitud de la paraula multiplicat per (la quantitat total de
     * lletres del tauler - les que queden)
     *
     * @param par la paraula introduïda pel jugador
     * @param queden el num de lletres que queden disponibles
     * @param dimensio la dimensió del tauler
     * @return un enter que és la puntuació segons la fórmula
     */
    public static int calcularPuntuacio(String paraula, int queden, int dimensio) {
        int puntuacion=0;
        puntuacion = paraula.length() * dimensio  ;
        return puntuacion;
    }

}
