/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenuf5;

import java.util.regex.Pattern;

/**
 *
 * @author Danny Franco
 */
public class Enunciado4 {

    public static void main(String[] args) throws ExceptionUrlMaldormada {
        String url = "https://www.daaa.com";
        //String url = "dada";
        try {
            validarUrl(url);
        } catch (ExceptionUrlMaldormada ex) {
            System.out.println("URL con formato incorrecto");
        }

    }

    public static void validarUrl(String url) throws ExceptionUrlMaldormada {
        //(?i) MAYUSCULAS O MINUSCULAS
        String regex = "^(http://|https://)?www\\.[^\\.]+(\\.com|\\.org)$";
         //String regex = "(http://|https://)";
        if (Pattern.matches(regex, url)) {
            System.out.println("URL COrrecta");
        }else{
               throw new ExceptionUrlMaldormada();
        }
    }

}
