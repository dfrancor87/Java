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
public class queValorSeRepiteMas {

    public static void main(String[] args) {
        int[][] matriz = new int[4][5];//4filas//5columnas
        for (int i = 0; i < matriz.length; i++) {//numero de filas
            for (int j = 0; j < matriz[i].length; j++) {//numero de columnas
                matriz[i][j] = (int) (Math.random() * 100 + 1);
                System.out.printf("%5d", matriz[i][j]);
            }
            System.out.println("\n");

        }

        System.out.println("\n\n");
        for (int f = 0; f < matriz.length; f++) {//numero de filas
            for (int c = 0; c < matriz[f].length; c++) {//numero de columnas
                System.out.printf("%5d", matriz[f][c]);
                // if (if matriz[i][j]== matriz[f][c])

            }
            System.out.println("\n"); //alimenta linea entre fila y fila
        }
        int cont = 0;
        for (int tmpf = 0; tmpf < matriz.length; tmpf++) {
            for (int tmpc = 1; tmpc < matriz[tmpf].length; tmpc++) {
                for (int xf = 0; xf < matriz.length; xf++) {
                    
                    for (int xc = 1; xc < matriz[xf].length; xc++) {
                        if (matriz[tmpf][tmpc] == matriz[0][xc]) {
                            cont++;
                            System.out.println(matriz[0][xc]);
                            System.out.println(matriz[tmpf][tmpc]);
                        }
                    }

                }
            }

        }
        System.out.println(cont);

    }

}
