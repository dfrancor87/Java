/*
MATRIZ 
CONTAR CUANTAS VECES SALE EL 20
 */
package matrices;

public class numero20 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][5];

        for (int i = 0; i < matriz.length; i++) {//numero de filas
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 50 + 1);
                System.out.printf("%5d", matriz[i][j]);
            }
            System.out.println("");
        }
        int cont20 = 0;
        for (int i = 0; i < matriz.length; i++) {//numero de filas
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 20) {
                    cont20++;
                }

            }
        }
        System.out.println("El número 20 ha apercido "+cont20+" veces");  
    }

}
