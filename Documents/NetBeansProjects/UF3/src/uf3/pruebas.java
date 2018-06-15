/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf3;

import java.util.*;

/*
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;
 */
public class pruebas {

    public static void main(String[] args) {
        char[] vector = {'o', 'i', 'z', 'e', 'a', 's', 'g', 't', 'b', 'p'};
      //  String palabra = "este mensaje es para demostrar";
     //   String nuevaPalabra = "";
        String leetSpeak ="3573 m3n54j3 35 94r4 d3m057r4r l45";
        String lineaNormal="";
        //DE LEET SPEAK A TEXTO PLANO
        for (int i = 0; i < leetSpeak.length(); i++) {
            if(estaNumero(leetSpeak.charAt(i), vector)){
               // System.out.println("SI esta "+leetSpeak.charAt(i));
               int n=0;
               while (leetSpeak.charAt(i) != n+48){
                   n++;                   
               }
               lineaNormal+=vector[n];
            }else{
               // System.out.println("no esta "+leetSpeak.charAt(i));
                lineaNormal+= leetSpeak.charAt(i);
            }
            
        }
        System.out.println(lineaNormal);
        //texto plano a LEET SPEAK
     /*  for (int i = 0; i < palabra.length(); i++) {
            if ((esta(palabra.charAt(i), vector))) {
                //busca caracter a reemplazar
                int n = 0;
                while (palabra.charAt(i) != vector[n]) {
                    n++;
                }
                nuevaPalabra += n;
            } else {
                nuevaPalabra += palabra.charAt(i);
            }
        }
        System.out.println(nuevaPalabra);*/            
    }       
    //busca si el caracter de la palabra esta en el vector
    //funcion 2 para leetSpeak
    public static boolean estaNumero(char c, char[] vector) {
        for (int i = 0; i < vector.length; i++) {
            if (c == i+48) {
                return true;
            }
        }
        return false;
    }
}
