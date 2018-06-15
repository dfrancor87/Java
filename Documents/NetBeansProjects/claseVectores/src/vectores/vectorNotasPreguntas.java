/*
Generar un vector aleatorio de 20 notas
entra 1 y 10 y contestar
-cuanos alumnos han sacado 8
-Cuantos alumnos han aprobado >=5
-Hay algun 10 ==10
 */
package vectores;

/**
 *
 * @author Danfer
 */
public class vectorNotasPreguntas {

    public static void main(String[] args) {
        int[] vector20Notas = new int[20];
        int cont = 0, cont2 = 0, cont3 = 0;

        for (int i = 0; i < 20; i++) {
            vector20Notas[i] = ((int) (Math.random() * 10) + 1);
            System.out.print(vector20Notas[i] + ",");
            if (vector20Notas[i] == 8) {
                cont++;
            }
            if (vector20Notas[i] >= 5) {
                cont2++;
            }
            if (vector20Notas[i] == 10) {
                cont3++;
            }
        }
        System.out.println("\b \n"); //borra la ultima coma (,) y agrega un salto de linea (\b)

        System.out.println(cont + " Han sacado 8 ");
        System.out.println(cont2 + " Han aprobado");
        System.out.println(cont3 + " Han sacado 10");
    }
}
