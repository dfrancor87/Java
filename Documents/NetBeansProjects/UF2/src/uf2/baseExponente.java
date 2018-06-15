/*
*funcion que reciba 2 valores enteros b y e
(base y exponente) y muestre el resultado de b elevado a e
+FUNCION MAN
 */
package uf2;

import java.util.*;

public class baseExponente {

    public static double baseExponente(double base, double exponente) {
        double resultado = base, cont = 1;
        
        if (exponente == 0) {
            resultado = 1;
            return resultado;
        } else if (exponente > 0) {
            while (cont != exponente) {
                cont++;
                resultado = resultado * base;
            }
            return resultado;
        } else {         
            exponente = -exponente;

            while (cont != exponente) {
                cont++;
                resultado = resultado * base;
            }
            resultado = 1 / base / resultado;
            return  resultado;
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base, exponente;
        System.out.print("ingresa la base:   ");
        base = entrada.nextDouble();
        System.out.print("ingresa el Exponente:   ");
        exponente = entrada.nextDouble();
        double resul = baseExponente(base, exponente);
        System.out.println("El resultado es: " + resul);

    }

}
