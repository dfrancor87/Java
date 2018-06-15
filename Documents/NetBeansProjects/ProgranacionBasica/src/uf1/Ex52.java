/*
52. La nostra companya ens cobra les trucades telefòniques en funció de la seva
durada. La tarifa que tenim contractada és la següent:

El cost d'establiment de trucada és de 5 cèntims.
El primer minut costa 3 cèntims.
El segon minut costa 2 cèntims.
La resta de minuts costen 1 cèntim cadascú.

Fer un programa en Java que demani la duració de la trucada en minuts i en
funció d'aquesta tarifa ens informi de l'import a pagar.
 */
package uf1;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class Ex52 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int min, aux;
        double preu;
        System.out.println("Duración de la llamada (minutos): ");
        min = entrada.nextInt();
        if (min <= 0) {
            System.out.println("Minutos no puede ser igual o inferior a cero");
        } else if (min == 1) {
            preu = min * 0.03 + 0.05;//0.05 Establecimiento de llamada
            System.out.println("La llamada ha sido de " + min + " minuto y el importe a pagar es de: " + preu + "€");
        } else if (min == 2) {
            preu = 1 * 0.03 + 0.05;//minuto1, se cobra el establecimiento de llamada
            preu = preu + 0.02;//minuto2
            System.out.println("La llamada ha sido de " + min + " minutos y el importe a pagar es de: " + preu + "€");
        } else if (min >= 3) {
            min = min - 2;//restamos los minutos calculados
            preu = min * 0.01;//calculamos los minutos restantes
            preu = preu + 0.02;//minuto2
            preu = preu + 1 * 0.03 + 0.05;//minuto1, se cobra el establecimiento de llamada
            System.out.println("La llamada ha sido de " + (min+2) + " minutos y el importe a pagar es de: " + String.format("%.2f", preu) + "€");
            // String.format("%.2f", preu) para que solo nos muestre 2 decimales
        }

    }

}
