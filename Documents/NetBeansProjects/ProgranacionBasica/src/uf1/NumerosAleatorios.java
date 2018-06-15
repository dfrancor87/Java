/*
-pedir 2 numeros enteros y muestre un aleatorio entre ambos
-Mostrar una letra Mayuscula aleatorea 'A'...'Z'
-Mostrar una letra aleatoria que sea minuscula o mayuscula
 */
package uf1;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class NumerosAleatorios {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int aux, min, max;
        System.out.println("Ingresa num1:   ");
        max = entrada.nextInt();
        System.out.println("Ingresa num2:   ");
        min = entrada.nextInt();
        //CALCULAR EL MAYOR Y EL MENOR
        if (max < min) {
            aux = min;
            min = max;
            max = aux;
        }
        int aleatorio = (int) (Math.random() * (max - min + 1) + min);
        System.out.println("numero aleatorio: " + aleatorio);
        char letra1 = (char) (Math.random() * ('Z' - 'A' + 1) + 'A');//65= A 90=Z
        System.out.println("letra es: " + letra1);
        //LETRA ALEATORIA minuscula y MAYUSCULA
        //agregar una condicion9
        int num = (int) (Math.random() *2);
        if (num == 0) {
            char letra2 = (char) (Math.random() * ('z' - 'a' + 1) + 'a');//z=122 a=97
            System.out.println("La letra2 es: " + letra2);
        } else {
            char letra2 = (char) (Math.random() * ('Z' - 'A' + 1) + 'A');//z=122 a=97
            System.out.println("La letra2 es: " + letra2);
        }

    }

}
