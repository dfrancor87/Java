/*
Generar un vector de 20 enteros (entre 0 y 5)
mostrarlos en una linea. Generar otro vector de 
20 enteros y mostrarlo justo debajo. 
comparar ambos vectores y mostrar los valores 
que coinciden en los dos vectores.
1 0 3 4 5 5 0 3 4 2 1
0 1 2 4 0 5 1 2 4 1 0

VALORES QUE COINCIDEN 
4 5 4
 */
package vectores;

/**
 *
 * @author Danfer
 */
public class Comparar2Vectores {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] vector1 = new int[20];
        int[] vector2 = new int[20];
        for (int index = 0; index < vector1.length; index++) {
            vector1[index] = (int) (Math.random() * (6));
            System.out.print(vector1[index] + " ");
        }
        System.out.println("");
        for (int index = 0; index < vector2.length; index++) {
            vector2[index] = (int) (Math.random() * (6));
            System.out.print(vector2[index] + " ");
        }
        System.out.println("\nValores que coinciden ");
        for (int index = 0; index < 20; index++) {
            if (vector1[index] == vector2[index]) {
                System.out.print(vector1[index] + " ");
            } else {
                System.out.print("- ");
            }
        }
    }
}
