/*
Generar un ventor aleatorio de letras
(entre 'A' Y 'Z')

Generar un ventor aleatorio de letras
(entre 'A' Y 'z')
 */
package vectores;

/**
 *
 * @author Danfer
 */
public class vectorAyZ {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        char[] vectorABC = new char[25];
        int num;
        for (int index = 0; index < 25; index++) {
            num = (int) (Math.random() * 2);
            if (num == 1) {
                vectorABC[index] = (char) (Math.random() * ('Z' - 'A') + 'A');
                System.out.print(vectorABC[index] + " ");
            } else {
                vectorABC[index] = (char) (Math.random() * ('z' - 'a') + 'a');
                System.out.print(vectorABC[index] + " ");
            }
        }
    }

}
