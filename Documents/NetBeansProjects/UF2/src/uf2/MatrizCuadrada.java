/*
funcion que reciba un array cuadrado de enteros
y retorne un vector con los elementos de la 
digonal principal.
1  2  3
4  5  6
7  8  9
DIGONAL PRINCIPAL
1 5 9

si no es cuadrado muestra un mensaje y retorna null


DEVOLVER LA DIAGONAL SECUNDARIA
 7 5 3
 */
package uf2;

/**
 *
 * @author Danfer
 */
public class MatrizCuadrada {
    public static void main(String[] args) {
        int [][] matriz = new int [5][5];
        //llenar matriz
        matriz= llenarMatriz(matriz);
        //mostar
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+"  ");                
            } 
            System.out.println("");
        }
        int [] vectorDiagonal = matrizDiagonal (matriz); 
        for (int i = 0; i < vectorDiagonal.length; i++) {
            System.out.print(vectorDiagonal[i]+" ");            
        }
        //HACER VECTOR CON DIAGONAL SECUNDARIA
        
    }
    public static int [][] llenarMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]=(int)(Math.random()*10);                
            }            
        }
        return matriz;
        
    }
    public static int [] matrizDiagonal(int [][] matriz){
        int [] vector = new int[matriz.length];
        for (int i = 0; i < vector.length; i++) {
            vector[i]=matriz[i][i];            
        }        
        return vector;
    }
    
}
