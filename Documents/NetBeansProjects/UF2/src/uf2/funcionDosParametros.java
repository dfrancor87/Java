/*
*funcion que reciba como parametros 2 valores enteros y muestre
el mayor. SI son iguales mostrará "VALORES IDENTICOS"

+Programa principal que pida los numeros
al usuario y se los pase  a la funcion
 */
package uf2;

import java.util.*;

public class funcionDosParametros {

    public static int compara(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        int a, b;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa valor1");
        a = entrada.nextInt();
        System.out.println("Ingresa valor2");
        b = entrada.nextInt();
        int maximo = compara(a, b);
        System.out.println("El valor maximo entre " + a + " y entre " + b + " es: " + maximo);
        //compara(8,5);

    }
}
