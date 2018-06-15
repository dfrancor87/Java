/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

/**
 *
 * @author Danfer
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        System.out.println(matriz.length);
        System.out.println(matriz[0].length);
        for (int i = 0; i < matriz.length; i++) {//numero de filas
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100 + 1);
                System.out.printf("%5d", matriz[i][j]);
            }
            System.out.println("");
        }
        int min, max;
        max = min = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                }
                if (matriz[i][j] < min) {
                    min = matriz[i][j];
                }

            }
        }
        System.out.println("\nmaxi es "+max+" min es "+min);
    }

}
