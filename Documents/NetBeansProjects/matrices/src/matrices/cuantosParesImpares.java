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
public class cuantosParesImpares {

    public static void main(String[] args) {
        int[][] matriz = new int[4][5];
        for (int i = 0; i < matriz.length; i++) {//numero de filas
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100 + 1);
                
                System.out.printf("%5d", matriz[i][j]);
            }
            System.out.println("");
        }
        int par = 0, impar = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }

            }
        }
        System.out.println("\n Los pares " + par + " los impares " + impar);
    }

}
