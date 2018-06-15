/*
Feu un programa en Java que calculi el preu d’una cistella de la compra d’entrades per un
espectacle del Teatre Nacional de Catalunya. A partir de 10 entrades, s’aplicarà sempre la
tarifa de grup. Heu de demanar quantes entrades es volen i aplicar les tarifes corresponents
fent les mínimes preguntes possibles
 */
package uf1;

import java.util.Scanner;

/**
 *
 * @author Danfer
 * @version 10/12/2016
 *
 *
 */
public class teatroNacional {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("*****TEATRE NACIONAL DE CATALUNYA****");
        double preu = 0;
        int entradas, de6, de10, de11;
        /*La cantidad de entradas no pueden ser menor o igual a 0*/
        do {
            System.out.println("¿Cuántas entradas quieres?");
            entradas = entrada.nextInt();
        } while (entradas <= 0);

        /*mas de 10 entradas se aplica la tarifa en grupo*/
        if (entradas > 10) {
            preu = entradas * 10;
            System.out.println("El total seria: " + preu);
        } else if (entradas <= 10) {
            System.out.println("¿Cuántos menores de 35 años o que esten en el paro?");
            de6 = entrada.nextInt();
            preu += de6 * 6.00;// preu va acumulando el valor de todas las entradas
            entradas -= de6; // al total de las entradas se descuenta las entradas de 6€
            if (entradas == 0) {
                System.out.println("El total es " + preu);
            }
        }
        if (entradas > 0 && entradas <= 10) {
            System.out.println("¿Familia numerosa, persona discapacitada o mayores de 65?");
            de10 = entrada.nextInt();
            preu += de10 * 10.00; // preu va acumulando el valor de todas las entradas
            entradas -= de10; // al total de las entradas se descuenta las entradas de 10€
            if (entradas == 0) {
                System.out.println("El total es " + preu);
            }
        }
        if (entradas > 0 && entradas <= 10) {
            System.out.println("¿Dispones de algún abono (Mercat, Llire) o carnet biblioteca?");
            de11 = entrada.nextInt();
            preu += de11 * 11.00;// preu va acumulando el valor de todas las entradas
            entradas -= de11;// al total de las entradas se descuenta las entradas de 11€
            if (entradas == 0) {
                System.out.println("El total es " + preu);
            }
            if (entradas > 0 && entradas <= 10) {
                preu += entradas * 12.00;//preu general 12€
                entradas -= entradas;
                System.out.println("El total es " + preu);
            }
        }
    }
}
