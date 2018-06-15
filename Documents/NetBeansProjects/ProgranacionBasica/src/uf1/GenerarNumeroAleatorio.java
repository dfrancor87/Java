package uf1;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class GenerarNumeroAleatorio {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
//numero =(int) (Math.random()*100+1);
//System.out.println(numero);

//1ero programa MOSTRAR TODOS LOS NUMEROS ENTRE 5 Y 25
        numero = 5;
        while (numero <= 25) {
            System.out.println(numero);
            numero++;
        }
        //2do programa MOSTRAR LAS LETRAS DEL ABECEDARIO DE A...Z
        char letra = 'A';//letra vale 65
        while (letra <= 90) {

            System.out.println(letra);
            letra++;
        }

    }

}
