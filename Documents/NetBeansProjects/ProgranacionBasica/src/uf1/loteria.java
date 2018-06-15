/*
Escriu un programa que calculi i mostri els premis d’una loteria imaginària.
El programa ha de generar aleatòriament un número de 4 xifres (internament) 
i ha de demanar a l’usuari que introdueixi el seu número. El programa ha de 
calcular el premi guanyat segons aquestes instruccions: si el número de l’usuari
coincideix exactament, guanya el premi màxim, que són 20 euros i ja no pot
acumular cap altre import. si el número de l’usuari és l’immediatament
anterior o posterior, guanya 5 euros. si la primera o l’última xifra 
coincideixen, guanya 3 euros.

Nota: en els casos b) i c), si és possible, recordeu d’acumular els imports
al premi total guanyat. Mostreu el número aleatori creat, el número introduït
per l’usuari i l’import guanyat.
 */
package uf1;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class loteria {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Programa loteria");
        Scanner entrada = new Scanner(System.in);

        int numLoteria, numUsuario, ultimoNumeroUsuario, ultimoNumeroLoteria;
        int primerNumLoteria, primerNumUsuario, premi;
        numLoteria = (int) (Math.random() * (9999) + 0);//Numero aleatorio de 4 cifras
        //System.out.printf("%04d", numLoteria);// Si el aleatorio nos sale de 2 cifras, con %04d los llena de ceros lo que falta
        System.out.println("\nIngresa tu numero");
        numUsuario = entrada.nextInt();

        ultimoNumeroUsuario = numUsuario % 10;// Modulo 10 para saber el último número del USUARIO
        ultimoNumeroLoteria = numLoteria % 10;// Modulo 10 para saber el último número LOTERIA
        primerNumLoteria = numLoteria / 1000;//Divimos para 1000 para saber el primer numero LOTERIA
        primerNumUsuario = numUsuario / 1000;//Divimos para 1000 para saber el primer numero USUARIO
        premi = 0;

        if (numLoteria + 1 == numUsuario || numLoteria - 1 == numUsuario) {//verificar NumLoteria con anterior o posterior
            premi = premi + 5;
        }
        if (primerNumUsuario == primerNumLoteria || ultimoNumeroLoteria == ultimoNumeroUsuario) {
            premi = premi + 3;
        }
        if (numLoteria == numUsuario) {
            premi = 0;//premi pasa a ser cero porque cuando se acierta no se acumula 
            premi = 20;
        }
        System.out.printf("\nEl Numero de loteria es el %04d", numLoteria);
        System.out.printf("\nTu numero de loteria es el %04d", numUsuario);
        System.out.println("\nHas ganado " + premi+"€");
    }
}
