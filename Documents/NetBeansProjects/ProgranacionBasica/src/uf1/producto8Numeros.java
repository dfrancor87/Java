/*
Trobar i mostrar el producte de 8 números introduïts per teclat. Només s'han de fer
servir tres variables.
 */
package uf1;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class producto8Numeros {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, cont, x;//3 Solo 3 variables
        cont = 0;
        while (cont < 8) {//Para saber el producto de 8 numeros
            System.out.println("Introduce un numero para saber el producto");
            num = entrada.nextInt();
            cont++;
            for (x = 0; x <= 10; x++) { //Aqui se calcula el producto
                System.out.println(x * num);

            }// Cierra bucle for
        }//Cierra bucle while
    }
}
