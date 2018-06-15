/*
funcion que reciba un string i retorne un vector
con todas sus letras....
las consonantes primero
las vocales al final
vector sin espacios
Hola amigo
Hlmgoaaio
 */
package uf2;

import java.util.Scanner;

public class StringAVector {

    public static void main(String[] args) {
        String frase = "Hola Felipe";
        char[] vector = consonanteVocal(frase);
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);

        }

    }

    public static boolean esVocal(char c) {
        boolean vocal;
        if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
            vocal = true;

        } else {
            vocal = false;
        }
        return vocal;
    }

    public static char[] consonanteVocal(String frase) {
        ;
        //dimension del vector
        int dimension = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') {
                dimension++;
            }
        }
        //guardar la frase sin espacios
        String fraseNueva = "";
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') {
                fraseNueva = fraseNueva + frase.charAt(i);
            }

        }
        //declar vector
        char[] vector = new char[dimension];
        int v = 0;//indexvector
        int i=0;//index de frase
        while (i < fraseNueva.length()) {
            if (!esVocal(fraseNueva.charAt(i))) {
                vector[v] = fraseNueva.charAt(i);
                v++;
            }
            i++;
                     
        }
        i=0;
        while(i<fraseNueva.length()){
            if(esVocal(fraseNueva.charAt(i))){
                vector[v]=fraseNueva.charAt(i);                
                v++;
            }
            i++;
        }
        return vector;
    }

}
