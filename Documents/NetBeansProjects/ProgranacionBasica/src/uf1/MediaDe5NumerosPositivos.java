/*
Pedir 5 números naturales al usuario y mostrarle 
el valor medio.
 */
package uf1;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class MediaDe5NumerosPositivos {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int nota, aux, sumaNota, media;
        
        sumaNota = 0;
        Scanner entrada = new Scanner(System.in);
        for (aux = 1; aux <= 5; aux++) {
            System.out.println("Ingresa la nota " + aux + ":");
            nota = entrada.nextInt();
            if (nota < 0 || nota >= 10) {
                System.out.println("Nota incorrecta ingresa otra vez las notas");
                aux=0;
               
            } else {
                 sumaNota = sumaNota + nota;
                 
            }
        }
        media = sumaNota / 5;
        System.out.println("La media es " + media);

    }

}
