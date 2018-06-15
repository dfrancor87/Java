/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf2;

public class CambiaSigno {
    public static void main(String[] args) {
        int [] vector = {1,-2,3,-4};
        cambiaSigno(vector);
    }
    public static void cambiaSigno(int [] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i]= vector[i]*-1;
            System.out.print(vector[i]+" ");
        }
    }
}
