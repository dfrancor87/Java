/*
vector de 30 notas entre 1 y 10
Mostrar cuántas hay de cada valor
 */
package vectores;

/**
 *
 * @author Danfer
 */
public class frecuenciaCalificaciones {

    public static void main(String[] args) {
        int[] vector = {0, 0, 0, 0, 3, 3};//VECTOR DE 6 POSICIONES
        int yaCuentaElSuyo, numeroDeVecesQueSeRepite = 0, elNumeroQueMasSeRepite = -1;

        for (int i = 0; i < vector.length - 1; i++) {
            yaCuentaElSuyo = 1;
            //System.out.println(yaCuentaElSuyo);
            for (int j =i+1 ; j < vector.length; j++) {
                if (vector[i] == vector[j]) {
                    yaCuentaElSuyo++;
                    //System.out.println(yaCuentaElSuyo);
                }
            }
           
            if (yaCuentaElSuyo > numeroDeVecesQueSeRepite) {
                numeroDeVecesQueSeRepite = yaCuentaElSuyo;
                elNumeroQueMasSeRepite = vector[i];
            }
        }
        System.out.println("el numero: " + elNumeroQueMasSeRepite + " se repite mas veces: " + numeroDeVecesQueSeRepite);

    }
}
