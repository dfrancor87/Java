/*
Generar un vector de 20 enteros
entre 1 y 100 y luego mostrarlos
 */
package uf1;

/**
 *
 * @author Danfer
 */
public class vector20Numeros {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int [] numeros = new  int [20];
        for(int index=0;index<numeros.length;index++){
            numeros[index]= (int)(Math.random()*100)+1;
            //System.out.print(numeros[index]+" ");
            System.out.printf("%4d", numeros[index]); //%4d deja el espacio para un numero de 4 digitos 
        }
        System.out.println();//alimento linea para el mensaje de netbeans salga abajo
    }
}
