/*

Funcion que muestre una matriz de enteros
alineada en columnas 
psv mostramatriz
 */
package uf2;

public class FuncionMatriz {
    public static void main(String[] args) {
        int [][] matriz = new int [6][6];
        mostrarMatriz (matriz);
    }
    public static void mostrarMatriz(int [][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]=(int)(Math.random()*100);
                System.out.printf("%5d",matriz[i][j]);                                
            }
            System.out.println("");
        }
        
    }
    
}
