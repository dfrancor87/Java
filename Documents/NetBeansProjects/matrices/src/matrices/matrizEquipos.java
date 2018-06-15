/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

import java.util.*;

public class matrizEquipos {

    public static void main(String[] args) {
        String[][] matrizEquipos = {{"1", "2", "3", "9","10"}, {"4", "5", "6","libra"}};
        //MATRIZ DE EQUIPOS
        for (int i = 0; i < matrizEquipos.length; i++) {
            for (int j = 0; j < matrizEquipos[i].length; j++) {
                System.out.print(matrizEquipos[i][j]);
            }
            System.out.println("");
        }
        System.out.println(matrizEquipos[0].length);//longuitud de las filas
        System.out.println(matrizEquipos[1].length);//       longuitud de las columnas
        //PRIMER PARTIDO
        for (int i = 0; i < matrizEquipos.length ; i++) {
            System.out.print(matrizEquipos[0][i] + "vs" + matrizEquipos[1][i] + "\n");
        }

        int partidos = 1;
        while (partidos < 2) {
            partidos++;
            String ultimoequipofila0, primerequipofila1;
            ultimoequipofila0 = matrizEquipos[0][matrizEquipos.length];
            primerequipofila1 = matrizEquipos[1][0];
            //rotacion de equipos de la fila 0
            for (int i = 1; i < matrizEquipos.length; i++) {
                matrizEquipos[0][i+1] = matrizEquipos[0][i];

            }
            matrizEquipos[0][1] = primerequipofila1;
            
            
            
            //ROTACION DE EQUIPOS DE LA FILA 1
            for(int i=0; i<matrizEquipos.length;i++){
                matrizEquipos[1][i]=matrizEquipos[1][i+1];
            }
            matrizEquipos[1][matrizEquipos.length]=ultimoequipofila0;
            //MOSTRAR ENFRENTAMIENTOS
            for (int i = 0; i < (matrizEquipos.length + 1); i++) {
                System.out.print(matrizEquipos[0][i] +" vs "+matrizEquipos[1][i]+"\n");
            }
            

        }

    }

}

/*


 for (int i = 0; i < matriz.length; i++) {//numero de filas
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 50 + 1);
                System.out.printf("%5d", matriz[i][j]);
            }
            System.out.println("");
        }*/
